package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();

    private By signInLink = By.linkText("Sign in");
    private By emailField = By.id("user-identifier-input");
    private By passwordField = By.id("password-input");
    private By submitButton = By.id("submit-button");
    private By weatherLink = By.cssSelector("#header-content > nav > div.ssrcss-1ocoo3l-Wrap.e42f8511 > div > div.ssrcss-fr8ebb-GlobalNavigationItem.e1gviwgp23 > ul.ssrcss-1p6tp05-ChameleonGlobalNavigationLinkList-En.e16i5fd20 > li:nth-child(4) > a > span");
    private By searchField = By.id("ls-c-search__input-label");

    private By searchLoc = By.id("ls-c-search__input-label");
    private By searchButton = By.cssSelector("#wr-location-search-container > div > div.ls-ui-ctrl-primary-search > form > div > input");
    private By preferredLoc = By.linkText("London, Greater London");
    private By addLocation = By.cssSelector("#wr-forecast > div.wr-day-container.wr-day-container--clear-sky-night > div.wr-c-location > div > div.ls-ui-follow-button-container > button");

    //creating method below and passing my locator IDs

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void enterEmail(final String email){driver.findElement(emailField).sendKeys(email);}

    public void clickSignInLink(){driver.findElement(signInLink).click();}

    public void enterPassword(final String password){driver.findElement(passwordField).sendKeys(password);}

    public void clickSubmitButton(){driver.findElement(submitButton).click();}
    public void clickWeatherLink(){driver.findElement(weatherLink).click();}
    public void enterSearchLocation(String location){driver.findElement(searchField).sendKeys(location);}

    public void enterSearchLoc(String loc){driver.findElement(searchField).sendKeys(loc);}
    public void clickSearchButton(){driver.findElement(searchButton).click();}
    public void clickPreferredLoc(){driver.findElement(preferredLoc).click();}
    public void clickAddLocation(){driver.findElement(addLocation).click();}
}
