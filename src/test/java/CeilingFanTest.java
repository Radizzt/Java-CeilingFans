import org.example.model.CeilingFan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CeilingFanTest {
    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    @DisplayName("Test Speed Cord")
    public void testSpeedCord(int speed){
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.setSpeed(speed);
        ceilingFan.pullSpeedCord();
        assertEquals(speed == 3 ? 0 : speed + 1, ceilingFan.getSpeed());
    }
    @Test
    @DisplayName("Test Speed Reset Back to Zero")
    public void testSpeedCordResetBackToZero(){
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.setSpeed(3);
        ceilingFan.pullSpeedCord();
        assertEquals(0, ceilingFan.getSpeed());
    }
    @Test
    @DisplayName("Test Reverse Cord: False to True")
    public void testReverseCordFalseToTrue(){
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.setReverse(false);
        ceilingFan.pullReverseCord();
        assertTrue(ceilingFan.isReverse());
    }

    @Test
    @DisplayName("Test Reverse Cord: True to False")
    public void testReverseCordTrueToFalse(){
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.setReverse(true);
        ceilingFan.pullReverseCord();
        assertFalse(ceilingFan.isReverse());
    }
}
