package oop.shape;

import java.util.Scanner;

public class ProgramShape {
    public static void main(String[] args) {
        Shape []shapeArrey=new Shape[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < shapeArrey.length; i++) {
            System.out.println("Please press:1 rectangle. 2 circle. 3 triangle");
            int x=scanner.nextInt();
            switch (x){
                case 1:shapeArrey[i]=new Rectangle(true,"red",new Point(6,5),4.2,6.9);
                break;
                case 2:shapeArrey[i]=new Circle(true,"pink",new Point(4,3),2.5);
                break;
                case 3:shapeArrey[i]=new Triangle(false,"yellow",new Point(9,3),3.0,6.0);
                break;
                default:System.out.println("Good bye");
               
            }
            

        }
        for (int i = 0; i <shapeArrey.length; i++) {
            System.out.println(shapeArrey[i]);
            
        }
//
//        System.out.println(rectangle1);
//        System.out.println(rectangle1.calcArea());
//        rectangle1.move(-2,3);
//        System.out.println("point x is: "+rectangle1.point.getX()+" point y is "+rectangle1.point.getY());
//        System.out.println("-----");

//        System.out.println(circle1);
//        circle1.move(6,-1);
//        System.out.println("------");
//
//        System.out.println(triangle1);
//        System.out.println(triangle1.calcArea());
    }
}
