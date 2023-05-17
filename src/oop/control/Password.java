package oop.control;

public class Password extends TexBox{
    public Password(int x, int y, String label, int maxChar) {
        super(x, y, label, maxChar);

    }

    @Override
    public String toString() {
        return super.toString() +
                "x=" + x +
                ", y=" + y ;
    }

    @Override
    public void draw() {
        for (int i = 0; i <3; i++) {
            System.out.println(" ");
            for (int j = 0; j <getLabel().length(); j++) {
                System.out.print("*"+" ");

            }

        }
    }
}
