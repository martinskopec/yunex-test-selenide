package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginAndLanguageSwitchTest extends BaseTest {

    @Test(priority = 1)
    public void userCanLoginToTheApp() {
        new LoginPage().loginToApp();
    }

    @Test(priority = 2)
    public void userCanChangeTheLanguage() {
        // The first letter of the language MUST be capital!!!
        final String language = "English";

        new LoginPage().loginToApp();

        HomePage homePage = new HomePage();
        homePage.changeLanguage(language);
        Assert.assertEquals(homePage.getCurrentLanguage(), homePage.getExpectedValue(language));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
