package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {


    private SelenideElement newApplication = $(By.xpath("//div[@class='nav-button logo']"));

    private SelenideElement createApplication = $(By.xpath("//span[text()='Создать']/parent::div"));

    private SelenideElement credit = $(By.xpath("//a[text()='Кредит']"));

    public SelenideElement getNewApplication() {
        return newApplication;
    }

    public SelenideElement getCreateApplication() {
        return createApplication;
    }

    public SelenideElement getCredit() {
        return credit;
    }

}
