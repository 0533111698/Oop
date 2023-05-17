package oop.shape;

public class Rectangle extends Shape{
    double length,wide;

    public Rectangle(boolean visible, String color, Point point, double length, double wide) {
        super(visible, color, point);
        this.length = length;
        this.wide = wide;
    }



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return super.toString() +
                "length=" + length +
                ", wide=" + wide ;
    }

    @Override
    public String calcArea() {
        return "The area of rectangle is: "+this.length*this.wide;

    }

    @Override
    public void move(int deltaX, int deltaY) {
         super.move(deltaX, deltaY);
    }
}
