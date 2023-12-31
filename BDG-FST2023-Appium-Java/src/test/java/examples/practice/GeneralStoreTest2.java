package examples.practice;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class GeneralStoreTest2 extends BaseTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities(true);

        // locators
        WebElement countryDropdown = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
        WebElement inputText = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        WebElement radioFemale = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
        WebElement shopButton = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));

        // positive path flow
        inputText.click();
        inputText.sendKeys("hello");
        driver.hideKeyboard();
        radioFemale.click();
        countryDropdown.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
        shopButton.click();
        String product = "Jordan 6 Rings";
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()" +
                ".resourceId(\"com.androidsample.generalstore:id/rvProductList\"))" +
                ".scrollIntoView(new UiSelector().text(\""+ product + "\"));"));
        // picking a product dynamically from the list
        int count = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).size();
        for (int i=0;i<count;i++) { //O(n) time complexity
            String productName = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).get(i).getText();
            if (productName.equalsIgnoreCase(product)) {
                driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
                break;
            }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        /*
         * Stale Element Reference Exception
         * it's happening because it tries to find the object immediately but needs some
         * time to find the element in the new view
         * And this is because there was another element with the same locator attributes
         * in the previous view so it thinks it's trying to use the element from
         * the previous view
         * for more info: https://www.selenium.dev/exceptions/#stale_element_reference.html
         *
         * Solution
         * invoke a thread.sleep for at least a second to give it time to process the new view
         */
        Thread.sleep(1000);
        String productNameOnCart = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals(productNameOnCart, product);
    }
}