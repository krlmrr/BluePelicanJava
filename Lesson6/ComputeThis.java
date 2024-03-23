package Lesson6;

public class ComputeThis {
    public static void main(String[] args) {
        System.out.print("d1 = ");
        System.out.println(
                3 * Math.PI * Math.sin(Math.toRadians(187)) + Math.abs(Math.cos(Math.toRadians(122)))
        );

        System.out.print("d2 = ");
        System.out.println(Math.pow(14.72, 3.801) + Math.log(72));
    }
}
