package oop.befor;

public class Triangle extends Shape{
    private double baseLength;
    private double height;

    public Triangle(Point[] points, Color color, double baseLength, double height) {
        super(points, color);
        this.baseLength = baseLength;
        this.height = height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "baseLength=" + baseLength +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        return this.baseLength*this.height/2;
    }
}
