package Rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomSize roomSize;
    private double nightlyRate;

    public Bedroom(int capacity, int roomNumber, RoomSize roomSize, double nightlyRate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomSize() {
        return roomSize.name();
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
