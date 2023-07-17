package examples.applicationTest;


import static org.testng.AssertJUnit.assertEquals;


import core.BaseTest;

import org.testng.annotations.Test;
import pages.AccordionPage;
import pages.MenuPage;

public class AccordionTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void interactAccordion() {
		menu.accordion();
		page.acessAccordion();
		await(1000);
		assertEquals("Esta é a descrição da opção 1", page.validateAccordion()); 
	}

}
