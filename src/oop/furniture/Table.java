package oop.furniture;

public class Table extends Furniture {
    private int numPlaces;

    public Table(double length, double wide, double height, String color, int numPlaces) {
        super(length, wide, height, color);
        this.numPlaces = numPlaces;
    }

    public int getNumPlaces() {
        return numPlaces;
    }

    public void setNumPlaces(int numPlaces) {
        this.numPlaces = numPlaces;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numPlaces=" + numPlaces;
    }

    @Override
    public void draw() {
        System.out.println("   =====================");
        System.out.println("  /                   /");
        System.out.println(" /                   /|");
        System.out.println("===================== |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");

    }
}
