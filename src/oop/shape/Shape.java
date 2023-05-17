package oop.shape;

public abstract class Shape {
    boolean visible;
    String color;
    Point point;

    public Shape(boolean visible, String color, Point point) {
        this.visible = visible;
        this.color = color;
        this.point = point;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "visible=" + visible +
                        ", color='" + color + '\'' +
                        ", point=" + point;
    }
    public abstract String calcArea();
    public  void move(int deltaX,int deltaY){
         this.point.setX(this.point.getX()+deltaX);
         this.point.setY(this.point.getY()+deltaY);
    }
}

