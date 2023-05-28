import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectModel.BuyItem;

public class BuyItemTC {
    @Test
    public void checkIfAllItemsSelected(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.eg/ype%3A28071525031&s=price-desc-rank&dc&language=en&ds=v1%3AJJoCE980BXOxrUi%2BpIUz2W9Vzfr27IPfFVrKi8bThfE&qid=1685294654&rnid=28071523031&ref=sr_st_price-desc-rank");
        BuyItem buyItem = new BuyItem(driver);
        buyItem.clickItemLessFifteen();

    }
}
