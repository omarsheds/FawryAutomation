package utils;

import PageObjectModel.CheckoutPage;
import PageObjectModel.LandingPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void addAddress() throws InterruptedException {
        LandingPage lp = new LandingPage(driver);
        lp
                .clickOnLoginButton()
                .LoginUsingEmailOrNumber(ConfigUtils.getInstanceofConfigUtils().getEmailOrNumber(),ConfigUtils.getInstanceofConfigUtils().getPassword());

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage
                .goToCheckoutPage()
                .clickOnChangeAddress()
                .clickOnAddNewAddress()
                .clickOnCountryDropdown()
                .clickOnEgypt();

    }

}
