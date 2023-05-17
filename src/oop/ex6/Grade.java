package oop.ex6;

public class Grade {
    double grade;
    String subject;

    public Grade(double grade, String subject) {
        setGrade(grade);
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setGrade(double grade) {
        if (grade>=0||grade<=100)
        this.grade = grade;
        else System.out.println("Please insert a mark between 0-100");
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printGrades(){
        System.out.println("subject"+subject);
        System.out.println("grade"+grade);
    }
}
