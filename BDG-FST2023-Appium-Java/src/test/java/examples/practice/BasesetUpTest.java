package examples.practice;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BasesetUpTest {
    AndroidDriver driver;

    // Create object/instance of Soft assert
    public SoftAssert s_assert = new SoftAssert();

    @BeforeClass
    public void setUp() throws Exception {

        //Set the Desired Capabilities for the Appium Server
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("no-reset", "true");
        caps.setCapability("full-reset", "False");
        caps.setCapability("deviceName", "MyphoneP4A28");
        //caps.setCapability("udid", "06cddb839b162851");
        caps.setCapability("platformName", "Android");
        //caps.setCapability("platformVersion", "4.4.2");
        caps.setCapability("appPackage", "com.android.cellebrite.testdiagnosticslibrary");
        caps.setCapability("appActivity", "com.android.cellebrite.testdiagnosticslibrary.newApp.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}