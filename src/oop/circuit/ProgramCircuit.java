package oop.circuit;

import java.util.Arrays;

public class ProgramCircuit {
    public static void main(String[] args) {
        Circuit[]circuits=new Circuit[4];
        for (int i = 0; i <circuits.length; i++) {
            circuits[i]=new Circuit("Circuit"+(i+1),Country.values()[i],(int) (Math.random()*27)+4,
                    createCar());

        }
        System.out.println(Arrays.toString(circuits));
        averageLength(circuits);
        averageDriver(circuits);
        theOldestCar(circuits);
    }

    private static void theOldestCar(Circuit[] circuits) {
        int oldest=2019;
        for (Circuit ci:circuits) {
            for (Car ca:ci.getCars()) {
                if (oldest>ca.getYear())
                    oldest=ca.getYear();

            }

        }
        System.out.println("The oldest car was born in: "+oldest);
    }

    private static void averageDriver(Circuit[] circuits) {
        int sunAgeDriver=0;
        int count=0;
        for (Circuit ci:circuits) {
            for (Car ca:ci.getCars()) {
                for (Driver dr:ca.getDrivers()) {
                    sunAgeDriver+=dr.getAge();
                    count++;

                }

            }

        } System.out.println("The average of the drivers' age is: "+sunAgeDriver/count);
    }

    private static void averageLength(Circuit[] circuits) {
        int sumLength=0;
        for (Circuit ci:circuits) {
          sumLength+= ci.getLength();
        }
        System.out.println("The average of all the circuit is: "+sumLength/circuits.length);
    }


    private static Car[] createCar() {
        Car[]cars=new Car[10];
        for (int i = 0; i <cars.length; i++) {
            cars[i]=new Car("Model"+(i+1),(int) (Math.random()*60)+1960,createDriver());

        }
        return cars;
    }

    private static Driver[] createDriver() {
        Driver[]drivers=new Driver[2];
        for (int i = 0; i <drivers.length ; i++) {
            drivers[i]=new Driver("Diver"+(i+1),(int) (Math.random()*101)+20,createMedal());

        }
        return drivers;
    }

    private static Medal[] createMedal() {
        String[]dates={"1/02/2012","02/03/2015","08/06/2014","07/07/2002"};
        Medal[]medals=new Medal[4];
        for (int i = 0; i <medals.length; i++) {
            medals[i]=new Medal((int) (Math.random()*3)+1,dates[i]);

        }
        return medals;

    }
}
