package oop.circuit;

import java.util.Arrays;

public class Driver {
    private String name;
    private int age;
    private Medal[] medals;

    public Driver(String name, int age, Medal[] medals) {
        this.name = name;
        this.age = age;
        this.medals = medals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Medal[] getMedals() {
        return medals;
    }

    public void setMedals(Medal[] medals) {
        this.medals = medals;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", medals=" + Arrays.toString(medals) +
                '}';
    }
}
