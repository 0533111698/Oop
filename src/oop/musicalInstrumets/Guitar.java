package oop.musicalInstrumets;

public class Guitar extends ManagerMusical {
    int numOfStrings;

    public Guitar(String model, String manuFactor, ColorMusical color, int numOfStrings) {
        super(model, manuFactor, color);
        setNumOfStrings(numOfStrings);
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        if (numOfStrings<4||numOfStrings>10)
            System.out.print("Please insert between 4-10 Strings  ");
        else
        this.numOfStrings = numOfStrings;
    }

    @Override
    public String toString() {
        return super.toString()+"numOfStrings= "+numOfStrings;
    }
    public void playAVoiceGuitar(){
        System.out.println("\n"+"You are listening now a music of guitar");
    }
    public void printGuitar(){
        System.out.print(toString());
        playAVoiceGuitar();
    }
}
