package examples.practice;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;

public class UiAutomatorTest extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities(true);

        /*
         * finding elements by Android UI Automator
         */
        driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();

        // validate clickable feature for all options
        System.out.println(driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().clickable(true)")).size());
    }
}