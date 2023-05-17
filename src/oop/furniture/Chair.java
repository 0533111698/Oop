package oop.furniture;

public class  Chair extends Furniture {
    private int numOfLegs;

    public Chair(double length, double wide, double height, String color, int numOfLegs) {
        super(length, wide, height, color);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return super.toString()+
                "numOfLegs=" + numOfLegs ;
    }

    @Override
    public void draw() {
        System.out.println("  i______i");
        System.out.println("  I______I");
        System.out.println("  I      I");
        System.out.println("  I______I");
        System.out.println(" /      /I");
        System.out.println("(______( I");
        System.out.println("I I    I I");
        System.out.println("I      I");

    }
}
