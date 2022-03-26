package M;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MvideoPage {

    private SelenideElement status = $(withText("Статус заказа"));
    private SelenideElement login = $(By.cssSelector("a[title='Личный кабинет']"));

    public void statusClick() {
        status.click();
    }

    public MvideoPage() {
        status.shouldBe(Condition.visible);
        login.shouldBe(Condition.visible);
    }
}
