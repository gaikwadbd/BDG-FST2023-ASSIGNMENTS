package examples.EMICalculator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIPage {
    @FindBy(id = "com.continuum.emi.calculator:id/btnStart")
    WebElement btnStart;
    @FindBy(id = "com.continuum.emi.calculator:id/etLoanAmount")
    WebElement txtLoanAmount;
    @FindBy(id = "com.continuum.emi.calculator:id/etInterest")
    WebElement txtInterest;
    @FindBy(id = "com.continuum.emi.calculator:id/etYears")
    WebElement txtYear;
    @FindBy(id="com.continuum.emi.calculator:id/etMonths")
    WebElement txtMonth;
    @FindBy(id = "com.continuum.emi.calculator:id/etFee")
    WebElement txtProcessingFee;
    @FindBy(id="com.continuum.emi.calculator:id/etEMI")
    WebElement txtEMI;
    @FindBy(id="com.continuum.emi.calculator:id/rbPeriod")
    WebElement btnPeriod;

    @FindBy(id = "com.continuum.emi.calculator:id/btnCalculate")
    WebElement btnCalculate;


    @FindBy(id = "com.continuum.emi.calculator:id/monthly_emi_result")
    WebElement txtEMIMonthlyAmountResult;
    @FindBy(id = "com.continuum.emi.calculator:id/total_interest_result")
    WebElement txtTotalInterestResult;
    @FindBy(id = "com.continuum.emi.calculator:id/processing_fee_result")
    WebElement txtProcessingFeeResult;
    @FindBy(id = "com.continuum.emi.calculator:id/total_payment_result")
    WebElement txtTotalPaymentResult;

    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    WebElement btnReset;

    public EMIPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void calculateEMI(int loanAmount, double interest, int emi, double processingFee ) throws InterruptedException {

        txtLoanAmount.sendKeys(""+loanAmount+"");
        txtInterest.sendKeys(""+interest+"");
        btnPeriod.click();
        txtEMI.sendKeys(""+emi+"");
        txtProcessingFee.sendKeys(""+processingFee+"");
        btnCalculate.click();
    }
}