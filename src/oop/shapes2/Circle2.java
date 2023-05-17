package oop.shapes2;

public class Circle2 extends Shape{
    private int radius;

    public Circle2(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
        return 0;
    }
}
