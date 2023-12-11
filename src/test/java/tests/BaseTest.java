package tests;

import com.codeborne.selenide.Selenide;
import config.TestConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest extends TestConfig {

    @BeforeSuite
    public void loadProperties() {
        getProperties();
    }

    @BeforeMethod
    public void openBaseUrl() {
        open(properties.getProperty("baseUrl"));
    }

    @AfterMethod
    public void closeWindow() {
        Selenide.closeWebDriver();
    }
}
