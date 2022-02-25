package day15;
import day13.Employee;

import java.time.LocalDate;
import java.util.logging.Logger;

public class ObjectClassTest {
    public static void main(String[] args){
        Student student = new Student("ABCD", 1,8);
        Student student1 = new Student("ABC", 1,8);

        //        Employee employee = new Employee("ABC", LocalDate.now(), 50000);
        Logger.getGlobal().info(String.valueOf(student.hashCode())); // 2002017
        Logger.getGlobal().info(String.valueOf(student1.hashCode())); // 64609

        boolean isEqual = student.equals(student1);
        Logger.getGlobal().info(String.valueOf(isEqual)); // false

    }
}
