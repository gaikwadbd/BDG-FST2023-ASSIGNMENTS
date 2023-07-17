package examples.practice;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class GeneralStoreTest extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities(true);

        // locators
        WebElement  countryDropdown = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
        WebElement inputText = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        WebElement radioFemale = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
        WebElement shopButton = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));

        // positive path flow
        inputText.click();
        inputText.sendKeys("hello");
        driver.hideKeyboard();
        radioFemale.click();
        countryDropdown.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
        shopButton.click();

    }
}