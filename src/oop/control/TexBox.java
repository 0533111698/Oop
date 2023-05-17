package oop.control;

public class TexBox extends Control {
    private int maxChar;

    public TexBox(int x, int y, String label, int maxChar) {
        super(x, y, label);
        setMaxChar(maxChar);
    }

    public int getMaxChar() {
        return maxChar;
    }

    public void setMaxChar(int maxChar) {
        if (maxChar>10)
            System.out.print("please insert 0-10 chars");
        else
        this.maxChar = maxChar;
    }

    @Override
    public String toString() {
        return super.toString() +
                "maxChar=" + maxChar;
    }

    @Override
    public void draw() {
        if (getLabel().length()==0){
            for (int i = 0; i <2; i++) {
                System.out.println(" ");
                for (int j = 0; j <8; j++) {
                    System.out.print("*");

                }

            }

        }else {
            System.out.println("\n");
            for (int i = 0; i <getLabel().length(); i++) {
                System.out.print("*");

            }
            System.out.println("\n"+getLabel());
            for (int i = 0; i <getLabel().length(); i++) {
                System.out.print("*");

            }

        }

    }
}
