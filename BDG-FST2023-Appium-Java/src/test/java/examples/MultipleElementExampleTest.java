package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class MultipleElementExampleTest{

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

        @Test
        public void listTheElements(){
        //wait until elements load on page
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                AppiumBy.className("android.webkit.WebView")));

        //Find all the elements on the page
            List<WebElement> items=driver.findElements
                    (AppiumBy.xpath("//android.view.View/android.widget.Button"));

            System.out.println(items.size());
            for(WebElement textItem : items ){
                System.out.println(textItem.getText());
            }
    }
    @AfterClass
    public void closeBrowser(){
        //close the browser
        driver.quit();
    }

}