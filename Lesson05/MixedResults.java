package Lesson05;

public class MixedResults {
    public static void main (String[] args) {
        double d1 = 37.9;
        int i1 = 12;
        int i2 = 18;

        System.out.print("Problem 1: ");
        System.out.println(57.2 * (i1 / i2) +1);

        System.out.print("Problem 2: ");
        System.out.println(57.2 * ((double) i1 / i2) +1);

        System.out.print("Problem 3: ");
        System.out.println(15 - i1 * (d1 *3) + 4);

        System.out.print("Problem 4: ");
        System.out.println(15 - i1 * (d1 *3) + 4);

        System.out.print("Problem 5: ");
        System.out.println(15 - i1 * ((int)d1 *3 ) + 4);
    }
}
