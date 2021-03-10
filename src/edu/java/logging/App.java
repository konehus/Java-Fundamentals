package edu.java.logging;

import edu.java.Main;
import edu.java.logging.logger.MyLogger;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    // use the classname for the logger, this way you can refactor
    private final static Logger LOGGER = Logger.getLogger("HENOK");


    public void doSomeThingAndLog() {
        // ... more code

        // now we demo the logging

        // set the LogLevel to Severe, only severe Messages will be written
        LOGGER.setLevel(Level.FINEST);
        LOGGER.severe("Severe Log 1");
        LOGGER.warning("Warning Log 1");
        LOGGER.info("Info Log 1");
        LOGGER.log(Level.SEVERE, "Application will self-destruct");
        LOGGER.finest("Really not important 1");
        LOGGER.exiting(MyLogger.class.getName(), "doSomeThingAndLog()");
        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.INFO);
        LOGGER.severe("Info Log 2");
        LOGGER.warning("Warning Log 2");
        LOGGER.info("Info Log 2");
        LOGGER.finest("Really not important 2");
    }

    public static void main(String[] args) {
        App tester = new App();
        try {
            MyLogger.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
        tester.doSomeThingAndLog();

        System.Logger logger = System.getLogger("HENOK");

        System.out.println("\nHere");
        logger.log(System.Logger.Level.ERROR, "Warning message from henok");
    }
}