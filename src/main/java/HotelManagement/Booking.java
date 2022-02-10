package HotelManagement;

import Rooms.Room;

public class Booking {

    private int numberOfNights;
    private Room room;

    public Booking(int numberOfNights, Room room){
        this.numberOfNights = numberOfNights;
        this.room = room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
