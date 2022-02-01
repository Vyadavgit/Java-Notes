package day7;

import java.time.LocalDate;

public class Office {
    public static void main(String[] args){
        Employee employee1 = new Employee("Ram", 500, LocalDate.now());
        Employee employee2 = new Employee("Taman", 1000, LocalDate.now(), 30);
        employee2.setAge(30);
    }
}
