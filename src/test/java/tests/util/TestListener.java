package tests.util;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener
{
    Logger log = LogManager.getRootLogger();

    /*public void onTestFailure(ITestResult iTestResult) {

        saveScreenshots();

    }*/

    public void saveScreenshots(WebDriver driver) {

        File screenCapture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {

           // scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           // FileUtils.copyFile(screenCapture, new File("./image.png"));

         FileUtils.copyFile(screenCapture, new File("./Screenshots/" + getCurrentTimedAsString() + ".png"));

        } catch (IOException e) {
            log.error("Failed: " + e.getLocalizedMessage());
        }
    }
    private String getCurrentTimedAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd_HH-mm-ss");
        return ZonedDateTime.now().format(formatter);
    }
}
