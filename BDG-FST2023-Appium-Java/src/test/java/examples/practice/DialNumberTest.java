package examples.practice;

import java.net.URL;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialNumberTest {

    @Test
    public void f(){
        UiAutomator2Options options = new UiAutomator2Options();
        try{

            options.setPlatformName("android");
            options.setAutomationName("UiAutomator2");
            options.setCapability("appPackage", "com.android.dialer");
            options.setCapability("appActivity", "com.android.app.DialtactsActivity");

            Thread.sleep(2000);

            URL serverUrl=new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver driver=new AndroidDriver(serverUrl,options);

            Thread.sleep(5000);

            //driver.findElement(By.id("com.google.android.dialer:id/fab")).click();
            driver.findElement(AppiumBy.id("com.android.dialer:id/fab")).click();
            Thread.sleep(3000);

            driver.findElement(By.id("com.android.dialer:id/one")).click();
            driver.findElement(By.id("com.android.dialer:id/two")).click();
            driver.findElement(By.id("com.android.dialer:id/three")).click();
            driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();

            Thread.sleep(3000);
            driver.quit();

        }
        catch(Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }


    }

}