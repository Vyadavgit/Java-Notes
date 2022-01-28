package day7;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

public class Employee {
    private String name; // required
    private double salary; // required
    private LocalDate joiningDate; // required
    private int age; // optional

    public Employee(String name, double salary, LocalDate joiningDate){
        Logger.getGlobal().info("Constructor called");

        this.name =Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.joiningDate = Objects.requireNonNullElse(joiningDate, LocalDate.now());
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getAge() {
        return age;
    }
}
