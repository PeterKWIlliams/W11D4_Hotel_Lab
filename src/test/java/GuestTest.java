import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Sheila");
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

}
