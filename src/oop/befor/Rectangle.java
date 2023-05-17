package oop.befor;

public class Rectangle extends Shape{
    private  double length;
    private double width;

    public Rectangle(Point[] points, Color color, double length, double width) {
        super(points, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return this.length*this.width;
    }
}
