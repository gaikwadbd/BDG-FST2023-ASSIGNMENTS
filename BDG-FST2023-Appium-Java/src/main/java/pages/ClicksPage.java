package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class ClicksPage extends BasePage {
	
	public void longClick() {
		new TouchAction<>(getDriver())
		.longPress(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='Clique Longo']")))).perform();
	}
	
	public String getTextField() {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}
	
}