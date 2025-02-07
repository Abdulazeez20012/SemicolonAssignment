import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    private AirConditionerTest airConditioner;

    @BeforeEach
    void setUp() {
        airConditioner = new AirConditionerTest(); // Initialize a new AC instance before each test
    }
    @Test
    private void testTurnOn() {
        // Given that the AC is off, when I turn it on, then it should be on
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn(), "AC should be on");
    }


    @Test
    private void testTurnOff() {
        // Given that the AC is on, when I turn it off, then it should be off
        airConditioner.turnOn(); // Turn it on first
        airConditioner.turnOff();
        assertFalse(airConditioner.isOn(), "AC should be off");
    }




}
