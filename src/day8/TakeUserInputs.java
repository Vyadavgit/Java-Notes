package day8;

import java.util.Scanner;

public class TakeUserInputs {
    public static void main(String [] args){
        double input, input1;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the double value: ");
        input = sc1.nextDouble();

        System.out.println("Enter the integer value: ");
        input1 = sc2.nextInt();

        System.out.println("Entered value: " + input);
        System.out.println("Entered value: " + input1);
    }
}
