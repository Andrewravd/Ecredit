import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Steps {
    @Step("Авторизация пользователя {SelenideElement}")
    public void login(SelenideElement login,
                      SelenideElement password, SelenideElement buttonSignIn) {
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
        sleep(700);
        element.click();
        sleep(700);

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
        sleep(700);
        element.shouldBe(enabled, Duration.ofSeconds(10));
        element.sendKeys(value);
        dropDownElement.shouldBe(enabled, Duration.ofSeconds(60));
        sleep(700);
        dropDownElement.click();
    }

    @Step("заполнение поля и потверждение выбора через ENTER")
    public void inputValueAndConfirm(SelenideElement element, String value) {
        sleep(700);
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(value);
        sleep(300);
        element.click();
        element.sendKeys(Keys.ENTER);
    }

    @Step("очищение поля {SelenideElement}")
    public void clearInput(SelenideElement element) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        sleep(700);
        element.sendKeys(Keys.COMMAND + "A");
        element.sendKeys(Keys.BACK_SPACE);
        sleep(700);

    }

    @Step("заполнение поля {SelenideElement}")
    public void inputValue(SelenideElement element, String value) {
        sleep(700);
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        sleep(700);
        element.sendKeys(value);
        sleep(300);
        element.sendKeys(Keys.ENTER);
    }

    @Step("перезаполнение поля {SelenideElement}")
    public void clearThenInputValue(SelenideElement div, SelenideElement input, String value) {
        div.shouldBe(visible, Duration.ofSeconds(60));
        div.click();
        sleep(200);
        input.click();
        input.sendKeys(Keys.COMMAND + "A");
        input.sendKeys(Keys.BACK_SPACE);
        sleep(300);
        input.sendKeys(value);
    }

    @Step("заполенние кармана файлом {SelenideElement}")
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