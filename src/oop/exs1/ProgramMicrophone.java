package oop.exs1;

public class ProgramMicrophone {
    public static void main(String[] args) {
        Microphone mic1=new Microphone("ghh",12);
        mic1.setVolume(6);
        mic1.members();
        System.out.println("------");
        Microphone mic2=new Microphone("hora",6.5);
        mic2.members();

    }
}
