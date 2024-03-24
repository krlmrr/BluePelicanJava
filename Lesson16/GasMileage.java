package Lesson16;

public class GasMileage {
    public static void main (String[] args) {
        Automobile myBmw = new Automobile(24);

        System.out.println(myBmw.fillUp(24));

        myBmw.takeTrip(100);

        System.out.println(myBmw.reportFuel());
    }
}
