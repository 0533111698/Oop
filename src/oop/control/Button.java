package oop.control;

public class Button extends Control {
   private String color;

    public Button(int x, int y, String label, String color) {
        super(x, y, label);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "color='" + color + '\'';
    }

    @Override
    public void draw() {
        for (int i = 0; i <(getLabel().length())+2; i++) {
            System.out.print("*");
        }
        System.out.println("\n"+"*"+getLabel()+"*");
        for (int i = 0; i <(getLabel().length())+2; i++) {
            System.out.print("*");
        }

    }
}
