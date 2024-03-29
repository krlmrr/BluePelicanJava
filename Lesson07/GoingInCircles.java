package Lesson07;

import java.util.*;

public class GoingInCircles {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the area? ");

        double area = scan.nextDouble();

        double radius = (Math.sqrt((area / Math.PI)));

        System.out.println(STR."Radius of your circle is \{radius}");

        scan.close();
    }
}
