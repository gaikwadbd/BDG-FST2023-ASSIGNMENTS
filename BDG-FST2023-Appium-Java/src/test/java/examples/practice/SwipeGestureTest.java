package examples.practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class SwipeGestureTest extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities(true);

        // swipe gesture
        driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();
        driver.findElement(AppiumBy.accessibilityId("Date Widgets")).click();
        driver.findElement(AppiumBy.accessibilityId("2. Inline")).click();
        driver.findElement(AppiumBy.accessibilityId("9")).click();

        TouchAction action = new TouchAction(driver);
        WebElement initialElement = driver.findElement(AppiumBy.accessibilityId("15"));
        WebElement finalElement = driver.findElement(AppiumBy.accessibilityId("45"));
        action.longPress(longPressOptions().withElement(element(initialElement))).moveTo(element(finalElement)).release().perform();
    }
}