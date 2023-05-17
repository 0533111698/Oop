package oop.musicalInstrumets;

public class Piano extends ManagerMusical{
    private int numOfKeyboard;

    public Piano(String model, String manuFactor, ColorMusical color, int numOfKeyboard) {
        super(model, manuFactor, color);
        setNumOfKeyboard(numOfKeyboard);
    }

    public Piano() {
        setNumOfKeyboard(numOfKeyboard);
    }

    public int getNumOfKeyboard() {
        return numOfKeyboard;
    }

    public void setNumOfKeyboard(int numOfKeyboard) {
        if (numOfKeyboard<20||numOfKeyboard>200)
            System.out.println("Please enter number of keyboard between 20-200");
        else
        this.numOfKeyboard = numOfKeyboard;
    }

    @Override
    public String toString() {
        return super.toString()+"num of keyboard is: "+numOfKeyboard;
    }
    public void playAVoidPiano(){
        System.out.println("You are listening now to the piano music");
    }
    public void printPiano(){
        System.out.println(toString());
        playAVoidPiano();
    }
}
