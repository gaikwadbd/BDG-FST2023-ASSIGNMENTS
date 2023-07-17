package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class TabsPage extends BasePage {
	
	public String checkTabOne() {
		return getText(By.xpath("//*[contains(@text, 'Aba 1')]"));
	}
	
	public String checkTabTwo() {
		return getText(By.xpath("//*[contains(@text, 'Aba 2')]"));
	}
	
	public void changeTab() {
		clickByText("ABA 2");
	}
	
}
