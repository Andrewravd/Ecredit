package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class MainPageDef {
MainPage mainPage = new MainPage();

@Then("создает новую заявку")

    public void press_create_new_application(){
    sleep(1000);
//        mainPage.close_frame1();
        $(By.xpath(".//div[@class='nav-button nav-button--increased-height']")).click();
        $(By.xpath(".//div[@class='nav-item nav-item--increased-height user']")).click();
        $(By.xpath(" .//button[@title='Тестирование Газпромбанк']")).click();
//        mainPage.close_frame1();
        mainPage.press_create_new_application();
        mainPage.move_to_create_new_application();
        mainPage.press_create_new_application_button();
    }

}
