package oop.classArry;

public class ProgramFolder {
    public static void main(String[] args) {
        Folder fol1=new Folder("heppening Hanukkah");
        fol1.addFile(new File("Hanukkah Events ",Extension.csv,6.9));
        fol1.addFile(new File("Hanukkah Budget",Extension.jpg,9.8));
        fol1.members();

    }
}
