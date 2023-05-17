package oop.befor;

import java.util.Arrays;

public class ProgramShape {
    public static void main(String[] args) {
       Shape []shapes=new Shape[10];
        for (int i = 0; i <shapes.length; i++) {
            int num=(int) (Math.random()*3)+1;
            switch (num){
                case 1://Circle
                shapes[i]=new Circle(createPointArray(1),
                        Color.values()[(int) (Math.random()*Color.values().length)],(Math.random()*6)+1);
                break;
                case 2:
                    shapes[i]=new Triangle(createPointArray(3),
                            Color.values()[(int) (Math.random()*Color.values().length)],
                            (Math.random()*6)+1,(Math.random()*6)+1);
                    break;
                case 3://Rectangle
                    shapes[i]=new Rectangle(createPointArray(4),
                            Color.values()[(int) (Math.random())*Color.values().length],
                            (Math.random()*6)+1,(Math.random()*6)+1);
                    break;

            }

        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i]+" ");
            System.out.print("area is"+shapes[i].calcArea()+" ");
            shapes[i].moveShape(2,4);
            System.out.print(shapes[i]+" ");
            System.out.println("\n"+"-----");


        }
    }

    private static Point[] createPointArray(int pointLength) {
        Point[]points=new Point[pointLength];
        for (int i = 0; i <points.length; i++) {
            points[i]=new Point((int) (Math.random()*7)+1,
                    (int) (Math.random()*7)+1);
        }
        return points;

    }
}
//        Point []points=new Point[pointLength];
//        for (int i = 0; i <points.length; i++) {
//        points[i]=new Point((int) (Math.random()*10)+1,(int) (Math.random()*10)+1);