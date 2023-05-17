package oop.ex6;

public class ProgeamStudenntGrade {
    public static void main(String[] args) {
        Student st1=new Student("Malki","a0533111698@gmail.com",26);
        st1.addGrade(new Grade(99,"OOP"));
        st1.addGrade(new Grade(97,"Math"));
        st1.addGrade(new Grade(98,"Yahadut"));
        st1.deleteGrade("Math");
        st1.addGrade(new Grade(86,"Torah"));
        st1.printStudents();
    }
}
