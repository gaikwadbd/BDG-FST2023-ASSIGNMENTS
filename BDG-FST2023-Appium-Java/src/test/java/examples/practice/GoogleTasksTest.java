package examples.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class GoogleTasksTest {
    AppiumDriver driver = null;
    WebDriverWait wait;
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "MyphoneP4A28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        // caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(appServer, caps);

    }

    @Test
    public  void addingactivity() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement getstarted = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/welcome_get_started"));
        getstarted.click();

        WebElement pageTitle = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab"));
        pageTitle.click();


        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        String title = driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"])[1]/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(title, "Complete the second Activity Google Keep");

        String title1 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(title1, "Complete Activity with Google Keep");

        String title2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(title2, "Complete Activity with Google Tasks");






    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}