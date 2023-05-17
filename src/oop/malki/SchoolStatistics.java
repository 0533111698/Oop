package oop.malki;

import java.util.Arrays;

public class SchoolStatistics {
    public static void main(String[] args) {
        School school=new School(createClassRoom());
        System.out.println(school);
        averageOfSchool(school);
        averageOfClass(school);
        avverageOfSchoolProfession(school);
    }

//    private static void avverageOfSchoolProfession2(School school) {
//        double sumMath=0,sumChemistry=0,sumGeography=0,sumLiterature=0,sumPhysics=0,sumSports=0;
//        double countMath=0,countChemistry=0,countGeography=0,countLiterature=0,countPhysics=0,countSports=0;
//        for (ClassRoom cl:school.getClassRooms()) {
//            for (Student sr:cl.getStudent()) {
//                for (Grade gr:sr.getGradeArray()) {
//                    for (int i = 0; i <Profession.values().length; i++) {
//                        switch (i){
//                            case 1:{sumMath+=gr.getScore();
//                                countMath++;}
//                                break;
//                            case 2:{sumChemistry+=gr.getScore();
//                                countChemistry++;}
//                            break;
//                            case 3:{sumGeography+=gr.getScore();
//                            countGeography++;}
//                            break;
//                            case 4:{sumLiterature+=gr.getScore();
//                            countLiterature++;}
//                            break;
//                            case 5:{sumPhysics+=gr.getScore();
//                            countPhysics++;}
//                            break;
//                            case 6:{sumSports+=gr.getScore();
//                            countSports++;}
//                            break;
//                        }
//
//                    }
//
//                }
//
//            }
//
//        }
//        System.out.println("The average of Math is:"+sumMath/countMath);
//        System.out.println("The average of Chemistry is:"+sumChemistry/countChemistry);
//        System.out.println("The average of Geography is:"+sumGeography/countGeography);
//        System.out.println("The average of Literature is:"+sumLiterature/countLiterature);
//        System.out.println("The average of Physics is:"+sumPhysics/countPhysics);
//        System.out.println("The average of Sports is:"+sumSports/countSports);
//    }

    private static void avverageOfSchoolProfession(School school) {
        for (Profession pr:Profession.values()) {
            double sum=0;
            double count=0;
            for (ClassRoom cl:school.getClassRooms()) {
                for (Student st:cl.getStudent()) {
                    for (Grade gr:st.getGradeArray()) {
                        if (gr.getProfession()==pr){
                        sum+=gr.getScore();
                        count++;}
                    }

                }

            }
            System.out.println("The average of: "+pr+"is: "+sum/count);
        }

    }

    private static void averageOfClass(School school) {
        for (ClassRoom cl:school.getClassRooms()) {
            double sum=0;
            double count=0;
            for (Student st:cl.getStudent()) {
                for (Grade gr:st.getGradeArray()) {
                    sum+=gr.getScore();
                    count++;
                }

            }
            System.out.println(cl.getName()+"The average of"+cl.getName() +" is: "+sum/count);
        }
    }

    private static void averageOfSchool(School schools) {
        double sum=0;
        double count=0;
            for (ClassRoom c:schools.getClassRooms()) {
                for (Student st:c.getStudent()) {
                    for (Grade g: st.getGradeArray()) {
                        sum+= g.getScore();
                        count++;
                    }
                }
            }
        System.out.println("The average of school is: "+sum/count);
    }

    public static ClassRoom[] createClassRoom() {
        ClassRoom[] classRoom=new ClassRoom[5];
        for (int i = 0; i <classRoom.length; i++) {
            classRoom[i]=new ClassRoom("class"+(i+1),new Teacher("teacher"+(i+1),(int) (Math.random()*101)+20,
                    Profession.values()[i]),createStudents());
        }
        return classRoom;
    }
    public static Student[] createStudents() {
        Student[] students=new Student[15];
        for (int i = 0; i <students.length; i++) {
            students[i]=new Student("student"+(i+1),(int) (Math.random()*101)+20,createGradeArray());
        }
        return students;
    }


    public static Grade[] createGradeArray() {
        Grade[] grades=new Grade[6];
        for (int i = 0; i <grades.length; i++) {
            grades[i]=new Grade(Profession.values()[i],(int) (Math.random()*61)+40);

        }
        return grades;
    }
}
