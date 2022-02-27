package day16;

import day15.Student;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(15); // if the size is defined already it is fast untill the arraylist size is exceeded
        names.add("1ABC");
        names.add("2ABC");
        names.add("3ABC");
        names.add("4ABC");
        names.add("5ABC");

        Logger.getGlobal().info(names.toString()); // INFO: [1ABC, 2ABC, 3ABC, 4ABC, 5ABC]

        names.add(2, "6ABC"); // add 6ABC at position 2

        Logger.getGlobal().info(names.toString()); // INFO: [1ABC, 2ABC, 6ABC, 3ABC, 4ABC, 5ABC]

        names.set(2,"7ABC"); // replaces element at position 2 with 7ABC

        Logger.getGlobal().info(names.toString()); // INFO: [1ABC, 2ABC, 7ABC, 3ABC, 4ABC, 5ABC]

        ArrayList<String> namesCopy = new ArrayList<>();
        namesCopy.addAll(names); // adds all emenets to the copy
        Logger.getGlobal().info(namesCopy.toString()); // INFO: [1ABC, 2ABC, 7ABC, 3ABC, 4ABC, 5ABC]

        String secondIndexData = names.get(2);
        Logger.getGlobal().info(secondIndexData); // INFO: 7ABC

        names.add("7ABC");
        boolean isRemoved = names.remove("7ABC"); // only removes the first instance
        Logger.getGlobal().info(String.valueOf(isRemoved)); // INFO: true
        Logger.getGlobal().info(names.toString()); // INFO: [1ABC, 2ABC, 3ABC, 4ABC, 5ABC, 7ABC]

        // [1ABC, 2ABC, 3ABC, 4ABC, 5ABC, 7ABC]
        String removedElement = names.remove(2);
        Logger.getGlobal().info(removedElement); // INFO: 3ABC

        Logger.getGlobal().info(names.toString()); // INFO: [1ABC, 2ABC, 4ABC, 5ABC, 7ABC]

        namesCopy.removeAll(names); // names = [1ABC, 2ABC, 4ABC, 5ABC, 7ABC]
        Logger.getGlobal().info(namesCopy.toString()); // INFO: [3ABC]



//        ArrayList<Student>students = new ArrayList<>(5);
//        students.add(new Student("1ABC", 1,1));
//        students.add(new Student("2ABC", 2, 1));
//
//        Logger.getGlobal().info(students.toString()); // INFO: [String{name='}, String{name='}]
//        students.remove(new Student("1abc", 1, 1));
//        Logger.getGlobal().info(students.toString()); // INFO: [String{name='}, String{name='}]
//
    }
}
