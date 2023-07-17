package examples.Movies.steps;
import examples.Movies.pages.MoviesPage;
import examples.Movies.tests.TestsBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


import java.net.MalformedURLException;

public class ChangeCountryFromSettings extends TestsBase {
    MoviesPage moviesPage;
    String selectedCountry;
    @Given("^Click on app settings$")
    public void clickOnAppSettings() throws MalformedURLException {
        var driver = setUp();
        moviesPage = new MoviesPage(driver);
        waitForVisibility(moviesPage.getSelectedMenu());
        moviesPage.getAppOptions().click();
        moviesPage.getSettings().click();
    }

    @Given("^Click on country settings$")
    public void clickOnCountrySettings() {
        waitForVisibility(moviesPage.getCountryOption());
        moviesPage.getCountryOption().click();
    }

    @When("^Select second country from the list$")
    public void selectSecondCountryFromTheList() {
        waitForVisibility(moviesPage.getCountry());
        selectedCountry = moviesPage.getCountry().getText();
        moviesPage.getCountry().click();
    }

    @Then("^Second country name is listed in Theatres Tab$")
    public void secondCountryNameIsListedInTheatresTab() {
        moviesPage.getTheatreMenu().click();
        waitForVisibility(moviesPage.getTheatreMenuHeading());
        Assert.assertEquals(moviesPage.getTheatreMenuHeading().getText(), selectedCountry.toUpperCase());
        tearDown();
    }
}
