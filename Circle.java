package lab4;

public class Circle {

    final double PI = 3.1415;
    private double radius = 0;
    private double diameter = 0;
    private double length = 0;
    private double square = 0;

    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public double getLength(){
        return 2 * PI * radius;
    }
    public double getSquare(){
        return PI * radius * radius;
    }
}
