package examples.practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class GeneralStoreTest1 extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities(true);

        // locators
        WebElement  countryDropdown = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
        WebElement inputText = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        WebElement radioFemale = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
        WebElement shopButton = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));

        // negative path flow
        radioFemale.click();
        countryDropdown.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
        shopButton.click();
        String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getAttribute("name");
        System.out.println(toastMessage);
        Assert.assertEquals(toastMessage, "Please enter your name");
    }
}