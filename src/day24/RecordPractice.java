package day24;

import java.util.logging.Logger;

public class RecordPractice {

    public static void main(String[] args) {
        NormalStudent normalStudent1 = new NormalStudent("ABC", 1);
        NormalStudent normalStudent2 = new NormalStudent("ABC", 1);

        boolean isNormalEqual = normalStudent1.equals(normalStudent2);

        Logger.getGlobal().info(String.valueOf(isNormalEqual));

        RecordStudent student = new RecordStudent("ABC", 1);

        RecordStudent student1 = new RecordStudent("ABC", 2);

        Logger.getGlobal().info(student.toString());

        boolean isEqual = student.equals(student1);
        Logger.getGlobal().info(String.valueOf(isEqual));
    }
}