package day6;

import java.util.logging.Logger;

public class PredefinedClass {

    public static void main(String[] args) {
        double randomNumber = Math.random();

        Logger.getGlobal().info(String.valueOf(randomNumber));

        double a = 2.6;

        double  ceilNumber = Math.ceil(a);
        double  floorNumber = Math.floor(a);
        double  roundNumber = Math.round(a);

        Logger.getGlobal().info(String.valueOf(ceilNumber));
        Logger.getGlobal().info(String.valueOf(floorNumber));
        Logger.getGlobal().info(String.valueOf(roundNumber));
    }
}