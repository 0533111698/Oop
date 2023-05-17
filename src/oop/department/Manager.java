package oop.department;

public class Manager extends Employee3{


    public Manager(String name, int age, Salary salary) {
     super(name, age, salary);
    }

    @Override
    public Salary getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(Salary salary) {
        if (getSalary().getMonthly()>=25000)
        super.setSalary(salary);
        else
            System.out.println("salary must be over 25000");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
