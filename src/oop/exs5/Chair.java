package oop.exs5;

import java.util.Stack;

public class Chair {
    private String material;
    private String color;
    private double length;
    private double wide;
    private double height;

    public Chair(String material, String color, double length, double wide, double height) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.wide = wide;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWide() {
        return wide;
    }

    public double getHeight() {
        return height;
    }


    public void setColor(String color) {

        String c1="black";
        String c2="white";
        String c3="red";
        String c4="green";
        String c5="blue";
        boolean isColor=false;
        while (color==c1||color==c2||color==c3||color==c4||color==c5){
            isColor=true;
            break;

        }if (isColor==true){
            this.color = color;
        }else {System.out.println("Please insert:black or white or red or green or blue color");}
    }

    public void setLength(double length) {
        if (length<10||length>150){
            System.out.println("Please choose length between 10-150");
        }else {
        this.length = length;}
    }

    public void setWide(double wide) {
        if (wide<10||wide>150){
            System.out.println("Please choose wide between 10-150");
        }else {
            this.length = length;}
        this.wide = wide;
    }

    public void setHeight(double height) {
        if (height<10||height>150){
            System.out.println("Please choose height between 10-150");
        }else {
            this.length = length;}
        this.height = height;
    }
    public double volumeChair(){
        double volume=(height*wide*length);
        return (volume);
    }
    public void printChair(){
        System.out.println("The material is: "+this.material);
        System.out.println("The color is: "+this.color);
        System.out.println("The length is: "+this.length);
        System.out.println("The wide is: "+this.wide);
        System.out.println("The height is: "+this.height);
        System.out.println("The volume is: "+volumeChair());
    }
}
