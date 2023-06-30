package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CreditScorePage {

    private SelenideElement bunner = $("#carrot-popup-frame");

    /* блок с данными о машине*/

    private SelenideElement vin = $(By.xpath(".//input[@label='Госномер или VIN автомобиля']"));

    private SelenideElement newСar = $(By.xpath(".//button[text()='Новый']"));

    private SelenideElement brand = $(By.xpath("//div[@id ='brand']/div/div"));

    private SelenideElement brandOmoda = $(By.xpath("//p[text()='OMODA']/parent::li"));

    private SelenideElement brandChangan = $(By.xpath("//p[text()='Changan']/parent::li"));

    private SelenideElement model = $(By.xpath("//div[@id ='model']/div/div"));

    private SelenideElement modelOmoda = $(By.xpath("//p[text()='C5']/parent::li"));

    private SelenideElement modelChangan = $(By.xpath("//p[text()='Alsvin']/parent::li"));

    private SelenideElement vehicleEquipment = $(By.xpath("//div[@id ='version']/div/div"));

    private SelenideElement vehicleEquipmentOmoda = $(By.xpath("//p[text()='Ultimate 1.5Т" +
            " 147 л.с. CVT (2022)']/parent::li"));
    private SelenideElement vehicleEquipmentChangan = $(By.xpath("//p[text()='DLX 1.5']/parent::li"));

    private SelenideElement yearOfIssue = $(By.xpath(".//div[text()='Год выпуска']/parent::div"));

    private SelenideElement chooseYear = $(By.xpath(".//p[text()='2022']/parent::li"));

    private SelenideElement buttonExtra = $(By.xpath(".//button[text()='Дополнительно']"));

    private SelenideElement power = $(By.xpath(".//input[@label ='Мощность, лc']"));

    private SelenideElement numberOfEngine = $(By.xpath(".//input[@label ='Номер двигателя']"));

    private SelenideElement numberOfBody = $(By.xpath(".//input[@label ='Номер кузова']"));

    private SelenideElement maxWeight = $(By.xpath(".//input[@label ='Максимальная масса, кг']"));

    private SelenideElement engineCapacity = $(By.xpath(".//input[@label ='Объём двигателя, см³ ']"));

    private SelenideElement epts = $(By.xpath(".//input[@label ='Серия, номер ПТС / ЭПТС']"));

    private SelenideElement documents = $(By.xpath(".//p[text()='Дата выдачи ПТС / ЭПТС']/parent::div"));

    private SelenideElement dateOfIssueEpts = $(By.xpath(".//input[@name='input']"));

    /* расчитать кредит*/

    private SelenideElement downPayment = $(By.xpath(".//div[text()='Первоначальный взнос, руб.']" +
            "/parent::div/parent::div/following-sibling::div[1]"));

    private SelenideElement downPaymentInput = $(By.xpath(".//input[@label='в %']"));

    private SelenideElement insuranceAmount = $(By.xpath(".//input[@label='На страховки, руб.']"));

    private SelenideElement buttonKasko = $(By.xpath(".//button[@name='requiredKasko']"));

    private SelenideElement buttonCreditSubtype = $(By.xpath(".//button[@name='creditSubtype']"));

    private SelenideElement creditOffer = $(By.xpath(".//div[text()='60 мес.']/parent::div"));

    private SelenideElement buttonListOfCreditType = $(By.xpath("//button[text()='Ещё 13']"));

    private SelenideElement creditWithInsurance = $(By.xpath("//h3[text()='NEW OMODA CLASSIC_4']/" +
            "parent::div/parent::div/parent::div/parent::div/parent::li"));

    private SelenideElement buttonSaveApplication = $(By.xpath(".//button[text()='Сохранить заявку']"));

    /* ФИО и телефон клиента*/

    private SelenideElement fioInput = $(By.xpath(".//input[@label ='Фамилия, имя клиента']"));

    private SelenideElement clientPhoneInput = $(By.xpath(".//input[@label ='Телефон']"));

    private SelenideElement saveApplicationButton = $(By.xpath(".//div[text()='Телефон']/parent::div/parent" +
            "::div/following-sibling::button"));

    public SelenideElement getVin() {
        return vin;
    }

    public SelenideElement getModel() {
        return model;
    }

    public SelenideElement getYearOfIssue() {
        return yearOfIssue;
    }

    public SelenideElement getButtonExtra() {
        return buttonExtra;
    }

    public SelenideElement getPower() {
        return power;
    }

    public SelenideElement getNumberOfEngine() {
        return numberOfEngine;
    }

    public SelenideElement getNumberOfBody() {
        return numberOfBody;
    }

    public SelenideElement getMaxWeight() {
        return maxWeight;
    }

    public SelenideElement getEngineCapacity() {
        return engineCapacity;
    }

    public SelenideElement getEpts() {
        return epts;
    }

    public SelenideElement getDateOfIssueEpts() {
        return dateOfIssueEpts;
    }

    public SelenideElement getDownPayment() {
        return downPayment;
    }

    public SelenideElement getInsuranceAmount() {
        return insuranceAmount;
    }

    public SelenideElement getButtonKasko() {
        return buttonKasko;
    }

    public SelenideElement getButtonCreditSubtype() {
        return buttonCreditSubtype;
    }

    public SelenideElement getCreditOffer() {
        return creditOffer;
    }

    public SelenideElement getButtonSaveApplication() {
        return buttonSaveApplication;
    }

    public SelenideElement getChooseYear() {
        return chooseYear;
    }

    public SelenideElement getBunner() {
        return bunner;
    }

    public SelenideElement getDocuments() {
        return documents;
    }

    public SelenideElement getDownPaymentInput() {
        return downPaymentInput;
    }

    public SelenideElement getFioInput() {
        return fioInput;
    }

    public SelenideElement getClientPhoneInput() {
        return clientPhoneInput;
    }

    public SelenideElement getSaveApplicationButton() {
        return saveApplicationButton;
    }

    public SelenideElement getNewСar() {
        return newСar;
    }

    public SelenideElement getBrand() {
        return brand;
    }

    public SelenideElement getBrandOmoda() {
        return brandOmoda;
    }

    public SelenideElement getModelOmoda() {
        return modelOmoda;
    }

    public SelenideElement getVehicleEquipment() {
        return vehicleEquipment;
    }

    public SelenideElement getVehicleEquipmentOmoda() {
        return vehicleEquipmentOmoda;
    }

    public SelenideElement getButtonListOfCreditType() {
        return buttonListOfCreditType;
    }

    public SelenideElement getCreditWithInsurance() {
        return creditWithInsurance;
    }

    public SelenideElement getBrandChangan() {
        return brandChangan;
    }

    public SelenideElement getModelChangan() {
        return modelChangan;
    }

    public SelenideElement getVehicleEquipmentChangan() {
        return vehicleEquipmentChangan;
    }
}






