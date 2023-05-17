package oop.furniture;

public class Bed extends Furniture{
    boolean isZugi;

    public Bed(double length, double wide, double height, String color, boolean isZugi) {
        super(length, wide, height, color);
        this.isZugi = isZugi;
    }

    public boolean isZugi() {
        return isZugi;
    }

    public void setZugi(boolean zugi) {
        isZugi = zugi;
    }

    @Override
    public String toString() {
        return super.toString()+"isZugi=" + isZugi ;
    }

    @Override
    public void draw() {
        System.out.println("   ||");
        System.out.println("   ||                   ||");
        System.out.println("||/||___                ||");
        System.out.println("|| /`   )____________||_/|");
        System.out.println("||/___ //_/_/_/_/_/_/||/ |");
        System.out.println("||(___)/_/_/_/_/_/_/_||  |");
        System.out.println("||     |_|_|_|_|_|_|_|| /|");
        System.out.println("||     | | | | | | | ||/||");
        System.out.println("||~~~~~~~~~~~~~~~~~~~||");
        System.out.println("||                   ||");

    }
}
