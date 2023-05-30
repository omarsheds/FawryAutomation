package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By changeAddressIcon = By.id("addressChangeLinkId");
    private By addNewAddress = By.id("add-new-address-popover-link");
    private By countryDropdown = By.id("address-ui-widgets-countryCode");
    private By countrySelection = By.id("//a[text()=\"Egypt\"]");


    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    public CheckoutPage clickOnChangeAddress(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(changeAddressIcon));
        driver.findElement(changeAddressIcon).click();
        return this;
    }

    public CheckoutPage clickOnAddNewAddress(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addNewAddress));
        driver.findElement(addNewAddress).click();
        return this;
    }

    public CheckoutPage clickOnCountryDropdown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown));
        driver.findElement(countryDropdown).click();
        return this;
    }

    public CheckoutPage clickOnEgypt(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countrySelection));
        driver.findElement(countrySelection).click();
        return this;
    }



    public CheckoutPage goToCheckoutPage(){
        WebElement cartElement = driver.findElement(By.xpath("//span[@class=\"nav-cart-icon nav-sprite\"]"));
        cartElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("proceed-to-checkout-action")));
        WebElement proceedToBuyElement = driver.findElement(By.id("proceed-to-checkout-action"));
        proceedToBuyElement.click();
        return this;
    }


}
