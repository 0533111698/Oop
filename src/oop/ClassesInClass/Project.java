package oop.ClassesInClass;

public class Project {
    private String name;
    private int num;
    private  int hours;
    private Employee employee;

    public Project(String name, int num, int hours) {
        setName(name);
        setNum(num);
        setHours(hours);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void printProject(){
        System.out.println("Name of project: "+this.name);
        System.out.println("Num of project: "+this.num);
        System.out.println("The number of the hours is: "+this.hours);
        System.out.println("The employee is: "+this.employee.getName()+" "
                +this.employee.getNumber()+" "+this.employee.getSalary());
    }
}
