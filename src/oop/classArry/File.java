package oop.classArry;

import java.util.Arrays;

public class File {
    private String name;
    private Extension endingOfFile;
    private double size;

    public File(String name, Extension endingOfFile, double size) {
        this.name = name;
        this.endingOfFile = endingOfFile;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Extension getEndingOfFile() {
        return endingOfFile;
    }

    public void setEndingOfFile(Extension endingOfFile) {
        this.endingOfFile = endingOfFile;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size<0)
            System.out.println("Please insert possitive number");
        else
        this.size = size;
    }

    public String toString(){
        String printfile=name+" "+endingOfFile+" "+size;
        return printfile;
    }
    public void printFile(){
        System.out.println(toString());
    }
}
