package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;

public class SplashPage extends BasePage {
	
	public boolean splashTextVisible() {
		return checkTextElement("Splash!");
	}
	
	public void splasTextInvisible() {
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("Splash!")));
	}

}
