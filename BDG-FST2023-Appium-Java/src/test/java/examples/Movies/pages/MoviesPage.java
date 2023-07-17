package examples.Movies.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoviesPage {
    WebDriver driver;
    By selectedMenu = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/largeLabel");
    By firstMovie = By.xpath("//android.widget.ImageView[@index='1']");
    By movieName = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/tvTitle");
    By addToWatchList = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/btToggleWatchlist");
    By movieDetails = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/rvMovieDetails");
    By searchBar = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/etSearchBox");
    By searchedfirstMovie = By.xpath("//android.widget.TextView[@index='1']");
    By castMember = By.xpath("//android.widget.LinearLayout[2]/android.widget.ImageView");
    By bioHeading = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/tvSectionHeader");
    By actorDetails = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/rvActorDetails");
    By appOptions = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    By settings = By.xpath("//android.widget.LinearLayout[3]");
    By countryOption = By.xpath("//android.widget.LinearLayout[2][@index='1']");
    By country = By.xpath("//android.widget.CheckedTextView[3][@index='2']");
    By theatreMenu = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/inTheatresFragmentDestination");
    By theatreMenuHeading = By.id("com.kshitijchauhan.haroldadmin.moviedb:id/tvSectionHeader");


    public MoviesPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSelectedMenu() {
        return driver.findElement(selectedMenu);
    }
    public WebElement getFirstMovie() {
        return driver.findElement(firstMovie);
    }
    public WebElement getMovieName() {
        return driver.findElement(movieName);
    }
    public WebElement getAddToWatchList() {
        return driver.findElement(addToWatchList);
    }
    public WebElement getMovieDetails() {
        return driver.findElement(movieDetails);
    }
    public WebElement getSearchBar() {
        return driver.findElement(searchBar);
    }
    public WebElement getSearchedFirstMovie() {
        return driver.findElement(searchedfirstMovie);
    }
    public WebElement getCastMember() {
        return driver.findElement(castMember);
    }
    public WebElement getBioHeading() {
        return driver.findElement(bioHeading);
    }
    public WebElement getActorDetails() {
        return driver.findElement(actorDetails);
    }
    public WebElement getAppOptions() {
        return driver.findElement(appOptions);
    }
    public WebElement getSettings() {
        return driver.findElement(settings);
    }
    public WebElement getCountryOption() {
        return driver.findElement(countryOption);
    }
    public WebElement getCountry() {
        return driver.findElement(country);
    }
    public WebElement getTheatreMenu() {
        return driver.findElement(theatreMenu);
    }
    public WebElement getTheatreMenuHeading() {
        return driver.findElement(theatreMenuHeading);
    }
}