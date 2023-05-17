package oop.ClassesInClass;

public class ProgramProjectEmployee {
    public static void main(String[] args) {
        Employee emp1=new Employee("Malki",315747600);
        emp1.setSalary(59.90);
        System.out.println(emp1.salaryCalculation(150));
        emp1.printEmployeeDetails();
        System.out.println("----------");
        Employee emp2=new Employee("Riki",315747819);
        emp2.setSalary(61.5);
        System.out.println(emp2.salaryCalculation(150));
        emp2.printEmployeeDetails();
        System.out.println("--------");
        Project pr1=new Project("First Project",1,5070);
        pr1.setEmployee(emp1);
        pr1.printProject();
        System.out.println("-----+");
        Project pr2=new Project("Second Project",2,9856);
        pr2.setEmployee(emp2);
        pr2.printProject();

    }

}
