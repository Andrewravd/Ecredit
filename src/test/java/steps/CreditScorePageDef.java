package steps;

import io.cucumber.java.en.Then;
import pages.CreditScorePage;

import static com.codeborne.selenide.Selenide.sleep;

public class CreditScorePageDef {
    CreditScorePage creditScorePage = new CreditScorePage();
    @Then("Выбирает марку машины")
    public void select_mark_car() {
        sleep(30000);
        creditScorePage.select_mark_car();
    }
    @Then("Выбирает модель машины")
    public void select_model_car() {
        creditScorePage.select_model_car();
    }
    @Then("Выбирает комплектацию машины")
    public void select_complection_car() {
        creditScorePage.select_complection_car();
//        sleep(500000);
    }
        @Then("Указывает цену Каско")
        public void inputKaskoPrice(){
        creditScorePage.inputKaskoPrice();
    }
    @Then("Нажимает на кнопку Выбрать предложение")
    public void press_get_count_button () {
//        creditScorePage.close_frame1();
        creditScorePage.press_get_count_button();
    }
    @Then("Выбирает предложение")
    public void press_choose_someone_offer () {
//        creditScorePage.close_frame();
        creditScorePage.press_choose_someone_offer();

    }
    @Then("Подтверждает  предложение")
    public void press_save_equals () {
        creditScorePage.press_save_equals();

    }
    @Then("Заполняет анкету клиента")
    public void input_fio_client(){
        creditScorePage.input_name_client();
        creditScorePage.input_surename_client();
        creditScorePage.input_telephone_number_client();
        creditScorePage.press_save_equals_client_information();
        creditScorePage.click_new_application_confirm();

    }
}
