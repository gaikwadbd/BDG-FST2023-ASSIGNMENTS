package examples.Movies.tests;


import examples.Movies.pages.MoviesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchMovieTest extends TestsBase{

     MoviesPage moviesPage;
    String textSearch = "Forrest Gump";
    @Test
    public void searchMovie() {
        moviesPage = new MoviesPage(driver);
        waitForVisibility(moviesPage.getSelectedMenu());
        Assert.assertEquals(moviesPage.getSelectedMenu().getText(),"Home");
        moviesPage.getSearchBar().click();
        moviesPage.getSearchBar().sendKeys(textSearch + "\n");
        waitForVisibility(moviesPage.getSearchedFirstMovie());
        Assert.assertEquals(moviesPage.getSearchedFirstMovie().getText(), textSearch);
    }
}
