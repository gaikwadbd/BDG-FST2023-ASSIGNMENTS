package examples.applicationTest;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;
import pages.SwipeListPage;

public class SwipeListTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Before
	public void menuSwipeList() {
		page.waitMenu();
		menu.swipeList();
	}
	
	@Test
	public void interativeSwipeList1() {
		page.swipeElementRight("Opção 1");
		page.BtnMoreOptions();
		assertTrue(menu.checkTextElement("Opção 1 (+)"));
	}
	
	@Test	
	public void interativeSwipeList4() {
		page.swipeElementRight("Opção 4");
		page.clickByText("(-)");
		assertTrue(menu.checkTextElement("Opção 4 (-)"));
	}
	
	@Test	
	public void swipeListRestart() {
		page.swipeElementLeft("Opção 5 (-)");
		assertTrue(menu.checkTextElement("Opção 5"));
	}
}
