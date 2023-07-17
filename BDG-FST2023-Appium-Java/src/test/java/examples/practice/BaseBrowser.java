package examples.practice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseBrowser {

    public static AndroidDriver Capabilities() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        return driver;
    }

}