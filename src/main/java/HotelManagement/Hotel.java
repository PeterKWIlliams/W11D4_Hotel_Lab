package HotelManagement;

import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;
import Rooms.RoomType;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> conferenceRooms;

    public Hotel(ArrayList<Room> bedrooms, ArrayList<Room> conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Room> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Room> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<Room> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<Room> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public int numberOfBedrooms(){
        return bedrooms.size();
    }

    public int numberOfConferenceRooms(){
        return conferenceRooms.size();
    }

    public Booking createBooking(Room room,Guest guest){
        room.addGuest(guest);
        room.bookRoom();
        return new Booking(guest.getLengthOfStay(), room);

    }

    public Booking checkInGuest(Guest guest){
        if (guest.getRoomType() == RoomType.BEDROOM) {
            for (Room room : bedrooms){
                if (!room.getBooked()){
                    return createBooking(room,guest);

                }
            }
        }
        else if (guest.getRoomType() == RoomType.CONFERENCE) {
            for (Room room : conferenceRooms){
                if (!room.getBooked()){
                    return createBooking(room,guest);
                }
            }
        }
        return null;
    }

    public void checkOutGuest(Guest guest){
        if (guest.getRoomType() == RoomType.BEDROOM) {
            for (Room room : bedrooms){
                if (room.getGuests().contains(guest)){
                    room.removeGuest(guest);
                    room.unbookRoom();
                }
            }
        }
        else if (guest.getRoomType() == RoomType.CONFERENCE) {
            for (Room room : conferenceRooms){
                if (room.getGuests().contains(guest)){
                    room.removeGuest(guest);
                    room.unbookRoom();
                }
            }
        }
    }

}
