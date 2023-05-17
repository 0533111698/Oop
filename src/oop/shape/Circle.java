package oop.shape;

public class Circle extends Shape{
    double radius;

    public Circle(boolean visible, String color, Point point, double radius) {
        super(visible, color, point);
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
                "radius=" + radius;
    }

    @Override
    public String calcArea() {
        return "The area of circle"+(radius*radius*3.14);
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
        System.out.println("x="+point.getX()+" y "+point.getY());
    }
}
