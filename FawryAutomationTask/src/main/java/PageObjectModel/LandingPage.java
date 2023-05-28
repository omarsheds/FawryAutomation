package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;
    By allDropdown = By.id("nav-hamburger-menu");
    By loginButton = By.id("hmenu-customer-name");
    By seeAllButton = By.cssSelector("[class=\"hmenu-item hmenu-compressed-btn\"]");

    By gamesOption = By.cssSelector("a[data-menu-id=\"16\"]");
    By allVideoGamesOption = By.xpath("//a[text()=\"All Video Games\"]");

    public LandingPage(WebDriver driver){this.driver=driver;}

    public LoginPage clickOnLoginButton(){
        driver.findElement(allDropdown).click();
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public VideoGamesPage chooseAllVideoGamesFromAllDropdown(){
        driver.findElement(allDropdown).click();
        driver.findElement(seeAllButton).click();
        driver.findElement(gamesOption);
        driver.findElement(allVideoGamesOption);
        return new VideoGamesPage(driver);
    }
}
