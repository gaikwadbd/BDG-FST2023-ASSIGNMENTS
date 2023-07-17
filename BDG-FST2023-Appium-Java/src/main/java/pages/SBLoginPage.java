package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class SBLoginPage extends BasePage {
	
	public void setEmail(String email) {
		write(By.className("android.widget.EditText"), email);
	}
	
	public void setSenha(String senha) {
		write(By.xpath("//android.widget.EditText[2]"), senha);
	}
	
	public void btnEnter() {
		clickByText("ENTRAR");
	}

}
