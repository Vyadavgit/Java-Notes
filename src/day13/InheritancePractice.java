package day13;

import java.time.LocalDate;
import java.util.logging.Logger;

public class InheritancePractice {
    public static void main(String[] args){
        Employee employee = new Employee("ABC", LocalDate.now(), 5000);
        // Logger.getGlobal().info(String.valueof(employee);
        Logger.getGlobal().info(String.valueOf(employee.getSalary())); // 5000.0
        Employee manager = new Manager("MAN", LocalDate.now(), 10000, 1000);

//        Logger.getGlobal().info(String.valueOf(manager));

        Logger.getGlobal().info(String.valueOf(manager.getSalary())); // 11000.0

        Executive executive = new Executive("EXE", LocalDate.now(), 100000, 10000);

        Logger.getGlobal().info(String.valueOf(executive.getSalary())); // 110000.0

    }
}
