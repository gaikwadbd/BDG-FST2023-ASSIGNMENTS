package examples.practice;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PrintAllContacts {
    DesiredCapabilities dc;
    AndroidDriver driver;

    //Method - 3
    public void verticalSwipe(AndroidDriver driver, double startPercentage, double endPercentage) throws Exception{
        Dimension size=driver.manage().window().getSize();
        int width=(int)(size.getWidth()/2);
        int startPoint_Y=(int)(size.getHeight()*startPercentage);

        int endPoint_Y=(int)(size.getHeight()*endPercentage);

        TouchAction action = new TouchAction(driver);
        action.longPress(PointOption.point(width, startPoint_Y)).moveTo(PointOption.point(width, endPoint_Y)).release().perform();
    }

    //Method - 1
    public void verticalSwipe2(AndroidDriver driver, double startPercentage, double endPercentage){
        Dimension size=driver.manage().window().getSize();
        int width=(int)(size.getWidth()/2);
        int startPoint_Y=(int)(size.getHeight()*startPercentage);

        int endPoint_Y=(int)(size.getHeight()*endPercentage);
        new TouchAction(driver).press(PointOption.point(width, startPoint_Y)).waitAction().moveTo(PointOption.point(width, endPoint_Y)).release().perform();

    }

    @Test
    public void f(){
        DesiredCapabilities dc=new DesiredCapabilities();
        try{
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
           // dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
           // dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
            //dc.setCapability("udid", "emulator-5554");

            dc.setCapability("appPackage", "com.android.contacts");
            dc.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");

            Thread.sleep(2000);

            URL url=new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver driver=new AndroidDriver(url,dc);

            Thread.sleep(2000);

            for (int c = 0; c <=1; c++) {
                List<WebElement> str=driver.findElements(AppiumBy.id("com.android.contacts:id/cliv_name_textview"));
                System.out.println(str.size());
                for (int i = 0; i < str.size(); i++) {
                    System.out.println(str.get(i).getText());

                }

                verticalSwipe(driver, 0.80, 0.20);

            }

            Thread.sleep(3000);
            driver.quit();

        }
        catch(Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }


    }

}