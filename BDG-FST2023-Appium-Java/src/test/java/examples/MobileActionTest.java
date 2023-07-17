package examples;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MobileActionTest extends ActionBase {
    WebDriverWait wait;
    AndroidDriver driver;
    //Prepare setup

    @BeforeClass
    public void setDesiredCapabilities() throws MalformedURLException {

        //Set Desired capabilities
        UiAutomator2Options cap = new UiAutomator2Options();
        cap.setPlatformName("android");
        cap.setAutomationName("UiAutomator2");
        cap.setAppPackage("com.android.chrome");
        cap.setAppActivity("com.google.android.apps.chrome.Main");
        cap.noReset();

        //Set Server URL
        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");
        //Initialize the Android Driver
        driver = new AndroidDriver(serverURL, cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    @Test
    public void openMobileAppChromeBrowser(){
        // Open the Training Support page in Web Browser
        driver.get("https://www.training-support.net/selenium/target-practice");

    }

}
