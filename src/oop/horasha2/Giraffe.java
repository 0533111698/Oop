package oop.horasha2;

public class Giraffe extends Animals {
    private int neckHeight;

    public Giraffe(String name, String animalSize, int neckHeight) {
        super(name, animalSize);
        this.neckHeight = neckHeight;
    }

    public int getNeckHeight() {
        return neckHeight;
    }

    public void setNeckHeight(int neckHeight) {
        this.neckHeight = neckHeight;
    }

    public void printEat(){
        System.out.println("I am eating leaves");
    }
}
