package oop.furniture;

public abstract class Furniture {
    private double length,wide,height;
    private String color;

    public Furniture(double length, double wide, double height, String color) {
        this.length = length;
        this.wide = wide;
        this.height = height;
        this.color = color;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "length=" + length +
                ", wide=" + wide +
                ", height=" + height +
                ", color='" + color  ;
    }
    public abstract void draw();
}
