package oop.exs5;

public class ProgramChair {
    public static void main(String[] args) {
        Chair chair1=new Chair("wood","green",56,42,89);
        chair1.setColor("pink");
        chair1.setLength(120);
        chair1.setHeight(8);
        chair1.setWide(2);
        chair1.printChair();
    }
}
