package examples.practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.net.MalformedURLException;

public class GeneralStoreTest3 extends BaseTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities(true);

        // locators
        WebElement  countryDropdown = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
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

        int count = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).size();
        for (int i=0;i<count;i++) { //O(n) time complexity
            driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
        }
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        int SECONDS_TO_WAIT = 4;
        int MILISECS_IN_A_SEC = 1000;
        /*
         * this wait is needed so appium has time to process the changed view
         */
        Thread.sleep(SECONDS_TO_WAIT*MILISECS_IN_A_SEC);

        double priceSum = 0;
        int cartCounter = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice")).size();
        for(int j=0;j<cartCounter;j++) { //O(n) time complexity
            /*
             * get(index) method is a constant time O(1) operation
             */
            String price = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice")).get(j).getText();
            priceSum = priceSum + Double.parseDouble(price.substring(1));
        }

        String totalPrice = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        double totalAmount = Double.parseDouble(totalPrice.substring(1));

        Assert.assertEquals(priceSum, totalAmount);
    }
}