package examples.EMICalculator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EMISetup {
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","MyphoneP4A28");
        cap.setCapability("platformName","Android");
        //cap.setCapability("os","11");
        cap.setCapability("appPackage", "com.continuum.emi.calculator");
        cap.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        cap.setCapability("app","C:\\Users\\01979D744\\Documents\\FST2023\\BDG-FST-Appium-Java\\src\\test\\java\\examples\\EMICalculator\\emi-calc.apk");
        cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

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
    @AfterClass
    public void closeEMICalApp(){
        driver.quit();
    }
}