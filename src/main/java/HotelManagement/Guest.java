package HotelManagement;

import Rooms.RoomType;

public class Guest {

    private String name;
    private RoomType roomType;

    public Guest(String name, RoomType roomType){
        this.name = name;
        this.roomType = roomType;
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
}
