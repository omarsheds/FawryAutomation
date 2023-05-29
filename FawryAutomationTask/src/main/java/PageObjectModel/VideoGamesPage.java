package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class VideoGamesPage {

    WebDriver driver;
    private By freeShippingCheckBox = By.xpath("//div[@class=\"a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox\"]//i[@class=\"a-icon a-icon-checkbox\"]");
    private By newCondition = By.xpath("//li[@id=\"p_n_condition-type/28071525031\"]//span[@class=\"a-size-base a-color-base\"]");
    private By sortList = By.xpath("//span[@class=\"a-button-text a-declarative\"]");
    private By highToLowSelection = By.xpath("//a[text()=\"Price: High to Low\"]");
    private By inventoryItemsPrice= By.xpath("//span[@class=\"a-price-whole\"]");

    private By AddToCartButton = By.id("add-to-cart-button");
    private By itemAddedLabel = By.xpath("//span[contains(text(), 'Added to Cart')]");



    public VideoGamesPage(WebDriver driver){
        this.driver=driver;
    }

    public VideoGamesPage clickOnFreeShippingCheckBox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(freeShippingCheckBox));
        driver.findElement(freeShippingCheckBox).click();
        return this;
    }

    public VideoGamesPage clickOnNewCondition(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCondition));
        driver.findElement(newCondition).click();
        return this;
    }

    private WebElement findSortingDropdownElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortList));
        return driver.findElement(sortList);
    }

    public VideoGamesPage selectFromSortingDropDownFromHighToLow() {
        findSortingDropdownElement().click();
        driver.findElement(highToLowSelection).click();
        return this;
    }

    public By getFreeShippingCheckBox(){
       return freeShippingCheckBox;
    }

    public VideoGamesPage clickItemLessFifteen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"a-price-whole\"]")));

        List<WebElement> priceElements = driver.findElements(inventoryItemsPrice);
        for (WebElement element : priceElements) {
            int price = Integer.parseInt(element.getText().replace(",", ""));
            if (price < 15000) {
                element.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartButton));
                driver.findElement(AddToCartButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(itemAddedLabel));
                driver.navigate().back();
                driver.navigate().back();
            }
        }
        return this;
    }


}
