package Lesson15;

public class Circle {
    public double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double diameter()
    {
        return radius * 2;
    }
}
