package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;
    By allDropdown = By.id("nav-hamburger-menu");
    By loginButton = By.linkText("Sign in");
    By seeAllButton = By.xpath("//div[text()=\"see all\"]");
    By gamesOption = By.xpath("//div[text()=\"Video Games\"]/parent::a");
    By allVideoGamesOption = By.xpath("//a[text()=\"All Video Games\"]");
    WebDriverWait wait;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LoginPage clickOnLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public VideoGamesPage chooseAllVideoGamesFromAllDropdown(){
        driver.findElement(allDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(seeAllButton));
        driver.findElement(seeAllButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(gamesOption));
        driver.findElement(gamesOption).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(allVideoGamesOption));
        driver.findElement(allVideoGamesOption).click();
        return new VideoGamesPage(driver);
    }
}
