package examples.Calculator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalculatorSetup {
    public static final String PACKAGE_ID="com.android.calculator2";
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {

        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability("deviceName","MyphoneP4A28");
        caps.setCapability("platformName","Android");
        //caps.setCapability("os","11");
        caps.setCapability("appPackage",PACKAGE_ID);
        caps.setCapability("appActivity",".Calculator");
        //caps.setCapability("app","D:\\APK\\calculator.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver;
    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
