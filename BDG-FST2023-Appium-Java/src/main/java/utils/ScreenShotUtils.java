package utils;


import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class ScreenShotUtils {

    AppiumDriver driver;

    public ScreenShotUtils(AppiumDriver driver) {
        this.driver = driver;
    }

    public void takeWholeScreenShot() {
        String imagePath = System.getProperty("user.dir") + File.separator + "ScreenShot" + File.separator + "whole_screen.png";
        File image = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(image, new File(imagePath));
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    public void takeElemScreenShot(WebElement element, String fileName) {
        String csScreenLocation = System.getProperty("user.dir") + File.separator + "ScreenShot" + File.separator + fileName + ".png";
        File elemScreenShot = element.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(elemScreenShot, new File(csScreenLocation));
        } catch (IOException ex) { ex.printStackTrace(); }
    }

}