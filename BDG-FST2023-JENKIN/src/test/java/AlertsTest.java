import org.testng.annotations.Test;
import pages.AlertsPage;


public class AlertsTest extends test.java.BaseTest {
	
  @Test
  public void triggerSimpleAlert() {
	  AlertsPage page = new AlertsPage(driver);
	  page.goToPage().getButton(page.SimpleAlertButton).click();
	  page.getAlertTextAndAccept();
  }

}
