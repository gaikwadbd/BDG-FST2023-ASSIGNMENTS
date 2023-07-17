package examples.EMICalculator;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class util {

    public static void takeScreenshot(String testName, AndroidDriver driver) throws IOException {

        //String timeStamp;
        File screenShotName;
        // Take screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // This specifies the location the screenshot will be saved
        screenShotName = new File("target/screenshots/"+testName+"-" +timestamp()+".png");
        // This will copy the screenshot to the file created
        FileUtils.copyFile(scrFile, screenShotName);
        //Set filepath for image
        String filePath = "../"+screenShotName.toString();
        //Set image HTML in the report
        String path = "<img src='"+ filePath +"'/>";
        //Show image in report
        Reporter.log(path);
    }
    public static String timestamp() {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
