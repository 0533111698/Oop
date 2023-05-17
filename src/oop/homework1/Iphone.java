package oop.homework1;

public class Iphone extends ManagementSoftware {
    private int numOfApplication;

    public Iphone(String model, String manufacturer, int screenSize, int numOfApplication) {
        super(model, manufacturer, screenSize);
        setNumOfApplication(numOfApplication);
    }

    public void Iphone() {
        this.numOfApplication = numOfApplication;
    }

    public int getNumOfApplication() {
        return numOfApplication;
    }

    public void setNumOfApplication(int numOfApplication) {
        if (numOfApplication<0)
            System.out.println("Please insert positive number");
        else
        this.numOfApplication = numOfApplication;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numOfApplication=" + numOfApplication ;
    }
    public void printIphone(){
       System.out.println("  "+toString());
       printLogoIphone();
    }
    public void printLogoIphone(){
        System.out.println("Logo iphone");
    }
}
