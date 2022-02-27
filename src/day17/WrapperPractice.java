package day17;

import java.util.ArrayList;
import java.util.logging.Logger;

public class WrapperPractice {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        Logger.getGlobal().info(integers.toString()); // INFO: [3]

        int integer = integers.get(0);
        Logger.getGlobal().info(String.valueOf(integer)); // INFO: 3

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);

        // Type conversion between string to primitive type of data type
        String data = "200";
        int intData = Integer.parseInt(data);
        Logger.getGlobal().info(String.valueOf(intData)); // INFO: 200

        String dataDecimal = "200.50";
        double decimalData = Double.parseDouble(dataDecimal);
        Logger.getGlobal().info(String.valueOf(decimalData)); // INFO: 200.5
    }
}
