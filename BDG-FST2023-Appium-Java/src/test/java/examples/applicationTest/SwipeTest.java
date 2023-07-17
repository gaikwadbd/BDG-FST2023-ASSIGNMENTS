package examples.applicationTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BasePage;
import core.BaseTest;
import pages.MenuPage;

public class SwipeTest extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private BasePage page = new BasePage();

	@Test
	public void interativeSwipe() {
		//acessar menu
		page.waitMenu();
		menu.swipe();
		
		assertTrue(menu.checkTextElement("a esquerda"));
		
		menu.SwipeRight();
		assertTrue(menu.checkTextElement("E veja se"));
		
		page.clickByText("›");
		assertTrue(menu.checkTextElement("Chegar até o fim!"));
		
		menu.swipeLeft();
		
		page.clickByText("‹");
		assertTrue(menu.checkTextElement("a esquerda"));
	}
	
}
