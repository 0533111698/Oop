package oop.musicalInstrumets;

public class Drum extends ManagerMusical{
    private double diameterDrum;

    public Drum(String model, String manuFactor, ColorMusical color, double diameterDrum) {
        super(model, manuFactor, color);
        setDiameterDrum(diameterDrum);
    }

    public double getDiameterDrum() {
        return diameterDrum;
    }

    public void setDiameterDrum(double diameterDrum) {
        if (diameterDrum<0||diameterDrum>100)
            System.out.println("Please enter diameter between 0-100");
        else
        this.diameterDrum = diameterDrum;
    }

    @Override
    public String toString() {
        return super.toString()+" diameter of drum is: "+diameterDrum;
    }
    public void playAVoiceDrum(){
        System.out.println("You are listening music now");
    }
    public void printDrum(){
        System.out.println(toString());
        playAVoiceDrum();
    }
}
