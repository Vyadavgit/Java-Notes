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

        String one = "one";
        String anotherOne = "one";
        Logger.getGlobal().info(String.valueOf(one == anotherOne)); //true
        Logger.getGlobal().info(String.valueOf(one == "one")); //true

        String differentOne = "one two".substring(0, 3);
        Logger.getGlobal().info(differentOne); // one

        Logger.getGlobal().info(String.valueOf((one==differentOne))); // false note: "==" checks if it is the same location
        Logger.getGlobal().info(String.valueOf((one.equals(differentOne)))); // true .equals checks for the content

        Logger.getGlobal().info(String.valueOf("yes" == "Yes")); // false
        Logger.getGlobal().info(String.valueOf("yes".equals("Yes"))); //false
        Logger.getGlobal().info(String.valueOf("yes".equalsIgnoreCase("Yes"))); //true

        String dirtyString = "Taman&Neupane";
        String cleanedString = dirtyString.replace("&", " ");
        Logger.getGlobal().info(cleanedString);

        String commaSeparatedString = "Taman,Neupane";
        String [] separateStringArray = commaSeparatedString.split(",");

        Logger.getGlobal().info(separateStringArray[0]); //Taman
        Logger.getGlobal().info(separateStringArray[1]); //Neupane

        boolean decision = commaSeparatedString.startsWith("T");
        Logger.getGlobal().info(String.valueOf((decision))); // true

        // Builder pattern
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I");
        stringBuilder.append(" ");
        stringBuilder.append("am");
        stringBuilder.append(" ");
        stringBuilder.append("Java");
        stringBuilder.append(" ");
        stringBuilder.append("Tutor");

        String concatString = stringBuilder.toString();
        Logger.getGlobal().info(String.valueOf(concatString)); // I am Java Tutor
    }
}
