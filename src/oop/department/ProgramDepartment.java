package oop.department;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramDepartment {
    public static void main(String[] args) {

        String[]nameManager={"Ras","din","Ram","Salam","Nir"};

        Department[] departmentArray=new Department[5];
        double sumManagerSalary=0;
        double[]employee3salary=new double[5];
        double sumEmployeeSalary=0;


        for(int i=0;i<departmentArray.length;i++){
            departmentArray[i]=new Department(NameDepartment.values()[i],
                    new Manager(nameManager[(int) (Math.random()*nameManager.length)],(int) (Math.random()*30)+10,
                            new Salary(Math.random()*10000+15000,Math.random()*10000+2000)),
                    createEmployee());
            sumManagerSalary+=departmentArray[i].getManager().getSalary().getMonthly();
            sumEmployeeSalary=0;
            for (int j = 0; j <15; j++) {
                sumEmployeeSalary+=departmentArray[i].getEmployee3()[j].getSalary().getMonthly();



            }employee3salary[i]=sumEmployeeSalary;


        }
        System.out.println(Arrays.toString(departmentArray));
        maxMounthlySalary(departmentArray);
        averageSalarysEmployee(departmentArray);
        System.out.println("The average of managers' salary: "+sumManagerSalary/ departmentArray.length);
        for (int i = 0; i <5; i++) {
            sumEmployeeSalary+=employee3salary[i];
        }
        System.out.println("The average of employee' salary is:"+sumEmployeeSalary/75);



    }

    private static void averageSalarysEmployee(Department[] depart) {
        double sum=0;
        int count=0;
        for (Department x:depart) {
            for (Employee3 z:x.getEmployee3()) {
                sum+=z.getSalary().getMonthly();
                count++;

            }
        }
        System.out.println("TThe average of employees salary is: "+sum/75l);
    }

    private static void maxMounthlySalary(Department[]dept) {

        for (Department x:dept) {
            double max=0;
            for (Employee3 z: x.getEmployee3()) {
                if (z.getSalary().getMonthly()>max)
                    max=z.getSalary().getMonthly();
            }
            System.out.println("The maximum mounthly salary is: "+max);

        }
    }

    private static Employee3[] createEmployee() {

        String[]nameEmployee={"Stive","Joe","Boris","Dan","Shay","Shuki","Rachamim","Meir"};
        Employee3[] employee3=new Employee3[15];

        int young=60;
        String yuongestEmployee = null;
        for (int i = 0; i < employee3.length; i++) {
            employee3[i]=new Employee3(nameEmployee[(int) (Math.random()*nameEmployee.length)],(int) (Math.random()*40)+20,
                    new Salary(Math.random()*10000+5000,Math.random()*6000+2000));

            if (young>employee3[i].getAge()) {
                young = employee3[i].getAge();
                yuongestEmployee=(employee3[i].getName());
            }


        }
        System.out.println("The youngest employee is: "+yuongestEmployee+young);






        return employee3;

    }
}
