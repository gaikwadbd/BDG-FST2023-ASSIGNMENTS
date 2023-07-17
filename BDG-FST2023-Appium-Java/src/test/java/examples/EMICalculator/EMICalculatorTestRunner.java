package examples.EMICalculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class EMICalculatorTestRunner extends EMISetup {
    @BeforeTest
    public void startEMICalc(){
        EMIPage emiPage = new EMIPage(driver);
        emiPage.btnStart.click();
    }
    @Test(dataProvider = "data-provider", dataProviderClass = TestDataSet.class)
    public void EMICalculations(int loanAmount, double interest, int emi, double processingFee, double monthlyEMI, double totalInterest, int processingFeeTotal, double totalPayment, int year,int month) throws InterruptedException, IOException {
        String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        EMIPage emiPage = new EMIPage(driver);
        emiPage.calculateEMI(loanAmount, interest, emi, processingFee);

        double monthlyEMIActual = Double.parseDouble(emiPage.txtEMIMonthlyAmountResult.getText().replace(",", ""));
        double totalInterestActual = Double.parseDouble(emiPage.txtTotalInterestResult.getText().replace(",", ""));
        double totalProcessingFeeActual = Double.parseDouble(emiPage.txtProcessingFeeResult.getText().replace(",", ""));
        double totalPaymentActual = Double.parseDouble(emiPage.txtTotalPaymentResult.getText().replace(",", ""));
        double yearActual= Double.parseDouble(emiPage.txtYear.getText());
        double monthActual=Double.parseDouble(emiPage.txtMonth.getText());
        takeScreenshot(testName+" of Loan amount-"+loanAmount,this.driver);
        Assert.assertEquals(monthlyEMIActual, monthlyEMI);
        Assert.assertEquals(totalInterestActual, totalInterest);
        Assert.assertEquals(totalProcessingFeeActual, processingFeeTotal);
        Assert.assertEquals(totalPaymentActual, totalPayment);
        Assert.assertEquals(yearActual,year);
        Assert.assertEquals(monthActual,month);

        emiPage.btnReset.click();
    }
}