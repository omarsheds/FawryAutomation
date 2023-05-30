package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    WebDriver driver;
    private  By allDropdown = By.id("nav-hamburger-menu");
    private  By loginButton = By.linkText("Sign in");
    private By seeAllButton = By.xpath("//div[text()=\"see all\"]");
    private By gamesOption = By.xpath("//div[text()=\"Video Games\"]/parent::a");
    private By allVideoGamesOption = By.xpath("//a[text()=\"All Video Games\"]");
    private By helloSignInLabel = By.id("nav-link-accountList-nav-line-1");

    public LandingPage(WebDriver driver){this.driver=driver;}

    public LoginPage clickOnLoginButton() throws InterruptedException {

        Thread.sleep(5000);
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

    public String HelloText(){
        WebElement element = driver.findElement(helloSignInLabel);
        return element.getText();
    }



}
