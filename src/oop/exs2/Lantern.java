package oop.exs2;

public class Lantern {
    private Color color;
    private double length;
    private int lightIntensity;
    private int battery;

    public Lantern(Color color, double length, int lightIntensity, int battery) {
        this.color = color;
        this.length = length;
        this.lightIntensity = lightIntensity;
        this.battery = battery;
    }

    public Color getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getLightIntensity() {
        return lightIntensity;
    }

    public int getBattery() {
        return battery;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setLength(double length) {
        boolean positiveNumber=true;
        while (length<0){
            System.out.println("Please enter positive number");
            positiveNumber=false;
            break;
        }if (positiveNumber==true)
        this.length = length;
    }

    public void setLightIntensity(int lightIntensity) {
        boolean positiveLightIntensity=true;
        while (length<0){
            System.out.println("Please enter positive number");
            positiveLightIntensity=false;
            break;
        }if (positiveLightIntensity==true)
        this.lightIntensity = lightIntensity;
    }

    public void setBattery(int battery) {
        boolean batteriesNum=true;
        while (battery>4||battery<1){
            System.out.println("Please enter 1-4 batteries");
            batteriesNum=false;
            break;
        }if (batteriesNum==true)
        this.battery = battery;
        
    }

    public void turnOn (){
        System.out.println("The lantern turns on");

    }
    public void turnOff(){
        System.out.println("The lantern turns off");
    }

    public void replaceBattery(){
        System.out.println("The butteries must be replaced");
    }
    public void printLantern(){
        System.out.println("The color is: "+this.color);
        System.out.println("The length is : "+this.length);
        System.out.println("The light intensity is: "+this.lightIntensity);
        System.out.println("The batteries' num: "+this.battery);
    }
    public void dataMembers(){
        printLantern();
        turnOn();
        turnOff();
        replaceBattery();

    }
}
