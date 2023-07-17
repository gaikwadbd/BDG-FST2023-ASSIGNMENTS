package pages;

import static core.DriverFactory.getDriver;

import core.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

import java.time.Duration;

public class SBResumoPage extends BasePage {
	
	public void waitForText(String value) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='" + value + "']")));
	}

	public void swipeElementLeft(String movement) {
		swipeElement(getDriver().findElement(AppiumBy.xpath("//*[@text = '" + movement + "']/..")), 0.1, 0.9);
	}

	public void swipeElementRight(String movement) {
		swipeElement(getDriver().findElement(By.xpath("//*[@text = '" + movement + "']/..")), 0.9, 0.1);
	}
	
	public void clickBtnDelete() {
		new TouchAction<>(getDriver())
				.tap(ElementOption.element(getDriver()
				.findElement(By.xpath("//*[@text='Del']/.."))))
				.perform();
	}
}
