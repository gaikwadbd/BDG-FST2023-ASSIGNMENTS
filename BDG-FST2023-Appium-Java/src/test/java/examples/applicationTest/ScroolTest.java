package examples.applicationTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.BaseTest;
import pages.AlertPage;
import pages.MenuPage;

public class ScroolTest extends BaseTest {	
	
	private MenuPage menu = new MenuPage();
	private AlertPage alert = new AlertPage();
	
	@Test
	public void scrool() {
		
		//Wait Formulário
		menu.waitMenu();
		
		menu.scrollDown();
		
		//clicar menu
		menu.clickByText("Opção bem escondida");
		
		//verificar mensagem
		assertEquals("Você achou essa opção", alert.getMessageAlert());
		
		//sair
		menu.clickByText("OK");
		
	}
}
