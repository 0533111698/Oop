package oop.furniture;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Furniture []furnituresArray=new Furniture[20];
        Random rand=new Random();
        String []colorArray={"red","brown","black","white"};
        double []lengthArray={8.6,7.2,5.4,4.3};
        boolean[]isZugy={true,false};
        System.out.println(colorArray[(int) (Math.random()* colorArray.length)]);

        String c=colorArray[(rand.nextInt(colorArray.length))];
        for (int i = 0; i <furnituresArray.length; i++) {
            int x=(int) (Math.random()*3)+1;
            switch (x){
                case 1:furnituresArray[i]=new Chair((int)(Math.random()*30)+1,(int)(Math.random()*30)+1,
                        (int)(Math.random()*50)+1,colorArray[(int) (Math.random()* colorArray.length)],(int) (Math.random()*6)+1);
                    break;
                case 2:furnituresArray[i]=new Bed((int)(Math.random()*30)+1,(int)(Math.random()*30)+1,
                        (int)(Math.random()*30)+1,colorArray[(int) (Math.random()* colorArray.length)],isZugy[(int) (Math.random()*isZugy.length)]);
                    break;
                case 3:furnituresArray[i]=new Table((int)(Math.random()*30)+1,(int)(Math.random()*30)+1,
                        (int)(Math.random()*30)+1,colorArray[(int) (Math.random()* colorArray.length)],(int) (Math.random()*10)+2);
            }

        }

        for (int i = 0; i < furnituresArray.length; i++) {
            furnituresArray[i].draw();
            if (furnituresArray[i]instanceof Bed)
                System.out.println(((Bed)furnituresArray[i]).isZugi);

        }




    }
}
