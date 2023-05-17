package oop.befor;

public class Circle extends Shape {
    private double radius;

    public Circle(Point[] points, Color color, double radius) {
        super(points, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calcArea() {
        return Math.pow(radius,2)*Math.PI;
    }

}
