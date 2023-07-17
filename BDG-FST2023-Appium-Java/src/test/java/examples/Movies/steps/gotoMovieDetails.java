package examples.Movies.steps;

import examples.Movies.pages.MoviesPage;
import examples.Movies.tests.TestsBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;



import java.net.MalformedURLException;

public class gotoMovieDetails extends TestsBase {

    MoviesPage moviesPage;
    @Given("^Movies list is opened$")
    public void moviesListIsOpened() throws MalformedURLException {
        var driver = setUp();
        moviesPage = new MoviesPage(driver);
    }

    @When("^Click on first movie$")
    public void clickOnFirstMovie() {
        waitForVisibility(moviesPage.getFirstMovie());
        moviesPage.getFirstMovie().click();
    }

    @Then("^Movie detail screen is opened$")
    public void movieDetailScreenIsOpened() {
        waitForVisibility(moviesPage.getMovieDetails());
        Assert.assertTrue(moviesPage.getMovieDetails().isDisplayed());
        tearDown();
    }
}
