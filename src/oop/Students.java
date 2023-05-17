package oop;

public class Students {
        String name;
        String lastName;
        String email;
        int grade1;
        int grade2;
        int grade3;

    public Students(String name, String lastName, String email, int grade1, int grade2, int grade3) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void printStudents(){
        System.out.println("first name is: "+name);
        System.out.println("last name is: "+lastName);
        System.out.println("first email is: "+email);
        System.out.println("Grade 1 is: "+grade1);
        System.out.println("Grade 2 is: "+grade2);
        System.out.println("Grade 3 is: "+grade3);
        System.out.println(average());
    }
    public double average(){
        return (grade2+grade1+grade3)/3.0;
    }
}
