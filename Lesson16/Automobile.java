package Lesson16;

public class Automobile {
    public int mpg;
    public int tank = 0;

    public Automobile (int mpg) {
        this.mpg = mpg;
    }

    public int fillUp(int gallons) {
        return this.tank = tank + gallons;
    }

    public int takeTrip(int miles) {
        return this.tank = this.tank - miles / this.mpg;
    }

    public int reportFuel() {
        return this.tank;
    }
}
