package day18;

import java.time.LocalDate;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("ABC1", LocalDate.now(), 500);
        employees[1] = new Employee("ABC0", LocalDate.now(), 1500);
        employees[2] = new Employee("ABC2", LocalDate.now(), 200);

        System.out.println("*************************************Before sorting *******************");
        for (Employee employee: employees){
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println("*************************************After sorting *******************");
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }

    /* Output:
    * *************************************Before sorting *******************
Employee{name=ABC1,localeDate=2022-02-26, salary=500.0}
Employee{name=ABC0,localeDate=2022-02-26, salary=1500.0}
Employee{name=ABC2,localeDate=2022-02-26, salary=200.0}
*************************************After sorting *******************
Employee{name=ABC0,localeDate=2022-02-26, salary=1500.0}
Employee{name=ABC1,localeDate=2022-02-26, salary=500.0}
Employee{name=ABC2,localeDate=2022-02-26, salary=200.0} */
}
