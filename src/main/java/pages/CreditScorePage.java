package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;


public class CreditScorePage {


    private SelenideElement selectCarBrand = $("select#car_brand_id");

    private SelenideElement selectCarModel = $("select#car_model_id");

    private SelenideElement selectCarComplection = $("#car_id");

    private SelenideElement selectCaskoPrice = $(By.xpath(".//input[@name='kasko_price_val']"));

    private SelenideElement buttonGetCount = $("#btn_calculation_get");

    private SelenideElement selectOffer = $(By.xpath("/html/body/div[3]/div[2]/div[8]/div/div[2]/div[2]/div/div[1]/div[5]/div[9]/div[2]/table/tbody[2]/tr[1]/td[5]"));

    private SelenideElement safeEquals = $("#btn_calculation_save");

    private SelenideElement getName = $("#saveCalculationForm input[name = 'client_name']");


    private SelenideElement getSurname = $("input[name='client_surname']");

    private SelenideElement getPhone = $("#client_phone");

    private SelenideElement buttonSaveEquals = $("#saveCalculationForm > div.text_center > button");

    private SelenideElement bunner = $("#carrot-popup-frame");

    private SelenideElement buttonClose = $("#alert-btn-ok");





    public void select_mark_car() {
        selectCarBrand.shouldBe(Condition.visible, Duration.ofSeconds(20));
        selectCarBrand.selectOption("Hyundai");

    }

    public void select_model_car() {
        selectCarModel.shouldBe(Condition.visible, Duration.ofSeconds(20));
        selectCarModel.selectOption("Creta");

    }
    public void select_complection_car() {
        selectCarComplection.shouldBe(Condition.visible, Duration.ofSeconds(20));
        selectCarComplection.selectOption("2.0 (149HP) 4WD BI2 (G043/G039) (2021) 21MY 6AT (1 674 000 ₽)");
    }
    public void inputKaskoPrice(){

//        selectCaskoPrice.sendKeys(Keys.COMMAND + "A");
//        sleep(1000);
        selectCaskoPrice.doubleClick();
        selectCaskoPrice.sendKeys("10000");
    }

    public void press_get_count_button () {
        buttonGetCount.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        buttonGetCount.click();
    }
    public void press_choose_someone_offer () {
        selectOffer.click();
    }
////    public void close_frame(){
//        sleep(100);
//        try {
////            bunner.shouldBe(Condition.visible, Duration.ofSeconds(60));
//            switchTo().frame(bunner);
//            $("#carrotquest-messenger-body-big-cont > div.popup__controls > div").click();
//        }
//        catch (Exception e) {
//            System.out.println("Something went wrong.");
//        }
//    }
public void close_frame1(){
    bunner.shouldBe(Condition.visible, Duration.ofSeconds(60));
    switchTo().frame(bunner);
    $("#carrotquest-messenger-body-big-cont > div.popup__controls > div").click();
}
    public void press_save_equals (){
        safeEquals.click();
    }
    public void input_name_client() {
        getName.shouldBe(Condition.visible, Duration.ofSeconds(20));
        getName.sendKeys("Иван");
    }
    public void input_surename_client() {
        getSurname.shouldBe(Condition.visible, Duration.ofSeconds(20));
        getSurname.sendKeys("Иванов");
    }
    public void input_telephone_number_client() {
        getPhone.shouldBe(Condition.visible, Duration.ofSeconds(20));
        getPhone.sendKeys("89281665121");
    }
    public void press_save_equals_client_information() {
        buttonSaveEquals.shouldBe(Condition.visible, Duration.ofSeconds(20));
        buttonSaveEquals.click();
    }
    public void click_new_application_confirm(){
        buttonClose.shouldBe(Condition.visible, Duration.ofSeconds(20));
        buttonClose.click();
    }

}



