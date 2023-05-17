package oop.circuit;

import java.util.Arrays;

public class Circuit {
    private String name;
    private Country country;
    private int length;
    private Car[] cars;

    public Circuit(String name, Country country, int length, Car[] cars) {
        this.name = name;
        this.country = country;
        setLength(length);
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length>=4&&length<=30)
        this.length = length;
        else
            System.out.println("Please insert length between 4-30");
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", length=" + length +
                ", cars=" + Arrays.toString(cars) +"\n";
    }
}
