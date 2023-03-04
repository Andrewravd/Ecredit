package steps;

import io.cucumber.java.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl(){
        open("https://stage-v4-frontend.e-credit.one");
      $(By.cssSelector("input[type='text']")).sendKeys("gzpbank@ecredit.one");
      $(By.cssSelector("input[type='password']")).sendKeys("gvymW7");
      $(By.cssSelector("button")).click();

    }
}
