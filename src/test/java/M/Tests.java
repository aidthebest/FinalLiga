package M;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {
    MvideoPage mvideoPage;

    @Test
    public void openPage() {
        open("https://mvideo.ru");
        mvideoPage = new MvideoPage();
        mvideoPage.statusClick();
    }
}
