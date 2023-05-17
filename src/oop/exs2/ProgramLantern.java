package oop.exs2;

public class ProgramLantern {
    public static void main(String[] args) {
        Lantern lan1=new Lantern(Color.black,6.2,5,4);        lan1.setBattery(2);
        lan1.setLength(-1);
        lan1.setLightIntensity(10);
        lan1.dataMembers();
        System.out.println("--------");

        Lantern lan2=new Lantern(Color.blue,6.8,4,1);
        lan2.dataMembers();



    }




}
