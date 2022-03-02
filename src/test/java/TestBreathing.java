import ZooPackage.Animal;
import ZooPackage.Wolf;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBreathing {
    @Test
    public void testBreathing(){
    String actual = Animal.breath;
    String expected = "I breath air with my lungs";

    assertEquals (actual, expected);
    }
    @Test
    public void testMoving(){
        String actual = Animal.movement;
        String expected = "I walk with my 4 feet";

        assertEquals (actual, expected);
    }
}
