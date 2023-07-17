package examples.practice;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;

public class ScrollGestureTest extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities(true);

        // scroll gesture
        driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
    }
}