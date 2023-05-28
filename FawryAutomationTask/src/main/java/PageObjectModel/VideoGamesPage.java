package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VideoGamesPage {

    WebDriver driver;
    private By freeShippingCheckBox = By.xpath("//div[@class=\"a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox\"]//i[@class=\"a-icon a-icon-checkbox\"]");
    private By newCondition = By.xpath("//li[@id=\"p_n_condition-type/28071525031\"]//span[@class=\"a-size-base a-color-base\"]");
    private By sortList = By.xpath("//span[@class=\"a-button-text a-declarative\"]");
    private By highToLowSelection = By.xpath("//a[text()=\"Price: High to Low\"]");


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


}
