package day8;

import java.util.logging.Logger;

public class ShoppingMall {
    public static void main(String[] args){
        // if the count is not a static variable in the Door class
        Door doorIn = new Door();
        doorIn.count += 1;
        Door doorOut = new Door();
        doorOut.count -= 1;
        Logger.getGlobal().info(String.valueOf(doorIn.count)); // prints 1 if the count is not a static variable in the Door class else prints 0 i.e invalid operation
        Logger.getGlobal().info(String.valueOf(doorOut.count)); // prints -1 if the count is not a static variable in the Door class else prints 0 i.e invalid operation

//        // if the count is a static variable in the Door class
//        Door.count += 1;
//        Logger.getGlobal().info(String.valueOf(Door.count)); // 1
//        Door.count -= 1;
//        Logger.getGlobal().info(String.valueOf(Door.count)); // 0


    }
}
