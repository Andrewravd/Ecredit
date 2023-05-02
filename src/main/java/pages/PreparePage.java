package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class PreparePage {
    /* загрузите документы*/

    private SelenideElement inputDocuments = $(By.xpath(".//h4[text()='Загрузить документы']/" + "parent::div/parent::div/following-sibling::input"));

    /* личная информация*/

    private SelenideElement buttonOk = $(By.xpath("//button[text()='Ок']"));

    private SelenideElement fio = $("div#personalInfo_fullName input");

    private SelenideElement familyStatus = $("div#personalInfo_familyState_sysName");

    private SelenideElement singleStatus = $(By.xpath(".//p[text()='Холост / Не замужем']/parent::li"));

    /* паспорт*/

    private SelenideElement passport = $("#passport_serianumber input");

    private SelenideElement passportDayOfIssue = $(By.xpath(".//input[@label='Дата выдачи']"));

    private SelenideElement birthDay = $(By.xpath(".//input[@label='Дата рождения']"));

    /* водительское удостоверение */

    private SelenideElement dateDrivingLicense = $("#secondDocument_driverLicense_issueDate input");

    /* адрес регистрации */

    private SelenideElement blockAddress = $("#addressReg > div");

    private SelenideElement addressOfRegistration = $("#addressReg_fiasValue input");

    private SelenideElement confirmAddress = $(By.xpath("//*[@id=\"addressReg_fiasValue\"]" + "/div/div[1]/div/div[1]"));

    private SelenideElement dateOfRegistration = $("#addressReg_regDate input");

    /* доверенное лицо */

    private SelenideElement confidantFio = $("input[label='Фамилия, имя, отчество']");

    private SelenideElement confidantFioConfirm = $(By.xpath("//*[@id=\"trustees_2208973_fullName\"]" + "/div/div/div[2]/div"));

    private SelenideElement confidantPhone = $("#trustees_temp_phone > input");

    /* место работы клиента */

    private SelenideElement typeOfEmployment = $("#work_employmentType_sysName");

    private SelenideElement employee = $(By.xpath(".//p[text()='Наемный работник']/parent::li"));

    private SelenideElement jobTitle = $(By.xpath("//div[text()='Название должности']" + "/following-sibling::input"));

    private SelenideElement job = $(By.xpath(".//mark[text()='Доцент']/parent::span/parent::button"));

    private SelenideElement employer = $(By.xpath("//div[text()=" + "'Юридическое название места работы или ИНН организации']/preceding-sibling::div/input"));

//    private SelenideElement employerName = $(By.xpath("//div[@class='react-dadata__" +
//            "suggestion react-dadata__suggestion--current']"));

    private SelenideElement employerName = $(By.xpath("//*[@id=\"work_organization_name\"]/div/div[1]/div/div[1]"));
    private SelenideElement employerPhone = $(By.xpath("//input[@label='Телефон организации']"));

    private SelenideElement startDate = $("#work_careerStartTime input");

    private SelenideElement experience = $("#work_experienceTime>div.sc-hHfuMS");

    private SelenideElement experienceAge = $(By.xpath(".//p[text()='от 1 года до 3 лет']/parent::li"));

    /* доход в месяц */

    private SelenideElement salary = $("#profit_mainprofit input");

    private SelenideElement additionalIncome = $("#profit_addedprofit input");

    /* согласие клиента */

    private SelenideElement inputConcedence = $("#sign input");

    private SelenideElement buttonSendApplication = $(By.xpath("//button[text()='Отправить заявку в банки']"));

    private SelenideElement linkSendApplication = $(By.xpath("//a[text()='Отправить заявку']"));

    public SelenideElement getInputDocuments() {
        return inputDocuments;
    }

    public SelenideElement getButtonOk() {
        return buttonOk;
    }

    public SelenideElement getFio() {
        return fio;
    }

    public SelenideElement getFamilyStatus() {
        return familyStatus;
    }

    public SelenideElement getPassport() {
        return passport;
    }

    public SelenideElement getPassportDayOfIssue() {
        return passportDayOfIssue;
    }

    public SelenideElement getBirthDay() {
        return birthDay;
    }

    public SelenideElement getDateDrivingLicense() {
        return dateDrivingLicense;
    }

    public SelenideElement getBlockAddress() {
        return blockAddress;
    }

    public SelenideElement getAddressOfRegistration() {
        return addressOfRegistration;
    }

    public SelenideElement getDateOfRegistration() {
        return dateOfRegistration;
    }

    public SelenideElement getConfidantFio() {
        return confidantFio;
    }

    public SelenideElement getConfidantPhone() {
        return confidantPhone;
    }

    public SelenideElement getTypeOfEmployment() {
        return typeOfEmployment;
    }

    public SelenideElement getJobTitle() {
        return jobTitle;
    }

    public SelenideElement getEmployer() {
        return employer;
    }

    public SelenideElement getStartDate() {
        return startDate;
    }

    public SelenideElement getExperience() {
        return experience;
    }

    public SelenideElement getSalary() {
        return salary;
    }

    public SelenideElement getAdditionalIncome() {
        return additionalIncome;
    }

    public SelenideElement getInputConcedence() {
        return inputConcedence;
    }

    public SelenideElement getButtonSendApplication() {
        return buttonSendApplication;
    }

    public SelenideElement getSingleStatus() {
        return singleStatus;
    }

    public SelenideElement getConfirmAddress() {
        return confirmAddress;
    }

    public SelenideElement getConfidantFioConfirm() {
        return confidantFioConfirm;
    }

    public SelenideElement getEmployee() {
        return employee;
    }

    public SelenideElement getJob() {
        return job;
    }

    public SelenideElement getExperienceAge() {
        return experienceAge;
    }

    public SelenideElement getEmployerName() {
        return employerName;
    }

    public SelenideElement getLinkSendApplication() {
        return linkSendApplication;
    }

    public SelenideElement getEmployerPhone() {
        return employerPhone;
    }
}


