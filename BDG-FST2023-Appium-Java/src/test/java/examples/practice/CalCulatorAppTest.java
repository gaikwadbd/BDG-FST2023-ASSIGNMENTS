package examples.practice;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class CalCulatorAppTest {
    AppiumDriver driver = null;

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
    public void calculateAddition() {
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.id("op_add")).click();
        driver.findElement(AppiumBy.id("digit_9")).click();
        // Perform Calculation
        driver.findElement(AppiumBy.id("eq")).click();

        // Display Result
        String result = driver.findElement(AppiumBy.id("result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "14");
    }
    @Test
    public void calculateSubstraction() {
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.id("op_sub")).click();
        driver.findElement(AppiumBy.id("digit_5")).click();
        // Perform Calculation
        driver.findElement(AppiumBy.id("eq")).click();

        // Display Result
        String result = driver.findElement(AppiumBy.id("result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "5");
    }
    @Test
    public void calculateMultiplication() {
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.id("op_mul")).click();
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        // Perform Calculation
        driver.findElement(AppiumBy.id("eq")).click();

        // Display Result
        String result = driver.findElement(AppiumBy.id("result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "500");
    }
    @Test
    public void calculateDivision() {
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.id("op_div")).click();
        driver.findElement(AppiumBy.id("digit_2")).click();
        // Perform Calculation
        driver.findElement(AppiumBy.id("eq")).click();

        // Display Result
        String result = driver.findElement(AppiumBy.id("result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "25");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}