package oop.homework1;

public abstract class ManagementSoftware {
    private String model;
    private String manufacturer;
    private int screenSize;

    public ManagementSoftware(String model, String manufacturer, int screenSize) {
        this.model = model;
        this.manufacturer = manufacturer;
        setScreenSize(screenSize);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        if (screenSize<5||screenSize>20)
            System.out.println("Please insert size between 5-20");
        else
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return                 "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", screenSize= " +screenSize;
    }

    public void printManagementSoftware(){
        toString();

    }
}
