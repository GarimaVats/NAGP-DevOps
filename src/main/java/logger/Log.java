package logger;

import org.apache.log4j.Logger;

public class Log {

    static final Logger Log = Logger.getLogger(Log.class.getName());

    // Initialize Log4j logs

    /**
     * Method to log Test case name in the logger file.
     */

    public static void startTestCase(String testCaseName) {

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

        Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + testCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

    }

    /**
     * Method to print log for the ending of the test case.
     **/

    public static void endTestCase(String scenarioStatus) {

        Log.info("XXXXXXXXXXXXXXXXXXXXXXX              SCENARIO STATUS            XXXXXXXXXXXXXXXXXXXXXX" + scenarioStatus);

        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

        Log.info("X");

        Log.info("X");

        Log.info("X");

        Log.info("X");

    }

    /**
     * Method to print info log.
     */

    public static void info(String message) {

        Log.info(message);

    }

    /**
     * Method to print warning log.
     */

    public static void warn(String message) {

        Log.warn(message);

    }

    /**
     * Method to print error log.
     */

    public static void error(String message) {

        Log.error(message);

    }

    /**
     * Method to print fatal log.
     */
    public static void fatal(String message) {

        Log.fatal(message);

    }

    /**
     * Method to print debug log.
     */
    public static void debug(String message) {

        Log.debug(message);

    }

}