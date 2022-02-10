import HotelManagement.Hotel;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;

import java.util.ArrayList;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before(){
        Bedroom bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), 1, RoomType.DOUBLE, 150.00);
        ConferenceRoom conferenceRoom = new ConferenceRoom(15, "Omega");
        Bedroom bedroom2 = new Bedroom(RoomType.SINGLE.getCapacity(), 2, RoomType.SINGLE, 75.00);
        ConferenceRoom conferenceRoom2 = new ConferenceRoom(10, "Theta");
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom);
        bedrooms.add(bedroom2);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);
    }



}
