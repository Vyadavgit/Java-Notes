package day22;

import java.util.logging.Logger;

public class AssertionPractice {

    public static void main(String[] args) {
        int x = -2;

//        if (x < 0) throw new IllegalArgumentException("x < 0");
//        assert x >= 0 : "The value of the x should be greater than 0";

        double y = Math.sqrt(x);

        Logger.getGlobal().info(String.valueOf(y));
        Logger.getGlobal().severe("asdasdasd");
    }
}