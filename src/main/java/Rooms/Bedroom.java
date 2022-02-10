package Rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom(int capacity, int roomNumber, RoomType roomType, double nightlyRate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType.name();
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
