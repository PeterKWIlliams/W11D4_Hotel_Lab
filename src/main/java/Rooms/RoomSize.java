package Rooms;

public enum RoomSize {
    SINGLE(1),
    DOUBLE(2);

    private final int capacity;

    RoomSize(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
