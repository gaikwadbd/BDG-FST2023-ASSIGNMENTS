package examples.Calculator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalculatorTest extends CalculatorSetup {
    CalculatorPage cal;
    @Test (priority = 1,description = "Sum between two numbers")
    public void additionTest() throws InterruptedException {
        cal = new CalculatorPage(driver);
        String sum = cal.additionTest();
        //System.out.println(sum);

        //Assertion
        Assert.assertEquals(sum, "14");
        cal.btnClr.clear();

    }

    @Test (priority = 2,description = "Sub between two numbers")
    public void substractionTest() throws InterruptedException {
        cal = new CalculatorPage(driver);
        String sub = cal.substractionTest();
        //System.out.println(sub);

        //Assertion
        Assert.assertEquals(sub, "5");
    }

    @Test (priority = 3,description = "Multiply the result of sum and subtraction")
    public void multiplicationTest() throws InterruptedException {
        cal = new CalculatorPage(driver);
        String mul=cal.multiplicationTest();
        //System.out.println(mul);

        //Assertion
        Assert.assertEquals(mul,"70");
    }

    @Test (priority = 4,description = " Divide the result of multiplication with 10")
    public void divisionTest() throws InterruptedException {
        cal = new CalculatorPage(driver);
        String div=cal.divisionTest();
        cal.btnClr.clear();
        //System.out.println(div);

        //Assertion
        Assert.assertEquals(div,"7");
    }
    @Test (priority = 5,description = " Calculate the Series equation")
    public void seriesTest() throws InterruptedException {
        cal = new CalculatorPage(driver);
        String ser=cal.seriesTest();
        cal.btnClr.clear();
        //System.out.println(ser);

        //Assertion
        Assert.assertEquals(ser,"260");
    }
    //@AfterMethod
    public void clearScreen(){
        cal=new CalculatorPage(driver);
        cal.btnClr.clear();
    }
}