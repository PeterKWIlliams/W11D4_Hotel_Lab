package Rooms;
import HotelManagement.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;
    protected boolean booked;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.booked = false;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuests(){
        return guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public boolean getBooked() {
        return this.booked;
    }

    public void bookRoom(){
        this.booked = true;
    }

    public void unbookRoom(){
        this.booked = false;
    }
}
