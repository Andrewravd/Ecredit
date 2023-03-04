package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class MainPage {


    private SelenideElement createApplication = $(By.xpath("//div[@class='nav-button logo']/following-sibling::div[1]"));

    private SelenideElement createApplicationNav = $(By.xpath("//span[text()='Создать']/parent::div"));

    private SelenideElement createApplicationCredit = $(By.xpath("//a[text()='Кредит']"));

    private SelenideElement bunner = $("#carrot-popup-frame");

    public void press_create_new_application() {
        createApplication.shouldBe(Condition.visible, Duration.ofSeconds(20));
        createApplication.click();
    }

    public void move_to_create_new_application() {
        createApplicationNav.shouldBe(Condition.visible, Duration.ofSeconds(20));
        createApplicationNav.click();
    }

    public void press_create_new_application_button() {
        createApplicationCredit.shouldBe(Condition.visible, Duration.ofSeconds(20));
        createApplicationCredit.click();
    }

    public void close_frame1() {
        bunner.shouldBe(Condition.visible, Duration.ofSeconds(60));
        switchTo().frame(bunner);
        $("#carrotquest-messenger-body-big-cont > div.popup__controls > div").click();
    }
}
