import org.example.model.CeilingFan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CeilingFanTest {
    private final CeilingFan ceilingFan = new CeilingFan();
    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    @DisplayName("Test Speed Cord")
    public void testSpeedCord(int speed){
        ceilingFan.setSpeed(speed);
        ceilingFan.pullSpeedCord();
        assertEquals(speed == 3 ? 0 : speed + 1, ceilingFan.getSpeed());
    }

    @Test
    @DisplayName("Test Reverse Cord: False to True")
    public void testReverseCordFalseToTrue(){
        ceilingFan.setReverse(false);
        ceilingFan.pullReverseCord();
        assertTrue(ceilingFan.isReverse());
    }

    @Test
    @DisplayName("Test Reverse Cord: True to False")
    public void testReverseCordTrueToFalse(){
        ceilingFan.setReverse(true);
        ceilingFan.pullReverseCord();
        assertFalse(ceilingFan.isReverse());
    }
}
