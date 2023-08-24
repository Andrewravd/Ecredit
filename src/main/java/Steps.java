import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class Steps {

    private final SelenideElement login = $(By.cssSelector("input[type='text']"));
    private final SelenideElement password = $(By.cssSelector("input[type='password']"));
    private final SelenideElement newApplication = $(By.xpath("//div[@class='nav-button logo']"));
    private final SelenideElement createApplication = $(By.xpath("//span[text()='Создать']/parent::div"));
    private final SelenideElement credit = $(By.xpath("//a[text()='Кредит']"));
    private final SelenideElement brand = $(By.xpath("//div[@id ='brand']/div/div"));
    private final SelenideElement listOfCredits = $x(".//p[text()='Газпромбанк']/following-sibling::p/button");
    private final SelenideElement buttonSaveApplication = $x(".//h6[text()='Введите контактные данные клиента']/following-sibling::button");
    private SelenideElement inputDocuments = $(By.xpath(".//h4[text()='Загрузить документы']/parent::div/parent::div/following-sibling::input"));
    private final SelenideElement blockAddress = $("#addressReg > div");
    private final SelenideElement dateDrivingLicense = $("#secondDocument_driverLicense_issueDate input");
    private final SelenideElement inputConcedence = $("#sign input");
    private final SelenideElement calculateCredit = $x(".//a[@id ='tab_calculator']");
    private final SelenideElement blockCar = $x(".//h1/parent::div");
    private final ElementsCollection buttonSendtoTheBank = $$x(".//a[text()='Отправить заявку']");
    private final SelenideElement gosporramButton =$x(".//div[text()='Рассчитать с Госпрограммой']/parent::button");


    @Before
    public void setUp() {
        Configuration configuration = new Configuration();
        configuration.timeout = 50000;
        configuration.browserSize = "1920x1080";
    }

    @Given("Отрывается сайт {string} ")
    public void openUrl(String url) {
        Selenide.open(url);
    }

    @И("Пользователь авторизуется, используя логин {string} и пароль {string}")
    public void login(SelenideElement login, SelenideElement password, SelenideElement buttonSignIn) {
        login.shouldBe(enabled, Duration.ofSeconds(60));
        password.shouldBe(enabled, Duration.ofSeconds(60));
        buttonSignIn.shouldBe(enabled, Duration.ofSeconds(60));
        login.sendKeys(Parameters.LOGIN);
        password.sendKeys(Parameters.PASSWORD);
        buttonSignIn.click();

    }

    public void clickOnElement(SelenideElement element) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();

    }

    public void checkInputIsNotEmpty(SelenideElement element) {
        element.shouldBe(not(empty), Duration.ofSeconds(60));

    }

    public void clickOnElementInDropDown(SelenideElement element, SelenideElement dropDownElement) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        dropDownElement.shouldBe(enabled, Duration.ofSeconds(60));
        dropDownElement.click();

    }

    public void clickOnElementAndConfirm(SelenideElement element, String value, SelenideElement dropDownElement) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(value);
        element.shouldBe(not(empty), Duration.ofSeconds(60));
        dropDownElement.shouldBe(exist, Duration.ofSeconds(10));
        dropDownElement.click();
    }

    public void inputValueAndConfirm(SelenideElement element, String value) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(value);
        element.shouldBe(not(empty), Duration.ofSeconds(60));
        element.click();
        element.sendKeys(Keys.ENTER);
    }


    public void clearInput(SelenideElement element) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        element.sendKeys(Keys.COMMAND + "A");
        element.sendKeys(Keys.BACK_SPACE);

    }

    public void inputValue(SelenideElement element, String value) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.click();
        element.sendKeys(value);
        element.shouldBe(not(empty), Duration.ofSeconds(60));
    }

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

    public void uploadDocument(SelenideElement element, String path) {
        element.shouldBe(enabled, Duration.ofSeconds(60));
        element.sendKeys(path);

    }

    public void isElementDisplayed(SelenideElement element) {
        element.shouldBe(visible, Duration.ofSeconds(60));

    }

    public void close_frame(SelenideElement element) {
        try {
//            element.shouldBe(Condition.visible, Duration.ofSeconds(60));
            switchTo().frame(element);
            $("#carrotquest-messenger-body-big-cont > div.popup__controls > div").click();
        } catch (NoSuchElementException e) {
        }
    }

    @Given("Отрывается страница {string}")
    public void отрываетсяСтраница(String url) {
        Selenide.open(url);
    }

    @When("Вводится логин")
    public void вводитсяЛогин() {
        login.sendKeys(Parameters.LOGIN);
    }

    @And("Вводится пароль")
    public void вводитсяПароль() {
        password.sendKeys(Parameters.PASSWORD);
    }

    @And("Нажимается кнопка {string}")
    public void нажимаетсяКнопка(String buttonName) {
        String xpass = "//button[text()='" + buttonName + "']";
        SelenideElement button = $x(xpass);
       button.shouldBe(enabled, Duration.ofSeconds(6000));
       button.click();
        Selenide.sleep(2000);
    }

    @Then("Открывается выпадающее меню")
    public void открываетсяВыпадающееМеню() {
        newApplication.click();
    }

    @And("Создается новый кредит")
    public void создаетсяНовыйКредит() {
        createApplication.click();
        credit.click();

    }

    @And("Из выпадающего списка выбирается значение {string}")
    public void изВыпадающегоСпискаВыбираетсяЗначение(String value) {
        brand.click();
        $(By.xpath("//p[text()='" + value + "']/parent::li"));
    }

    @And("Из выпадающего списка {string} выбирается значение {string}")
    public void изВыпадающегоСпискаВыбираетсяЗначение(String list, String value) {
        $(By.xpath("//div[text()='" + list + "']/parent::div")).click();
        $(By.xpath("//p[text()='" + value + "']/parent::li")).click();
        Selenide.sleep(5000);
    }

    @And("Поле {string} заполняется значением {string}")
    public void полеЗаполняетсяЗначением(String input, String value) {
        SelenideElement element = $(By.xpath(".//input[@label='" + input + "']"));
        element.click();
        element.sendKeys(Keys.COMMAND + "A");
        Selenide.sleep(1000);
        element.sendKeys(Keys.BACK_SPACE);
        Selenide.sleep(1000);
        element.sendKeys(value);
    }

    @And("Поле {string} очищается")
    public void полеОчищается(String input) {
        SelenideElement element = $(By.xpath(".//input[@label='" + input + "']"));
        element.sendKeys(Keys.COMMAND + "A");
        element.sendKeys(Keys.BACK_SPACE);
    }

    @And("Выбирает срок кредита {string} месяцев")
    public void выбираетСрокКредитаМесяцев(String value) {
        $(By.xpath(".//div[text()='" + value + " " + "мес.']/parent::div/parent::div")).click();

    }

    @And("Открывается полный список предложений")
    public void открываетсяПолныйСписокПредложений() {
        listOfCredits.click();
    }

    @And("Из списка выбирается кредитное предложение со ставкой {string}")
    public void изСпискаВыбираетсяКредитноеПредложениеСоСтавкой(String value) {
        $x(".//h3[text()='" + value + " " + "%']/parent::div/parent::div/parent::div/parent::div/parent::div").click();

    }

    @And("В поле {string} вводится значение {string}")
    public void вПолеВводитсяЗначение(String input, String value) {
        SelenideElement element = $x("//div[text()='" + input + "']/following-sibling::input");
        element.click();
        element.sendKeys(value);
    }

    @When("Сохраняются данные участника")
    public void сохраняютсяДанныеУчастника() {
        buttonSaveApplication.shouldBe(enabled, Duration.ofSeconds(200));
        buttonSaveApplication.click();
    }

    @Then("Загружается паспорт")
    public void загружаетсяПаспорт() {
        inputDocuments.sendKeys(Parameters.PASSPORT_PATH);
    }

    @Then("Загружается ВУ")
    public void загружаетсяВУ() {
        inputDocuments.sendKeys(Parameters.DRIVERS_PATH);

    }

    @And("В поле {string} вводится значение {string} с повторным подтверждением по атрибуту {string}")
    public void вПолеВводитсяЗначениеСПовторнымПодтверждениемПоЗначению(String input, String value, String confirmValue) {
        SelenideElement inputFio = $x(".//div[text()='" + input + "']/preceding-sibling::div/input");
        inputFio.sendKeys(Keys.COMMAND + "A");
        inputFio.sendKeys(Keys.BACK_SPACE);
        inputFio.sendKeys(value);
        SelenideElement confirmFio = $x(".//mark[text()='"+ confirmValue +"']/parent::span/parent::div");
        confirmFio.shouldBe(exist, Duration.ofSeconds(3));
        if (confirmFio.isDisplayed() && confirmFio.exists()){
            confirmFio.click();
        }
    }

    @Then("Отрывается блок Адрес регистрации")
    public void отрываетсяБлокАдресРегистрации() {
        blockAddress.click();
    }

    @And("Поле Дата выдачи водительского удостоверения заполняется значением {string}")
    public void полеДатаВыдачиВодительскогоУдостоверенияЗаполняетсяЗначением(String value) {
        dateDrivingLicense.sendKeys(Keys.COMMAND + "A");
        dateDrivingLicense.sendKeys(Keys.BACK_SPACE);
        dateDrivingLicense.sendKeys(value);
    }

    @And("Загружается  документ Согласие")
    public void загружаетсяДокументСогласие() {
        inputConcedence.sendKeys(Parameters.CONCEDENCE_PATH);

    }

    @Then("Поле {string} заполняется  значением {string} с повторным подтверждением по атрибуту {string}")
    public void полеЗаполняетсяЗначениемСПовторнымПодтверждениемПоАтрибуту(String input, String value, String confirmValue) {
        SelenideElement inputFio = $x(".//div[text()='" + input + "']/preceding-sibling::input");
        inputFio.sendKeys(Keys.COMMAND + "A");
        inputFio.sendKeys(Keys.BACK_SPACE);
        inputFio.sendKeys(value);
        SelenideElement confirmFio = $x(".//mark[text()='"+ confirmValue +"']/parent::span/parent::div");
        confirmFio.shouldBe(exist, Duration.ofSeconds(3));
        if (confirmFio.isDisplayed() && confirmFio.exists()){
            confirmFio.click();
        }
    }

    @And("Поле Мобильный телефон заполняется значением {string}")
    public void полеМобильныйТелефонЗаполняетсяЗначением(String value) {
        ElementsCollection collection = $$x(".//input[@label ='Мобильный телефон']");
        for(SelenideElement element : collection){
            element.sendKeys(Keys.COMMAND + "A");
            element.sendKeys(Keys.BACK_SPACE);
            element.sendKeys(value);
        }


    }

    @And("В поле {string} вводится значение {string} с повторным подтверждением по слову {string}")
    public void вПолеВводитсяЗначениеСПовторнымПодтверждениемПоСлову(String input, String value, String confirmValue) {
        SelenideElement inputFio = $x(".//div[text()='" + input + "']/following-sibling::input");
        inputFio.sendKeys(Keys.COMMAND + "A");
        inputFio.sendKeys(Keys.BACK_SPACE);
        inputFio.sendKeys(value);
        SelenideElement confirmFio = $x(".//mark[text()='"+ confirmValue +"']/parent::span/parent::button");
        confirmFio.shouldBe(exist, Duration.ofSeconds(3));
        if (confirmFio.isDisplayed() && confirmFio.exists()){
            confirmFio.click();
        }
    }

    @Then("Ожидает отправки в банк")
    public void ожидаетОтправкиВБанк() {
        Selenide.sleep(1000000);
    }

    @Then("Отрывается страница с расчетом кредита")
    public void отрываетсяСтраницаСРасчетомКредита() {
        calculateCredit.shouldBe(enabled, Duration.ofSeconds(10000)).click();
    }

    @And("Открывается блок с данными по ТС")
    public void открываетсяБлокСДаннымиПоТС() {
        blockCar.shouldBe(enabled, Duration.ofSeconds(10000)).click();
    }

    @Then("Заявка отправляется в банк")
    public void заявкаОтправляетсяВБанк() {
        buttonSendtoTheBank.get(0).shouldBe(enabled, Duration.ofSeconds(100000)).click();
    }

    @Then("Ожидаем сохранения данных по заявке")
    public void ожидаемСохраненияДанныхПоЗаявке() {
        Selenide.sleep(50000);
    }

    @And("Выбирается госпрограмма с типом {string}")
    public void выбираетсяГоспрограммаСТипом(String gosprogrammaName) {
        gosporramButton.shouldBe(enabled, Duration.ofSeconds(1000)).click();
        SelenideElement gosprogramText = $x(".//div[text()='" + gosprogrammaName + "']/preceding-sibling::div");
        gosprogramText.shouldBe(enabled, Duration.ofSeconds(1000)).click();

    }
}
