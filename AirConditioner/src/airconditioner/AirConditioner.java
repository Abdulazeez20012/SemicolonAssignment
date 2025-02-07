public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner(boolean isOn, int temperature) {
        this.isOn = false;
        this.temperature = 24; // Default temperature is 24 degrees
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
}