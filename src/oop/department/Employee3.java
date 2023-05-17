package oop.department;

public class Employee3 extends Person{
    Salary salary;

    public Employee3(String name, int age, Salary salary) {
        super(name, age);
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "salary=" + salary +
                '}';
    }
}
