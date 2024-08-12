package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private long employeeID;
    private double salary;

    public Employee(char gender, LocalDate dateOfBirth, String name, String jobTitle, long employeeID, double salary) {
        super(gender, dateOfBirth, name);
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
