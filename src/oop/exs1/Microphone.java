package oop.exs1;

public class Microphone {
   private String colour;
    private double volume;

    public  Microphone(String colour, double volume)
    {
        while (volume>10||volume<1){
            printMistake();
            break;

        }
        this.colour = colour;
        this.volume = volume;
    }
    public void printMistake(){
        System.out.println("Please enter volume between 1-10");

    }

    public String getColour() {
        return colour;
    }

    public double getVolume() {
        return volume;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setVolume(double volume) {

            while (volume>10||volume<1){
                printMistake();
                break;

            }
        this.volume = volume;
    }

    public void printMicrophone(){

        while (this.volume<1||this.volume>10) {
            System.out.println("the colour is: " + this.colour + " The volume is mistake: ");
            break;
        }if (this.volume<=10&&this.volume>=1)

        System.out.println("the colour is: "+this.colour+" The volume is: "+this.volume);

    }
    public void turnOn(){
        System.out.println("Turn on");
    }
    public void turnOf(){
        System.out.println("Turn of");
    }
    public void voice(){
        System.out.println("Play a voice");
    }
    public void members(){
        printMicrophone();
        turnOf();
        turnOn();
        voice();

    }
}
