package oop.ex6;

public class Student {
    private String name,email;
    private int age;
    private int counter;
    private Grade[]grades;

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.grades = new Grade[3];
        this.counter=counter;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void addGrade(Grade newGrade){
        for (int i = 0; i <grades.length ; i++) {
            if (grades[i]==null){
                grades[i]=newGrade;
                break;
            }
            counter++;

            
        }

    }
    public void deleteGrade(String subject){
        for (int i = 0; i <grades.length; i++) {
            if (grades[i]!=null&&grades[i].getSubject().equals(subject)){
                grades[i]=null;
                break;
            }

        }
    }
    public void average(){
        double sum=0;
        double cont=0;
        for (int i = 0; i <grades.length; i++) {
            if (grades[i]!=null)
           sum+= grades[i].getGrade();
           if (grades[i]!=null)
               cont++;

        }if (cont>0)
        System.out.println(sum/cont);
        else System.out.println("no grades");
    }

    public void printStudents(){
        System.out.println("name: "+name);
        System.out.println("email: "+email);
        System.out.println("age: "+age);
        average();
        for (int i = 0; i <3; i++) {
            if (grades[i]!=null)
            System.out.println("grade"+grades[i].getGrade()+" "+"subject: "+grades[i].getSubject());

        }
    }
}
