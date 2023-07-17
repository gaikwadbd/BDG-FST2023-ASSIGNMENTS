package examples.Movies.tests;

import examples.Movies.pages.MoviesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gotoMovieDetailsTest extends TestsBase {
    MoviesPage moviesPage;
    @Test
    public void clickFirstMovie() {
        moviesPage = new MoviesPage(driver);
        waitForVisibility(moviesPage.getFirstMovie());
        Assert.assertEquals(moviesPage.getSelectedMenu().getText(),"Home");
        moviesPage.getFirstMovie().click();
        waitForVisibility(moviesPage.getMovieName());
        Assert.assertEquals(moviesPage.getMovieName().getText(),"Avatar: The Way of Water");
        Assert.assertEquals(moviesPage.getAddToWatchList().getText(),"ADD TO WATCHLIST");
        Assert.assertTrue(moviesPage.getMovieDetails().isDisplayed());
    }
}
