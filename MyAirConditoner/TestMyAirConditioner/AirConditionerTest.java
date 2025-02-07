import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAirConditionerTest {

@Test
public void testthatAirConditioner_Exist() {
  AirConditioner airConditioner = new AirConditioner();
}

@Test
    public void testthatAirConditioner_isOff() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());

}

@Test
    public void testthatAirConditioner_isOn() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());
    airConditioner.isOn();
    assertTrue(airConditioner.power());
}

@Test
    public void testthatAirConditioner_isOnOff() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());
    airConditioner.isOff();
    assertTrue(airConditioner.power());

}

@Test
    public void testthatAirConditioner_isOnOffOff() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());
    airConditioner.isOn();
    assertTrue(airConditioner.power());
  //  assertFalse(airConditioner.power());

}
@Test
    public void testthatAirConditioner_isOnOffOn() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());
    airConditioner.isOn();
    assertTrue(airConditioner.power());
}

@Test
    public void testthatAirConditioner_isOnOffOnOff() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());
    airConditioner.isOn();
    assertTrue(airConditioner.power());

}

@Test
    public void testthatAirConditioner_isOnOffOffOn() {
    AirConditioner airConditioner = new AirConditioner();
    assertFalse(airConditioner.power());
    airConditioner.isOn();
    assertTrue(airConditioner.power());

}

@Test
    public void testthatAirConditioner_CheckTemperature() {




}
}
