public class Bike {
    private int speed;
    private boolean isOn;

    public boolean isOff() {
        return true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {
        return speed;
    }


    public void accelerate() {
        if (isOn) {
            if (speed >= 0 && speed <= 20  ){
                speed += 1;
            }
            else if (speed >= 21 && speed <= 30  ){
                speed += 2;
            }
            else if (speed >= 31 && speed <= 40  ){
                speed += 3;
            } else {
                speed += 4;
            }
        }
    }

    public void decelerate() {
        if (isOn) {
            if (speed >= 0 && speed <= 20  ){
                speed -= 1;
            } else if (speed >= 21 && speed <= 30  ) {
                speed -= 2;

            }
            else if (speed >= 31 && speed <= 40  ) {
                speed -= 3;
            }
            else {
                speed -= 4;
            }
        }
    }

}




