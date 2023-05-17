package oop.horasha2;

public class Bird extends Animals {
    private int wingspan;
    private int flightAltitude;

    public Bird(String name, String animalSize, int wingspan, int flightAltitude) {
        super(name, animalSize);
        this.wingspan = wingspan;
        this.flightAltitude = flightAltitude;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }
    public void printFly(){
        System.out.println("I am flying at "+this.flightAltitude+" altitude");
    }

    @Override
    public String toString() {
        return super.toString()+
                "wingspan=" + wingspan +
                ", flightAltitude=" + flightAltitude ;
    }
    public void printBirds(){
        toString();
    }
}
