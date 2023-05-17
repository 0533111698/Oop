package oop.befor;

import oop.befor.Point;

import java.util.Arrays;

public abstract class Shape {
   private Point points[];
    private Color color;

    public Shape(Point[] points, Color color) {
        this.points = points;
        this.color = color;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + Arrays.toString(points) +
                ", color='" + color + '\'' +
                '}';
    }public abstract double calcArea();
    public void moveShape(int deltaX,int deltaY) {
        for (int i = 0; i <points.length; i++) {
            points[i].setX(points[i].getX()+deltaX);
            points[i].setY(points[i].getY()+deltaY);
        }


        }

//    }
// for (int i = 0; i < points.length; i++) {
//        points[i].setX(points[i].getX()+deltaX);
//        points[i].setY(points[i].getY()+deltaY);


}
