package oop.shapes2;

public class Program {
    static String[]colors={"red","white","yellow"};
    public static void main(String[] args) {
        Shape[]shapes=new Shape[5];
        for (int i = 0; i <shapes.length; i++) {
            int choice=(int) (Math.random()*2);
            if (choice==0) {
               shapes[i]= createCircle();
            }
        }



    }
    public static Circle2 createCircle(){
        return new Circle2(colors[(int) (Math.random()*colors.length)],(int) (Math.random()*10),(int) (Math.random()*10),(int) (Math.random()*10));
    }

}
