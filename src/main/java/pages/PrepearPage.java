package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class PrepearPage {


    Faker faker = new Faker(new Locale("ru-RU"));


    private SelenideElement input = $("#personalInfo > div.sc-gIRjGK.sc-zzebL.hzyQOU.jnQpiu > div > div > input");

    private SelenideElement buttonOk = $(By.xpath("//button[text()='Ок']"));

    private SelenideElement getFio= $("div#personalInfo_fullName input");;

    private SelenideElement familyStatus= $("div#personalInfo_familyState_sysName");

    private SelenideElement passportNumber= $("#passport_serianumber input");

    private SelenideElement licenceDate= $("#secondDocument_driverLicense_issueDate input");

    private SelenideElement dropdownAdress= $("#addressReg > div");

    private SelenideElement registrationAdress= $("#addressReg_fiasValue input");

    private SelenideElement registrationDate= $("#addressReg_regDate input");

    private SelenideElement person= $("input[label='Фамилия, имя, отчество']");

    private SelenideElement personPhone= $("#trustees_temp_phone > input");

    private SelenideElement employmentType= $("#work_employmentType_sysName");

    private SelenideElement position= $(By.xpath("//div[text()='Название должности']/following-sibling::input"));

    private SelenideElement organizationName= $(By.xpath("//div[text()='Юридическое название места работы или ИНН организации']/preceding-sibling::div/input"));

    private SelenideElement organizationPhone= $("#work_organizationPhone input");

    private SelenideElement careerStartTime= $("#work_careerStartTime input");

    private SelenideElement experienceTime= $("#work_experienceTime>div.sc-hHfuMS");

    private SelenideElement mainProfit= $("#profit_mainprofit input");

    private SelenideElement addedProfit= $("#profit_addedprofit input");

    private SelenideElement concedence= $("#sign input");

    private SelenideElement buttonFinalOk = $(By.xpath("//button[text()='Ок']"));


    public void input_passport() {
        input.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        input.sendKeys("/Users/andrew/new ecredit/src/main/resources/passport.pdf");

    }

    public void close_found_personal_data() {
        buttonOk.shouldBe(Condition.visible, Duration.ofSeconds(20));
        buttonOk.click();
    }

    public void input_drivers() {
        input.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        input.sendKeys("/Users/andrew/new ecredit/src/main/resources/drivers.pdf");
    }

    public void input_clients_fio() {
        getFio.shouldBe(Condition.visible, Duration.ofSeconds(20));
        getFio.clear();
        getFio.sendKeys(faker.name().lastName() + " " + "Иван Петрович");
        sleep(1000);
        getFio.pressEnter();


    }

    public void choose_family_status() {
        familyStatus.shouldBe(Condition.visible, Duration.ofSeconds(20));
        familyStatus.click();
        $("#personalInfo_familyState_sysName > div:nth-child(2) > div > div.sc-ezredP.bGMmOr > ul > li:nth-child(1)").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();

    }

    public void series_number() {
        passportNumber.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passportNumber.clear();
        passportNumber.sendKeys("6015" + (Math.random() * 999999));
    }

    public void select_data_drive_licence() {
        licenceDate.shouldBe(Condition.visible, Duration.ofSeconds(20));
        licenceDate.clear();
        licenceDate.sendKeys("01.01.2020");
    }

    public void click_on_dropdown() {
        dropdownAdress.shouldBe(Condition.visible, Duration.ofSeconds(20));
        dropdownAdress.click();
    }

    public void select_registration_adress() {
        registrationAdress.shouldBe(Condition.visible, Duration.ofSeconds(20));
        registrationAdress.sendKeys("г Москва, ул Малая Полянка, д 4/6, кв 2");
        sleep(1000);
        registrationAdress.pressEnter();


    }

    public void select_registration_date() {
        registrationDate.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        registrationDate.click();
        registrationDate.sendKeys("01.01.2020");
    }

    public void input_trust_person_fio() {
        person.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        person.sendKeys("Иванов Иван Иванович");
        $("#trustees_temp_fullName > div > div > div.react-dadata__suggestions > div").click();


    }

    public void select_trust_person_phone_number() {
        personPhone.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        personPhone.click();
        personPhone.sendKeys("9881283123");
    }

    public void choose_work_type() {
        employmentType.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        employmentType.click();
       $("#work_employmentType_sysName > div:nth-child(2) > div > div.sc-ezredP.bGMmOr > ul > li:nth-child(1)").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();

    }

    public void select_position() {
        position.shouldBe(Condition.interactable, Duration.ofSeconds(20)).click();
        position.sendKeys("Экономист");
//        sleep(50000);
        $(By.xpath("/html/body/div[1]/div[1]/div/div/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div/div/div[2]/button[1]")).click();

    }

    public void select_organization_name() {
        organizationName.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        organizationName.click();
        organizationName.sendKeys("БАНК ГПБ");
        sleep(1000);
        $("#work_organization_name > div > div.react-dadata.react-dadata__container.sc-hYZPxA.cuofiI > div > div.react-dadata__suggestion.react-dadata__suggestion--current").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        sleep(1000);
    }

//    public void select_organization_phone() {
//        organizationPhone.shouldBe(Condition.visible, Duration.ofSeconds(20));
//        organizationPhone.click();
//        organizationPhone.sendKeys("9876678999");
//    }

    public void select_careerStartTime() {
        careerStartTime.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        careerStartTime.click();
        careerStartTime.sendKeys("01.01.2020");
        sleep(1000);
    }

    public void choose_work_experience_age() {
        experienceTime.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        experienceTime.click();
        $("#work_experienceTime > div:nth-child(2) > div > div.sc-ezredP.bGMmOr > ul > li:nth-child(1)").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();

    }

    public void select_mainProfit() {
        mainProfit.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        mainProfit.click();
        mainProfit.sendKeys("300000");
        sleep(1000);
    }

    public void select_addedProfit() {
        addedProfit.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        addedProfit.click();
        addedProfit.sendKeys("0");
        sleep(1000);
    }

    public void input_consedence() {
        concedence.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        concedence.sendKeys("/Users/andrew/new ecredit/src/main/resources/Soglasije.pdf");
    }
    public void click_in_button() {
        buttonFinalOk.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        buttonFinalOk.click();
    }

}


