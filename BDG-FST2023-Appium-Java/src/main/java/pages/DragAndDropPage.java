package pages;

import static core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;

import core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends BasePage {
	
	public void move (String by, String to) {
			new TouchAction<>(getDriver())
			.longPress(ElementOption.element(getDriver()
			.findElement(By.xpath("//*[@text='"+ by +"']"))))

			.moveTo(ElementOption.element(getDriver()
			.findElement(By.xpath("//*[@text='"+ to +"']"))))
			.release()
			.perform();
	}
	
	public String[] getList() {
		List <WebElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String[] returnList = new String[elements.size()];
		
		for (int i = 0; i < elements.size(); i++) {
			returnList[i] = elements.get(i).getText();
		}
		return returnList;
	}
	
}
