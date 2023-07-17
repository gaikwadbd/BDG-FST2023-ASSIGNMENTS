package examples.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WorkingOnHybrid {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        DesiredCapabilities capability=new DesiredCapabilities();
        capability.setCapability("deviceName", "MyphoneP4A28");
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomation");
        //capability.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
        //capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
        //capability.setCapability("unicodeKeyboard", true);
        //capability.setCapability("resetKeyboard", true);
        AndroidDriver driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
        Thread.sleep(3000);
        driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"India\")")).click();
        driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Manzoor");
        driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
        driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(3000);
        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ADD TO CART\")")).click();
        Thread.sleep(3000);
        driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(3000);
        driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(3000);
        System.out.println(driver.getContext());
        System.out.println(driver.getContextHandles());
        driver.context("WEBVIEW_com.androidsample.generalstore");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Manzoor");
    }

}