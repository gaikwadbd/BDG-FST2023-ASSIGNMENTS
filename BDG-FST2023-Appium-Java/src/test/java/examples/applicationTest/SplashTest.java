package examples.applicationTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;
import pages.SplashPage;

public class SplashTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void interativeSplash() {
		menu.splash();
		page.splashTextVisible();
		page.splasTextInvisible();
		assertTrue(page.checkTextElement("Splash!"));
	}
	
}
