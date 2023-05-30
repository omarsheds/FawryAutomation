package testcases;

import PageObjectModel.LandingPage;
import base.BaseTest;
import org.testng.annotations.Test;
import utils.ConfigUtils;

public class AddItemsTest extends BaseTest {

@Test
    public void NavigateToAllGames() throws InterruptedException {
    LandingPage lp = new LandingPage(driver);
    lp
            .clickOnLoginButton()
            .LoginUsingEmailOrNumber(ConfigUtils.getInstanceofConfigUtils().getEmailOrNumber(),ConfigUtils.getInstanceofConfigUtils().getPassword())
            .chooseAllVideoGamesFromAllDropdown()
            .clickOnFreeShippingCheckBox()
            .clickOnNewCondition()
            .selectFromSortingDropDownFromHighToLow()
            .clickItemLessFifteen()
            .selectFromSortingDropDownFromHighToLow();

}
}
