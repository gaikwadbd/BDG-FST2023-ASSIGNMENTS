package examples.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SendingSMSTest {

    @Test
    public void sendSMSTest(){
        DesiredCapabilities dc=new DesiredCapabilities();
        try{
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
            dc.setCapability("udid", "emulator-5554");

		/*dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");*/

            dc.setCapability("appPackage", "com.google.android.apps.messaging");
            dc.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");

            Thread.sleep(2000);

            URL url=new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver driver=new AndroidDriver(url,dc);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            Thread.sleep(2000);

            driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/start_new_conversation_button")).click();
            Thread.sleep(3000);

            driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/recipient_text_view")).sendKeys("9999999999");

            driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/contact_picker_create_group")).click();

            driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("Hi..New Message");

            driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();

            Thread.sleep(3000);
            driver.quit();

        }
        catch(Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }


    }

}