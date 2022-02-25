package day12;
import java.util.logging.Logger;

// arguments can be passed through IDE or command line
// to  run through command line following steps:

// javac CommandLineArgument.java
// java CommandLineArgument
// or
// java CommandLineArgument prod
// or
// java CommandLineArgument dev
// or
// java CommandLineArgument staging

public class CommandLineArgument {
    public static void main(String[] args){
        String url = "http://dev.facebook.com";
        if(args.length != 0) {
            switch (args[0]) {
                case "staging" -> url = "http://staging.facebook.com";
                case "prod" -> url = "http://facebook.com";
                default -> url = "http://dev.facebook.com";
            }
        } else{
            url = "http://dev.facebook.com";
        }
        Logger.getGlobal().info(url);
    }
}
