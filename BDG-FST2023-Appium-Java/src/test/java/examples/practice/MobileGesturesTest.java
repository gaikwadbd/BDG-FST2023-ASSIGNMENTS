package examples.practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

public class MobileGesturesTest extends BaseTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities(true);

        driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();

        // tap gesture
        TouchAction action = new TouchAction(driver);
        WebElement expandableList = driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));
        action.tap(tapOptions().withElement(element(expandableList))).perform();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement peopleNamesOption = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
        action.longPress(longPressOptions().withElement(element(peopleNamesOption)).withDuration(ofSeconds(2))).release().perform();
        System.out.println(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
    }
}