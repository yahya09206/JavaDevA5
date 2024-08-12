package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private int employeeID;
    private double salary;

    public Employee(char gender, LocalDate dateOfBirth, String name, String jobTitle, int employeeID, double salary) {
        super(gender, dateOfBirth, name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
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

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public void attendMeeting(){
        System.out.println(getName() + " is attending meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
