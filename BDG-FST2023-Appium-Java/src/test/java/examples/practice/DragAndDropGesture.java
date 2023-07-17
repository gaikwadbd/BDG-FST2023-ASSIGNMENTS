package examples.practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDropGesture extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        var driver = Capabilities(true);

        // drag and drop gesture
        driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        TouchAction action = new TouchAction(driver);
        WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        WebElement  dropPoint = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
        action.longPress(longPressOptions().withElement(element(element))).moveTo(element(dropPoint)).release().perform();
    }
}