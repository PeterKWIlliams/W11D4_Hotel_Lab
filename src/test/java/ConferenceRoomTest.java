import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(15, "Omega");
    }

    @Test
    public void hasName(){
        assertEquals("Omega", conferenceRoom.getName());
    }

    @Test
    public void canSetName(){
        conferenceRoom.setName("Theta");
        assertEquals("Theta", conferenceRoom.getName());
    }

}
