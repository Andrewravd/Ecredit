import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.CreditScorePage;
import pages.LoginPage;
import pages.MainPage;
import pages.PreparePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class MakeNewApplicationTest {
    private Steps steps;
    private LoginPage loginPage;
    private MainPage mainPage;
    private CreditScorePage creditScorePage;
    private PreparePage preparePage;

    @Before
    public void setUp() {
        steps = new Steps();
        loginPage = new LoginPage();
        mainPage = new MainPage();
        creditScorePage = new CreditScorePage();
        preparePage = new PreparePage();
        open(Parameters.URL);
    }

    @Test
    @Description("Создание новой заявки")
    public void makeNewApplication() {
        /* авторизация */
        steps.login(loginPage.getLogin(), loginPage.getPassword(), loginPage.getButton());
        /* создание новой заявки */
        steps.isElementDisplayed(mainPage.getNewApplication());
        steps.clickOnElement(mainPage.getNewApplication());
        steps.clickOnElement(mainPage.getCreateApplication());
        steps.clickOnElement(mainPage.getCredit());
        /* выбор новой машины */
        steps.clickOnElement(creditScorePage.getNewСar());
//        /* заполнение vin */
//        steps.isElementDisplayed(creditScorePage.getModel());
//        steps.clickOnElement(creditScorePage.getVin());
//        steps.inputValue(creditScorePage.getVin(), Parameters.VIN);
//        steps.clickOnElement(creditScorePage.getModel());
//        /* заполнение года выпуска */
//        steps.clickOnElementInDropDown(creditScorePage.getYearOfIssue(), creditScorePage.getChooseYear());
//        /* заполнение параметров автомобиля */
//        steps.clickOnElement(creditScorePage.getButtonExtra());
//        steps.inputValue(creditScorePage.getPower(), Parameters.POWER);
//        steps.inputValue(creditScorePage.getNumberOfEngine(), Parameters.POWER);
//        steps.inputValue(creditScorePage.getNumberOfBody(), Parameters.POWER);
//        steps.inputValue(creditScorePage.getMaxWeight(), Parameters.WEIGHT);
//        steps.inputValue(creditScorePage.getEngineCapacity(), Parameters.ENGINE_CAPACITY);
//        /* заполнение ЕПТС и даты выдачи */
//        steps.inputValue(creditScorePage.getEpts(), Parameters.EPTS);
//        steps.clickOnElement(creditScorePage.getDocuments());
//        steps.inputValue(creditScorePage.getDateOfIssueEpts(), Parameters.DATE_OF_ISSUE);
        /* выбор марки, модели, комплектации */
        steps.clickOnElementInDropDown(creditScorePage.getBrand(), creditScorePage.getBrandOmoda());
        steps.clickOnElementInDropDown(creditScorePage.getModel(), creditScorePage.getModelOmoda());
        steps.clickOnElementInDropDown(creditScorePage.getVehicleEquipment(), creditScorePage.getVehicleEquipmentOmoda());
        /* заполнение блока "Рассчитать кредит" */
        steps.clearThenInputValue(creditScorePage.getDownPayment(), creditScorePage.getDownPaymentInput(),
                Parameters.DOWN_PAYMENT);
        steps.clearInput(creditScorePage.getInsuranceAmount());
        steps.clickOnElement(creditScorePage.getButtonKasko());
        steps.clickOnElement(creditScorePage.getButtonCreditSubtype());
        steps.clickOnElement(creditScorePage.getCreditOffer());
        steps.clickOnElement(creditScorePage.getButtonListOfCreditType());
        steps.clickOnElement(creditScorePage.getCreditWithInsurance());
        steps.clickOnElement(creditScorePage.getButtonSaveApplication());
        /* заполнение контактных данных клиента */
        steps.inputValue(creditScorePage.getFioInput(), Parameters.FIO);
        steps.inputValue(creditScorePage.getClientPhoneInput(), Parameters.PHONE);
        steps.clickOnElement(creditScorePage.getSaveApplicationButton());
        /* загрузка документов клиента */
        steps.uploadDocument(preparePage.getInputDocuments(), Parameters.PASSPORT_PATH);
        steps.clickOnElement(preparePage.getButtonOk());
        steps.uploadDocument(preparePage.getInputDocuments(), Parameters.DRIVERS_PATH);
        /* заполнение личной информации */
        steps.clearInput(preparePage.getFio());
        steps.inputValueAndConfirm(preparePage.getFio(), Parameters.FIO);
        steps.clickOnElementInDropDown(preparePage.getFamilyStatus(), preparePage.getSingleStatus());
        steps.clearInput(preparePage.getPassport());
        steps.inputValue(preparePage.getPassport(), Parameters.PASSPORT);
        steps.clearInput(preparePage.getPassportDayOfIssue());
        steps.inputValue(preparePage.getPassportDayOfIssue(), Parameters.PASSPORT_DATE_OF_ISSUE);
        steps.clearInput(preparePage.getBirthDay());
        steps.inputValue(preparePage.getBirthDay(), Parameters.BIRTH_DAY);
        /* обновление даты водительского удостоверения */
        steps.clearInput(preparePage.getDateDrivingLicense());
        steps.inputValue(preparePage.getDateDrivingLicense(), Parameters.DATE_DRIVING_LICENCE);
        /* заполнение адреса регистрации */
        steps.clickOnElement(preparePage.getBlockAddress());
        steps.clickOnElementAndConfirm(preparePage.getAddressOfRegistration(),
                Parameters.ADDRESS_OF_REGISTRATION, preparePage.getConfirmAddress());
        steps.inputValue(preparePage.getDateOfRegistration(), Parameters.DATE_OF_REGISTRATION);
        /* заполнение данных доверенного лица */
        steps.inputValue(preparePage.getConfidantFio(), Parameters.CONFIDANT_FIO);
        steps.inputValue(preparePage.getConfidantPhone(), Parameters.CONFIDANT_PHONE);
        /* заполнение место работы клиента */
        steps.clickOnElementInDropDown(preparePage.getTypeOfEmployment(), preparePage.getEmployee());
        steps.clickOnElementAndConfirm(preparePage.getJobTitle(), Parameters.JOB_TITLE, preparePage.getJob());
        steps.clickOnElementAndConfirm(preparePage.getEmployer(), Parameters.EMPLOYER, preparePage.getEmployerName());
        steps.inputValue(preparePage.getStartDate(), Parameters.START_DATE);
        steps.clickOnElementInDropDown(preparePage.getExperience(), preparePage.getExperienceAge());
        /* заполнение дохода */
        steps.inputValue(preparePage.getSalary(), Parameters.SALARY);
        steps.inputValue(preparePage.getAdditionalIncome(), Parameters.ADDITIONAL_INCOME);
        steps.uploadDocument(preparePage.getInputConcedence(), Parameters.CONCEDENCE_PATH);
        steps.clickOnElement(preparePage.getButtonSendApplication());
        sleep(50000);
    }

    @After
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
