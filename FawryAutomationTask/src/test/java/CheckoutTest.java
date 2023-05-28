import PageObjectModel.LandingPage;
import PageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CheckoutTest {

@Test
    public void NavigateToAllGames() throws InterruptedException {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.amazon.eg/?language=en_AE");
    LandingPage lp = new LandingPage(driver);
    lp.clickOnLoginButton().LoginUsingEmailOrNumber("+201126824551","anaomar999").chooseAllVideoGamesFromAllDropdown();

}
}
