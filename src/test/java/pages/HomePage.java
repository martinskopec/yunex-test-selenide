package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement userProfileAvatarDiv = $(byText("OA"));
    private final SelenideElement currentLanguageSpan = $("li > div > span");
    private SelenideElement selectedLanguageOption;

    public void changeLanguage(String language) {
        setTheLanguageOption(language);
        userProfileAvatarDiv.shouldBe(visible).click();
        currentLanguageSpan.hover();
        selectedLanguageOption.shouldBe(visible).click();
    }

    private void setTheLanguageOption(String language) {
        selectedLanguageOption = $(byText(language));
    }

    public String getCurrentLanguage() {
        return currentLanguageSpan.shouldBe(visible).getText();
    }

    public String getExpectedValue(String language) {
        if (language == null || language.isEmpty()) {
            throw new NullPointerException("language cannot be null");
        }
        String currentText = "";
        switch (language.toLowerCase().trim()) {
            case "english":
            case "english (us)":
                currentText = "Language";
                break;
            case "deutsch":
                currentText = "Sprache";
                break;
            case "italiano":
            case "français":
            case "español":
            case "polski":
            case "čeština":
                currentText = "menu.language";
            default:
                System.out.println("This language is not in the list");
        }
        return currentText;
    }



}
