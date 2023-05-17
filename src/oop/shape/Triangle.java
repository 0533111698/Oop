package oop.shape;

public class Triangle extends Shape{
    double base;
    double length;

    public Triangle(boolean visible, String color, Point point, double base, double length) {
        super(visible, color, point);
        this.base = base;
        this.length = length;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() +
                "base=" + base +
                ", length=" + length;
    }

    @Override
    public String calcArea() {
        return "The area of triangle: "+base*length/2;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
    }
}
