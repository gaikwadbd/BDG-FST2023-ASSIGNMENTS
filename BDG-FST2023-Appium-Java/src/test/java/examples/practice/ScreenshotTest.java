package examples.practice;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ScreenshotTest {
    AppiumDriver driver = null;
    public TestName testName = new TestName();
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "MyphoneP4A28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(appServer, caps);
    }

    @Test
    public void takeScreenshot() throws IOException {
        //String timeStamp;
        File screenShotName;
        // Take screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // This specifies the location the screenshot will be saved
        screenShotName = new File("src/test/resources/"+testName.getMethodName()+".png");
        // This will copy the screenshot to the file created
        FileUtils.copyFile(scrFile, screenShotName);
        //Set filepath for image
        String filePath = "../"+screenShotName.toString();
        //Set image HTML in the report
        String path = "<img src='"+ filePath +"'/>";
        //Show image in report
        Reporter.log(path);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    public String timestamp() {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}