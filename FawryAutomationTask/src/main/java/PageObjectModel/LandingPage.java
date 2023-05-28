package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;
    By allDropdown = By.id("nav-hamburger-menu");
    By loginButton = By.linkText("Sign in");
    By seeAllButton = By.xpath("//div[text()=\"see all\"]");
    By gamesOption = By.xpath("//div[text()=\"Video Games\"]/parent::a");
    By allVideoGamesOption = By.xpath("//a[text()=\"All Video Games\"]");

    public LandingPage(WebDriver driver){this.driver=driver;}

    public LoginPage clickOnLoginButton() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public VideoGamesPage chooseAllVideoGamesFromAllDropdown() throws InterruptedException {
        driver.findElement(allDropdown).click();
        Thread.sleep(1000);
        driver.findElement(seeAllButton).click();
        Thread.sleep(2000);
        driver.findElement(gamesOption).click();
        driver.findElement(allVideoGamesOption).click();
        return new VideoGamesPage(driver);
    }
}
