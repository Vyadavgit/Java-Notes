package day18;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    private  String name;
    private LocalDate localDate;
    private double salary;

    public Employee(String name, LocalDate localDate, double salary){
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
        return salary;
    }

    @Override
    public  String toString(){
        return "Employee{" +
                "name=" + name +
                ",localeDate=" + localDate +
                ", salary=" + salary +
                "}";
    }

    @Override
    public int compareTo(Employee o){
        return this.name.compareTo(o.name);
        //         return Double.compare(o.salary, this.salary);

    }

}
