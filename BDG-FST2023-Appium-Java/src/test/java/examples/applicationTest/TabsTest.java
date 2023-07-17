package examples.applicationTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import core.BaseTest;
import pages.MenuPage;
import pages.TabsPage;

public class TabsTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private TabsPage page = new TabsPage();
	
	@Before
	public void menu() {
		menu.tabs();
	}
	
	@Test
	public void Tabs() {
		assertEquals("Este é o conteúdo da Aba 1", page.checkTabOne());
		page.changeTab();
		assertEquals("Este é o conteúdo da Aba 2", page.checkTabTwo());
	}
}
