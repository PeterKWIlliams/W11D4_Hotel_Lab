import HotelManagement.Guest;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Sheila", RoomType.BEDROOM);
    }

    @Test
    public void hasName(){
        assertEquals("Sheila", guest.getName());
    }

    @Test
    public void canSetName(){
        guest.setName("Sheila Barrymore");
        assertEquals("Sheila Barrymore", guest.getName());
    }

    @Test
    public void hasType(){
        assertEquals(RoomType.BEDROOM, guest.getRoomType());
    }

}
