package day10;

import java.util.logging.Logger;

public class ConditionalStatementPractice {


    public static void main(String[] args) {
        int target = 10;
        int sales = 9;
        int bonus = 0;

        // If
//        if(sales >= target){
//            Logger.getGlobal().info("Target met");
//            bonus = 100;
//        }
//        Logger.getGlobal().info(String.valueOf(bonus));

//        if(sales >= target){
//            Logger.getGlobal().info("Target met");
//            bonus = 100;
//        }else{
//            Logger.getGlobal().info("Target not met");
//        }
//
//        Logger.getGlobal().info(String.valueOf(bonus));

//        if(sales >= 2 * target){
//            bonus = 1000;
//            Logger.getGlobal().info("2 time of target met");
//        }else if(sales >= 1.5* target){
//            bonus = 500;
//            Logger.getGlobal().info("1.5 time of target met");
//        }else if(sales >= target){
//            bonus = 100;
//            Logger.getGlobal().info("Exact or greater target met");
//        }else{
//            Logger.getGlobal().info("Fires");
//        }
//
//        Logger.getGlobal().info(String.valueOf(bonus));

        String today = "wednesday";


        switch (today) {
            case "sunday", "saturday" -> Logger.getGlobal().info("sunday");
            case "monday" -> Logger.getGlobal().info("monday");
            case "tuesday" -> Logger.getGlobal().info("tuesday");
            case "wednesday" -> Logger.getGlobal().info("today is wednesday");
            case "thursday" -> Logger.getGlobal().info("thursday");
            case "friday" -> Logger.getGlobal().info("friday");
            default -> Logger.getGlobal().info("No any match");
        }

    }
}