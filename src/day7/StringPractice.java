package day7;

import java.util.logging.Logger;

public class StringPractice {
    public static void main(String[] args){
        String surname; // null value if uninitialized
        String name = "Taman Neupane"; //String is a class and can be written as String name = new String("Taman");

        Logger.getGlobal().info(String.valueOf(name.length()));

        String lowerCaseString = name.toLowerCase();
        Logger.getGlobal().info(lowerCaseString);

        String firstName = name.substring(0, 5);
        Logger.getGlobal().info(firstName);

        String lastName = name.substring(6);
        Logger.getGlobal().info(lastName);

        String fullName = firstName +" "+ lastName;
        Logger.getGlobal().info(fullName);

        String fName = firstName.concat(" ").concat(lastName);
        Logger.getGlobal().info(fName);

        String time = 21 + "AM"; // 21AM
        Logger.getGlobal().info(time);

        String time1 = 21 + 9 +  "AM"; // 30AM
        Logger.getGlobal().info(time1);

        String time2 = "AM" + 21 + 9; // AM219
        Logger.getGlobal().info(time2);

        String joinExample = String.join("/","S", "L", "XL");
        Logger.getGlobal().info(joinExample);

        String s = "";
        Logger.getGlobal().info(String.valueOf(s.length()));

        String st = "    ";
        Logger.getGlobal().info(String.valueOf(st.length())); //4

        Logger.getGlobal().info(String.valueOf(s.isEmpty())); //true
        Logger.getGlobal().info(String.valueOf(st.isEmpty())); //false
        Logger.getGlobal().info(String.valueOf(s.isBlank())); //true

        String trimmedString = s.trim();


    }
}
