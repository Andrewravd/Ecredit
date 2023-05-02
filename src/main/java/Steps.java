import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;


public class Steps {
    @Step("Авторизация пользователя {SelenideElement}")
    public void login(SelenideElement login, SelenideElement password, SelenideElement buttonSignIn) {
        login.shouldBe(enabled, Duration.ofSeconds(60));
        password.shouldBe(enabled, Duration.ofSeconds(60));
        buttonSignIn.shouldBe(enabled, Duration.ofSeconds(60));
        login.sendKeys(Parameters.LOGIN);
        password.sendKeys(Parameters.PASSWORD);
        buttonSignIn.click();

    }

    @Step("Клик по элементу {SelenideElement}")
    public void clickOnElement(SelenideElement element) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();

    }

    @Step("Поле заполнено {SelenideElement}")
    public void checkInputIsNotEmpty(SelenideElement element) {
        element.shouldBe(not(empty), Duration.ofSeconds(60));

    }

    @Step("выбор элемента {SelenideElement} из выпадающего списка")
    public void clickOnElementInDropDown(SelenideElement element, SelenideElement dropDownElement) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        dropDownElement.shouldBe(enabled, Duration.ofSeconds(60));
        dropDownElement.click();

    }

    @Step("заполнение поля и потверждение выбора кликом")
    public void clickOnElementAndConfirm(SelenideElement element, String value, SelenideElement dropDownElement) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(value);
        element.shouldBe(not(empty), Duration.ofSeconds(60));
        dropDownElement.shouldBe(exist, Duration.ofSeconds(10));
        dropDownElement.click();
    }

    @Step("заполнение поля и потверждение выбора через ENTER")
    public void inputValueAndConfirm(SelenideElement element, String value) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(value);
        element.shouldBe(not(empty), Duration.ofSeconds(60));
        element.click();
        element.sendKeys(Keys.ENTER);
    }

    @Step("очищение поля {SelenideElement}")
    public void clearInput(SelenideElement element) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        element.sendKeys(Keys.COMMAND + "A");
        element.sendKeys(Keys.BACK_SPACE);

    }

    @Step("заполнение поля {SelenideElement}")
    public void inputValue(SelenideElement element, String value) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        element.sendKeys(value);
        element.shouldBe(not(empty), Duration.ofSeconds(60));
    }

    @Step("перезаполнение поля {SelenideElement}")
    public void clearThenInputValue(SelenideElement div, SelenideElement input, String value) {
        div.shouldBe(visible, Duration.ofSeconds(60));
        div.click();
        input.shouldBe(exist, Duration.ofSeconds(60));
        input.click();
        input.sendKeys(Keys.COMMAND + "A");
        input.sendKeys(Keys.BACK_SPACE);
        input.sendKeys(value);
        input.shouldBe(not(empty), Duration.ofSeconds(60));
    }

    @Step("загрузка файла в карман {String}")
    public void uploadDocument(SelenideElement element, String path) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(path);

    }

    @Step("Проверка отображения элемента {SelenideElement}")
    public void isElementDisplayed(SelenideElement element) {
        element.shouldBe(visible, Duration.ofSeconds(60));

    }

    @Step("закрытие всплывающего окна {SelenideElement}")
    public void close_frame(SelenideElement element) {
        try {
//            element.shouldBe(Condition.visible, Duration.ofSeconds(60));
            switchTo().frame(element);
            $("#carrotquest-messenger-body-big-cont > div.popup__controls > div").click();
        } catch (NoSuchElementException e) {
        }
    }
}