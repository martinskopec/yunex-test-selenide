package pages;

import com.codeborne.selenide.SelenideElement;
import config.TestConfig;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends TestConfig {

    private final SelenideElement usernameOrEmailInputField = $(byId("username"));
    private final SelenideElement passwordInputField = $(byId("password"));
    private final SelenideElement signInButton = $(byId("kc-login"));

    private final String username = properties.getProperty("login_username");
    private final String password = properties.getProperty("login_password");


    public void loginToApp() {
        usernameOrEmailInputField.val(username);
        passwordInputField.val(password);
        signInButton.click();
    }
}
