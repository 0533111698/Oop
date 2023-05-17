package oop.department;

import java.util.Arrays;

public class Department {
    private NameDepartment name;
    private Manager manager;
    private Employee3[] employee3;

    public Department(NameDepartment name, Manager manager, Employee3[] employee3) {
        this.name = name;
        this.manager = manager;
        this.employee3 = employee3;
    }

    public NameDepartment getName() {
        return name;
    }

    public void setName(NameDepartment name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee3[] getEmployee3() {
        return employee3;
    }

    public void setEmployee3(Employee3[] employee3) {
        this.employee3 = employee3;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name=" + name +
                ", manager=" + manager +
                ", employee3=" + Arrays.toString(employee3) +
                '}';
    }
}
