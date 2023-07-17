package examples.practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import java.net.MalformedURLException;

public class MobileBrowser extends BaseBrowser {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities();
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(AppiumBy.cssSelector(".navbar-toggler-icon")).click();
        driver.findElement(AppiumBy.cssSelector(".nav-link[routerlink='/products']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        String title = driver.findElement(AppiumBy.xpath("(//li[@class='list-group-item'])[3]/div/div/a")).getText();
        Assert.assertEquals(title, "Devops");

        driver.quit();
    }
}