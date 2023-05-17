package oop.classArry;

import java.util.Arrays;

public class Folder {
    private String name;
    private File[] file;

    public Folder(String name) {
        this.name = name;
        this.file=new File[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File[] getFile() {
        return file;
    }

    public void setFile(File[] file) {
        this.file = file;
    }
    public void addFile(File newFile){
        for (int i = 0; i <file.length; i++) {
            if (file[i]==null){
                file[i]=newFile;
            break;
            }

        }


    }
    public void deleteFile(File name){
        for (int i = 0; i < file.length; i++) {
            if (file[i]!=null&&file[i].getName().equals(name)){
                file[i]=null;
                break;
            }


        }
    }
    public void sizeOfFolders(){
        for (int i = 0; i < file.length; i++) {
            if (file[i]!=null)
            System.out.println("The size of file: "+file[i].getSize());


        }
    }
    public void maxFileSize(){
        double max=0;
        for (int i = 0; i < file.length; i++) {
            if (file[i]!=null&&file[i].getSize()>max)
                max=file[i].getSize();

        }
        for (int i = 0; i <file.length; i++) {
            if (file[i]!=null&&max==file[i].getSize()){
                System.out.println("The name of the max size: "+file[i].getName());
            break;}



        }

    }
    public void printFolders(){
        System.out.println("The name of folder: "+this.name);
        System.out.println("");
        for (int i = 0; i <file.length; i++) {
            if (file[i]!=null)
            System.out.println(file[i].getName()+" "+file[i].getSize()+" "+file[i].getEndingOfFile());

        }
    }
    public void members(){
        printFolders();
        maxFileSize();
        sizeOfFolders();
    }
}
