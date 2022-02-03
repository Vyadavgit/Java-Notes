package day22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        try {
            int age = scanner.nextInt();
            if(age < 18) throw new AgeRestrictionException("You cannot register if you are below 18 years");
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (AgeRestrictionException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}