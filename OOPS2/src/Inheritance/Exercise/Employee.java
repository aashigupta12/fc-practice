package Inheritance.Exercise;

import java.math.BigDecimal;

public class Employee extends Person{
    private String title;
    private String employeeName;
    private char employeeGrade;
    private BigDecimal salary;


    public Employee(String name, String title){
        super(name);
        this.title = title;
//        super(); //by default super will call parent class first const first
        System.out.println("employee constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
//        return getClass().getName() + "#" + Integer.toHexString(hashCode());

        //used super keyword here to call Person's data to employee class to print in student runner
//        return employeeName + " # " + title + " # " + employeeGrade + " # "+
//                super.getEmail() + " #" + super.getName() + " #" +super.getPhoneNumber();

        //instead we can write super.toString in the beginning to call parent's class data members
        return super.toString() + employeeName + " # " + title + " # " + employeeGrade;
    }
}
