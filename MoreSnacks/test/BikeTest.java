import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }
    @Test
    public void testBikeIsOffInitially() {
        assertFalse(bike.isOn());

    }
    @Test
    public void testIfBikeCanBe_TurnOn() {
        bike.turnOn();
        assertTrue(bike.isOn());

    }

    @Test
    public void testIfBikeCanBe_TurnOff() {
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testAcceleration_whenOff(){
       int initialSpeed = bike.getSpeed();
       bike.accelerate();
       assertEquals(initialSpeed, bike.getSpeed());
    }

    @Test
    public void testAcceleration_whenOn(){
        bike.turnOn();
        int initialSpeed = bike.getSpeed();
        bike.accelerate();
        assertEquals(initialSpeed + 1, bike.getSpeed());
    }
    @Test
    public void testAccelerationSpeedInRange21To30(){
        bike.turnOn();
        for(int i = 0; i < 20; i++){
            bike.accelerate();
        }


        assertEquals(20, bike.getSpeed());

    }

    @Test
    public void testDeaccelerate_whenOff(){
        int initialSpeed = bike.getSpeed();
        bike.accelerate();
        assertEquals(initialSpeed, bike.getSpeed());
    }

    @Test
    public void testDeaccelerate_whenOn(){
        bike.turnOn();
        bike.accelerate();
        int initialSpeed = bike.getSpeed();
        bike.decelerate();
        assertEquals(initialSpeed - 1, bike.getSpeed());
    }

    @Test
    public void testDeaccelerateSpeedInRange21To30(){
        bike.turnOn();
        for (int i = 1; i < 10; i++) {
            bike.accelerate();
        }
        int initialSpeed = bike.getSpeed();
        bike.decelerate();
        assertEquals(initialSpeed -1, bike.getSpeed());
    }

    @Test
    public void testDeaccelerateSpeedAbove30(){
        bike.turnOn();
        for (int i = 0; i < 15; i++) {
            bike.accelerate();
        }
        int initialSpeed = bike.getSpeed();
        bike.decelerate();
        assertEquals(initialSpeed -1, bike.getSpeed());
    }



}