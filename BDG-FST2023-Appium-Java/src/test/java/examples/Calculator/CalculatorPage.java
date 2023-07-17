package examples.Calculator;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_9")
    WebElement btn9;
    @FindBy(id= CalculatorSetup.PACKAGE_ID+":id/digit_8")
    WebElement btn8;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_5")
    WebElement btn5;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_4")
    WebElement btn4;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_3")
    WebElement btn3;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_2")
    WebElement btn2;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_1")
    WebElement btn1;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/digit_0")
    WebElement btn0;
    @FindBy(id= CalculatorSetup.PACKAGE_ID+":id/op_add")
    WebElement btnPlus;
    @FindBy(id= CalculatorSetup.PACKAGE_ID+":id/op_sub")
    WebElement btnMinus;
    @FindBy(id=CalculatorSetup.PACKAGE_ID+":id/op_mul")
    WebElement btnMul;
    @FindBy(id=CalculatorSetup.PACKAGE_ID+":id/op_div")
    WebElement btnDiv;
    @FindBy(id=CalculatorSetup.PACKAGE_ID+":id/eq")
    WebElement btnEql;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/result")
    WebElement resultFinal;
    @FindBy(id = CalculatorSetup.PACKAGE_ID+":id/clr")
    WebElement btnClr;


    public CalculatorPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String additionTest() throws InterruptedException {
        Thread.sleep(10);
        btn9.click();
        btnPlus.click();
        btn5.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String substractionTest() throws InterruptedException {
        Thread.sleep(10);
        btn8.click();
        btnMinus.click();
        btn3.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String multiplicationTest() throws InterruptedException {
        Thread.sleep(10);
        btnMul.click();
        btn1.click();
        btn4.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String divisionTest() throws InterruptedException {
        Thread.sleep(10);
        btnDiv.click();
        btn1.click();
        btn0.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String seriesTest() throws InterruptedException {
        Thread.sleep(10);
        btn1.click();
        btn0.click();
        btn0.click();
        btnPlus.click();
        btn2.click();
        btn0.click();
        btn0.click();
        btnMinus.click();
        btn1.click();
        btn0.click();
        btn0.click();
        btnMul.click();
        btn2.click();
        btnDiv.click();
        btn5.click();
        btnEql.click();
        return resultFinal.getText();
    }
}