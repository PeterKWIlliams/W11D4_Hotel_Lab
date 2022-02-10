import HotelManagement.Guest;
import HotelManagement.Hotel;
import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Guest guest2;
    Room bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomSize.DOUBLE.getCapacity(), 1, RoomSize.DOUBLE, 150.00);
        Room conferenceRoom = new ConferenceRoom(15, "Omega");
        Room bedroom2 = new Bedroom(RoomSize.SINGLE.getCapacity(), 2, RoomSize.SINGLE, 75.00);
        Room conferenceRoom2 = new ConferenceRoom(10, "Theta");
        ArrayList<Room> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom);
        bedrooms.add(bedroom2);
        ArrayList<Room> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);
        guest = new Guest("Sheila", RoomType.BEDROOM);
        guest2 = new Guest("Bobby", RoomType.CONFERENCE);
    }

    @Test
    public void canCheckInGuestToBedroom(){
        assertEquals("Guest checked into bedroom.", hotel.checkInGuest(guest));
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        assertEquals("Guest checked into conference room.", hotel.checkInGuest(guest2));
    }

//    @Test
//    public void canCheckInGuestToConferenceRoom(){
//        assertEquals("Guest checked into conference room.", hotel.checkInGuest(guest2));
//    }
}
