package oop.malki;

import java.util.Arrays;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] student;

    public ClassRoom(String name, Teacher teacher, Student[] student) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return"{"+
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", student=" + Arrays.toString(student)+"}" +"\n";
    }
}
