package pages;

import core.BasePage;

public class SBMenuPage extends BasePage {
	
	public void accountTab(){
		clickByText("CONTAS");
	}
	
	public void transactionsTab() {
		clickByText("MOV...");
	}
	
	public void resumeTab() {
		clickByText("RESUMO");
	}
	
	public void homeTab() {
		clickByText("HOME");
	}

}
