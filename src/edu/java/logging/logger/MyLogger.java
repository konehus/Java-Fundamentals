package edu.java.logging.logger;

import java.io.IOException;
import java.util.logging.*;

public class MyLogger {

    static public void setup() throws IOException {

        // get the global logger to configure it
        Logger logger = Logger.getLogger("HENOK");

        // suppress the logging output to the console
        Logger rootLogger = Logger.getLogger("");

        Handler[] handlers = rootLogger.getHandlers();

        if (handlers[0] instanceof ConsoleHandler) {
            //remove default handling by ConsoleHandler
            rootLogger.removeHandler(handlers[0]);
        }

        logger.setLevel(Level.INFO);
        Handler fileTxt = new FileHandler("src/edu/java/logging/logger/log/Logging.txt");
        Handler fileHTML = new FileHandler("src/edu/java/logging/logger/log/Logging.html");
        Handler console = new ConsoleHandler();

        // create a TXT formatter
        SimpleFormatter formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);

        // create a CONSOLE formatter
        console.setFormatter(formatterTxt);
        logger.addHandler(console);

        // create an HTML formatter
        Formatter formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        logger.addHandler(fileHTML);


    }
}