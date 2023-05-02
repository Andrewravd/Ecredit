package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement login = $(By.cssSelector("input[type='text']"));

    private SelenideElement password = $(By.cssSelector("input[type='password']"));

    private SelenideElement button = $(By.cssSelector("button"));

    public SelenideElement getLogin() {
        return login;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getButton() {
        return button;
    }
}
