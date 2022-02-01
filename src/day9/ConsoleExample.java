//package day9;

// this code can only be executed in console
// compilation instructions:
// run following commands
// javac ConsoleExample.java
// java ConsoleExample

import java.io.Console;
public class ConsoleExample {
    public static void main(String[] args){
        Console console = System.console();
        if (console == null){
            System.out.println("No console: non-interactive mode !");
            System.exit(0);
        }
        System.out.print("Enter your username: ");
        String username = console.readLine();

        System.out.print("Enter your password: ");
        char[] password = console.readPassword();

        System.out.println("Thank you!");
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + String.valueOf(password));
    }
}
