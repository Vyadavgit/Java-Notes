package day13;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate localDate;
    private double salary;

    public  Employee(String name, LocalDate localDate, double salary){
        this.name = name;
        this.localDate = localDate;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public LocalDate getLocalDate(){
        return localDate;
    }
    public double getSalary(){
        return  salary;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "name=" + name +
                ", localeDate=" +
                ", salary="+salary+
                "}";
    }
}
