package HotelManagement;

import Rooms.RoomType;

public class Guest {

    private String name;
    private RoomType roomType;
    private int lengthOfStay;
    public Guest(String name, RoomType roomType,int lengthOfStay){
        this.name = name;
        this.roomType = roomType;
        this.lengthOfStay = lengthOfStay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getLengthOfStay(){
        return this.lengthOfStay;
    }
}
