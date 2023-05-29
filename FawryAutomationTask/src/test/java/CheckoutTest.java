import PageObjectModel.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static PageObjectModel.VideoGamesPage.productNames;

public class CheckoutTest {

@Test
    public void addItemsBelow15kAndCheckTheyExistInCart() throws InterruptedException {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.amazon.eg/?language=en_AE");
    driver.manage().window().maximize();
    LandingPage lp = new LandingPage(driver);
    SoftAssert soft = new SoftAssert();


            List<String> productsInCart = lp.clickOnLoginButton()
            .LoginUsingEmailOrNumber("","")
            .chooseAllVideoGamesFromAllDropdown()
            .clickOnFreeShippingCheckBox()
            .clickOnNewCondition()
            .selectFromSortingDropDownFromHighToLow()
            .clickItemLessFifteen().goToCart().getProductsNamesInCart();

    for(int i = 0 ; i< productNames.size();i++){
        soft.assertEquals(productNames.get(i),productsInCart.get(productNames.size()-1-i),"Not the right Product");
    }
        soft.assertAll();
}
}
