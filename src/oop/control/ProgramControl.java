package oop.control;

public class ProgramControl {
    public static void main(String[] args) {
//        Button button1=new Button(7,6,"windows","red");
//        button1.draw();
//        System.out.println("\n"+"-------");
//        TexBox texBox1=new TexBox(7,6,"english",7);
//        texBox1.draw();
//        System.out.println("\n"+"-------");
//        Password password=new Password(7,6,"MALKI",8);
//        password.draw();
        Control[] controls=new Control[3];
        controls[0]=new Button(7,6,"windows","red");
        controls[1]=new TexBox(6,4,"english",8);
        controls[2]=new Password(9,4,"Malki",9);

        for (int i = 0; i <controls.length; i++) {
            controls[i].draw();
            if (controls[i]instanceof Button)
                System.out.println("\n"+"color is: "+((Button)controls[i]).getColor());

        }

    }
}
