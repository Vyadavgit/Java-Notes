package day10;

import java.util.logging.Logger;

public class BlockScopePractice {

    static int a = 2;

    public static void main(String[] args) {
        int c = 5;
        Logger.getGlobal().info(String.valueOf(a));

        {
            int b = 2;
            Logger.getGlobal().info(String.valueOf(c));
        }
//        Logger.getGlobal().info(String.valueOf(b));
    }
}