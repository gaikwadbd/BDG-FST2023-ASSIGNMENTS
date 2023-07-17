package examples.practice;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import static examples.practice.BaseTest.Capabilities;

public class Basics extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
        var driver = Capabilities(true);

        /* xpath syntax
         * tagname[@attribute='value'] tagname : same as class on the appium inspector attributes
         */

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Preference']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("hello");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }
}