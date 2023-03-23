package Basics;

public class CircleArea {


    private final double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CircleArea alan1=new CircleArea(10);
        System.out.println( alan1.getArea());

    }
}
