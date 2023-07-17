package examples.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchMobileAppTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capability=new DesiredCapabilities();
        capability.setCapability("deviceName", "MyphoneP4A28");
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomation");
        //capability.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
        capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
        //capability.setCapability("unicodeKeyboard", true);
        //capability.setCapability("resetKeyboard", true);
        AndroidDriver driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        Thread.sleep(3000);
        driver.activateApp("com.google.android.apps.messaging");
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
