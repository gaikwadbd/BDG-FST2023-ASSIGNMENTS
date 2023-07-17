package examples.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LuanchChromeBrowserInMobileAppTest {
    WebDriverWait wait;
    AppiumDriver driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "LG-H910");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testSearchAppium() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.training-support.net/");

        String pageTitle = driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']")).getText();
        System.out.println("Title on Homepage: " + pageTitle);

        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='About Us']"
        )).getText();
        System.out.println(aboutPageHeading);
        // Find and click the About Us link
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']"
        )).click();


        System.out.println("Title on new page: " + aboutPageHeading);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(aboutPageHeading, "About Us");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}