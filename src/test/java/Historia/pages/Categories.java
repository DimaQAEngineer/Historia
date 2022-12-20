package Historia.pages;

import Historia.scenarios.BaseTest;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class Categories extends BaseTest {
    @Step("Is h1 like this Hochzeitszeitung")
    public void Ish1likethis_Hochzeitszeitung() {
        $x("//*[@id='maincontent']/div[2]/div/div[1]/div[2]/div[2]/h1").shouldHave(text("Hochzeitszeitung"));
        sec();
    }
    @Step("Is h1 like this Geburtstagszeitung als Geschenk")
        public void Ish1likethis_GeburtstagszeitungalsGeschenk() {
            $x("//*[@id='maincontent']/div[2]/div/div[1]/div[2]/div[2]/h1").shouldHave(text("Geburtstagszeitung als Geschenk"));
            sec();
    }
    @Step("Is h1 like this Geschenke aus dem Zeitungsarchiv")
    public void Ish1likethis_GeschenkeausdemZeitungsarchiv() {
        $x("//*[@id='maincontent']/div[2]/div/div[1]/div[2]/div[2]/h1").shouldHave(text("Geschenke aus dem Zeitungsarchiv"));
        sec();
    }
    @Step("Is h1 like this Jubilaumszeitung")
    public void Ish1likethis_Jubilaumszeitung() {
        $x("//*[@id='maincontent']/div[2]/div/div[1]/div[2]/div[2]/h1").shouldHave(text("Jubiläumszeitung"));
        sec();
    }
    @Step("Is h1 like this Geschenkzeitung")
    public void Ish1likethis_Geschenkzeitung() {
        $x("//*[@id='maincontent']/div[2]/div/div[1]/div[2]/div[2]/h1").shouldHave(text("Geschenkzeitung"));
        sec();
    }
}
