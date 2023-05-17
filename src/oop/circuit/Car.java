package oop.circuit;

import java.util.Arrays;

public class Car {
private String model;
private int year;
private Driver[]drivers;

    public Car(String model, int year, Driver[] drivers) {
        this.model = model;
        setYear(year);
        this.drivers = drivers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>=1960&&year<=2019)
        this.year = year;
        else
            System.out.println("Please insert year between 1960-2019");
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
}
