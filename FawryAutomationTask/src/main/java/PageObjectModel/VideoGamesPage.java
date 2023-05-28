package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VideoGamesPage {

    WebDriver driver;
    private By freeShippingCheckBox = By.xpath("//div[@class=\"a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox\"]//i[@class=\"a-icon a-icon-checkbox\"]");
    private By newCondition = By.xpath("//li[@id=\"p_n_condition-type/28071525031\"]//span[@class=\"a-size-base a-color-base\"]");
    private By sortList = By.xpath("//span[@class=\"a-button-text a-declarative\"]");

    public VideoGamesPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnFreeShippingCheckBox(){
        driver.findElement(freeShippingCheckBox).click();
    }

    public void clickOnNewCondition(){
        driver.findElement(newCondition).click();
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(sortList));
    }

    public void selectFromDropDown () {
        String string = "Price: High to Low";
        findDropdownElement().selectByVisibleText(string);
    }

    public By getFreeShippingCheckBox(){
       return freeShippingCheckBox;
    }


}
