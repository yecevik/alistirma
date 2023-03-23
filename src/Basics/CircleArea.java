package Basics;

public class CircleArea {


    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CircleArea eng=new CircleArea(10);
        System.out.println( eng.getArea());

    }
}
