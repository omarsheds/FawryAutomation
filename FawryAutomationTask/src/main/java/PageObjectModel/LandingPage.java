package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;
    By allDropdown = By.id("nav-hamburger-menu");
    By loginButton = By.id("hmenu-customer-name");


    public LandingPage(WebDriver driver){this.driver=driver}

    public LandingPage clickDropdown(){
        driver.findElement(dropdownLink).click();
        return this;
    }
}
