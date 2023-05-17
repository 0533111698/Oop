package oop.ClassesInClass;

public class Employee {
    private  String name;
    private  int number;
    private double salary;

    public Employee() {
        this.name = name;
        this.number = number;
        setSalary(salary);
    }

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double salaryCalculation(int numOfWorking){
        return (numOfWorking*getSalary());

    }
    public void printEmployeeDetails(){
        System.out.println("The name of the employee is: "+this.name);
        System.out.println("The number of the employee is: "+this.number);
        System.out.println("the hour salary is: "+getSalary());
    }
}
