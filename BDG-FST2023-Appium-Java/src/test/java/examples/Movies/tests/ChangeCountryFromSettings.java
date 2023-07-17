package examples.Movies.tests;

import examples.Movies.pages.MoviesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ChangeCountryFromSettings extends TestsBase {
    MoviesPage moviesPage;
    String selectedCountry;
    @Test
    public void clickOnAppSettings() throws MalformedURLException {
        var driver = setUp();
        moviesPage = new MoviesPage(driver);
        waitForVisibility(moviesPage.getSelectedMenu());
        moviesPage.getAppOptions().click();
        moviesPage.getSettings().click();
    }

    @Test
    public void clickOnCountrySettings() {
        waitForVisibility(moviesPage.getCountryOption());
        moviesPage.getCountryOption().click();
    }

   @Test
    public void selectSecondCountryFromTheList() {
        waitForVisibility(moviesPage.getCountry());
        selectedCountry = moviesPage.getCountry().getText();
        moviesPage.getCountry().click();
    }

    @Test
    public void secondCountryNameIsListedInTheatresTab() {
        moviesPage.getTheatreMenu().click();
        waitForVisibility(moviesPage.getTheatreMenuHeading());
        Assert.assertEquals(moviesPage.getTheatreMenuHeading().getText(), selectedCountry.toUpperCase());
        tearDown();
    }
}
