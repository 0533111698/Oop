package oop.musicalInstrumets;

public class GrandPiano extends Piano {
    private double length;

    public GrandPiano(String model, String manuFactor, ColorMusical color, int numOfKeyboard, double length) {
        super(model, manuFactor, color, numOfKeyboard);
        setLength(length);
    }

    public GrandPiano() {
        this.length = length;
    }

    public void setLength(double length) {
        if (length<=0||length>300)
            System.out.println("Please enter length between 0-300");
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString()+ "  length=" + length;
    }
    public void playAVoidGrandPiano(){
        System.out.println("You are listening now to the Grad piano music");
    }
    public void printGradPiano(){
        System.out.println(toString());
        playAVoidGrandPiano();
    }
}
