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

    public String checkInGuest(Guest guest){
        if (guest.getRoomType() == RoomType.BEDROOM) {
            for (Room room : bedrooms){
                if (!room.getBooked()){
                    room.addGuest(guest);
                    room.bookRoom();
                    return "Guest checked into bedroom.";
                }
            }
        }
        else if (guest.getRoomType() == RoomType.CONFERENCE) {
            for (Room room : conferenceRooms){
                if (!room.getBooked()){
                    room.addGuest(guest);
                    room.bookRoom();
                    return "Guest checked into conference room.";
                }
            }
        }
        return "Guest cannot be checked in. All rooms are full.";
    }

}
