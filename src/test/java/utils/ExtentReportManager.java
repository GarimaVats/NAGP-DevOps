
package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            File file=new File("target/extent-reports/index.html");
            ExtentSparkReporter spark = new ExtentSparkReporter(file);
            spark.config().setReportName("Cucumber redBus Report");
            extent.attachReporter(spark);
            extent.flush();
            try{
            Desktop.getDesktop().browse(new File("target/extent-reports/index.html").toURI());
        }catch (IOException e) {

            }
        }
        return extent;
    }
}

