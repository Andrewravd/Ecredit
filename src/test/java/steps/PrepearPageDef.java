package steps;

import io.cucumber.java.en.Then;
import pages.PrepearPage;

import static com.codeborne.selenide.Selenide.sleep;

public class PrepearPageDef {
    PrepearPage prepearPage = new PrepearPage();

    @Then("Загружает документы клиента")
    public void input_docs() {
        prepearPage.input_passport();
        prepearPage.close_found_personal_data();
        prepearPage.input_drivers();
    }

    @Then("Заполняет личную информацию")
    public void input_clients_information() {
        prepearPage.input_clients_fio();
        prepearPage.choose_family_status();
        prepearPage.series_number();
        prepearPage.select_data_drive_licence();
        prepearPage.click_on_dropdown();
        prepearPage.select_registration_adress();
        prepearPage.select_registration_date();
        prepearPage.input_trust_person_fio();
        prepearPage.select_trust_person_phone_number();
    }

    @Then("Заполняет информацию о работе и доходе")
    public void input_job_information() {
        prepearPage.choose_work_type();
        prepearPage.select_position();
        prepearPage.select_organization_name();
        prepearPage.select_careerStartTime();
        prepearPage.choose_work_experience_age();
        prepearPage.select_mainProfit();
        prepearPage.select_addedProfit();
        prepearPage.input_consedence();
//        prepearPage.click_in_button();
        sleep(50000000);

    }
}