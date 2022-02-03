package day22;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerPractice {

    private static final Logger myLogger = Logger.getLogger(LoggerPractice.class.getSimpleName());

    public static void main(String[] args) {

        myLogger.setLevel(Level.WARNING);

        myLogger.severe("This is severe level log");
        myLogger.warning("This is warning level log");
        myLogger.info("This is info level log");
        myLogger.config("This is config level log");
        myLogger.fine("This is fine level log");
        myLogger.finer("This is finer level log");
        myLogger.finest("This is finest level log");
    }
}