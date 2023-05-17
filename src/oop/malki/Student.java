package oop.malki;

import java.util.Arrays;

public class Student extends Person{
    private Grade[] gradeArray;

    public Student(String name, int age, Grade[] gradeArray) {
        super(name, age);
        this.gradeArray = gradeArray;
    }

    public Grade[] getGradeArray() {
        return gradeArray;
    }

    public void setGradeArray(Grade[] gradeArray) {
        this.gradeArray = gradeArray;
    }

    @Override
    public String toString() {
        return super.toString() +
                "gradeArray=" + Arrays.toString(gradeArray) ;
    }
}
