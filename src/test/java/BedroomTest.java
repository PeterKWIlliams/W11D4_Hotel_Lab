import HotelManagement.Guest;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), 1, RoomType.DOUBLE, 150.00);
        guest = new Guest("Sheila");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasSpecificRoomType(){
        assertEquals("DOUBLE", bedroom.getRoomType());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(150.00, bedroom.getNightlyRate(), 0.00);
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canReturnGuestArray(){
        bedroom.addGuest(guest);
        ArrayList<Guest> sheila = new ArrayList<>();
        sheila.add(guest);
        assertEquals(sheila, bedroom.getGuests());
    }

}
