package oop.musicalInstrumets;

public class ProgramMusical {
    public static void main(String[] args) {
        Guitar guitar1=new Guitar("Ai","ai",ColorMusical.white,3);
        guitar1.printGuitar();
        System.out.println("-----");
        Drum drum1=new Drum("Bi","bi",ColorMusical.white,102);
        drum1.printDrum();
        System.out.println("------");
        Piano piano1=new Piano("Ci","ci",ColorMusical.brown,16);
        piano1.printPiano();
        System.out.println("--------");
        GrandPiano grandPiano1=new GrandPiano("Di","di",ColorMusical.red,96,9.8);
        grandPiano1.printGradPiano();


    }
}
