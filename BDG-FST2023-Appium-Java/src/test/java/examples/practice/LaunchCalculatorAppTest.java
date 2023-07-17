package examples.practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class LaunchCalculatorAppTest {
    @Test

    public void calc() throws InterruptedException, IOException {

        // Set the Desired Capabilities

        DesiredCapabilities caps = new DesiredCapabilities();

        //caps.setCapability("deviceId", "LGH910155883e4");

        caps.setCapability("deviceName", "MyphoneP4A28");

        caps.setCapability("platformName", "Android");

        caps.setCapability("appPackage", "com.android.calculator2");

        caps.setCapability("appActivity", ".Calculator");



        // Instantiate Appium Driver

        AppiumDriver driver = null;

        try {

            // Initialize driver

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            System.out.println("Calculator is open");

        } catch (MalformedURLException e) {

            System.out.println(e.getMessage());

        }

    }
}