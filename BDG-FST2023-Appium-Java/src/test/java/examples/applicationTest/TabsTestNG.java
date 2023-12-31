package examples.applicationTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.BaseTest;
import pages.MenuPage;
import pages.TabsPage;

public class TabsTestNG extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private TabsPage page = new TabsPage();
	
	@BeforeClass
	public void menu() {
		menu.tabs();
	}
	
	@Test(groups = {"Verify, Tabs"}, priority = 1, testName = "Check functionality - Tabs")
	public void Tabs() {
		Assert.assertEquals("Este é o conteúdo da Aba 1", page.checkTabOne());
		page.changeTab();
		Assert.assertEquals("Este é o conteúdo da Aba 2", page.checkTabTwo());
	}
}
