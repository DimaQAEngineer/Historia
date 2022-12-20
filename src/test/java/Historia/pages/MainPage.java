package Historia.pages;

import Historia.scenarios.BaseTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
*  Головна сторінка сайту
*/

public class MainPage {

    @Step("Accept all cookies")
    public void Acceptallcookies() {
        $(By.id("uc-btn-accept-banner")).click();
    }

    @Step("Click on Zeitung finden>Hochzeitszeitung")
    public void ZeitungfindenHochzeitszeitung() {
        actions()
                .moveToElement($x("//*[@id='mega-menu']/ul/li[1]")).pause(3000)
                .build().perform();
        $x("//*[@id='mega-menu']/ul/li[1]/ul/li[1]/a").shouldBe().click();
        baseTest.sec();
    }
    @Step("Click on Zeitung finden>Zeitung vom Tag der Geburt")
    public void ZeitungfindenZeitungvomTagderGeburt(){
            actions()
                    .moveToElement($x("//*[@id='mega-menu']/ul/li[1]")).pause(3000)
                    .build().perform();
            $x("//*[@id='mega-menu']/ul/li[1]/ul/li[2]/a").shouldBe().click();
        baseTest.sec();
    }
    @Step("Click on Zeitung finden>Zeitungsarchiv")
    public void ZeitungfindenZeitungsarchiv() {
        actions()
                .moveToElement($x("//*[@id='mega-menu']/ul/li[1]")).pause(3000)
                .build().perform();
        $x("//*[@id='mega-menu']/ul/li[1]/ul/li[3]/a").shouldBe().click();
        baseTest.sec();
    }
    @Step("Click on Zeitung finden>Jubiläumszeitung")
    public void ZeitungfindenJubilaumszeitung(){
        actions()
                .moveToElement($x("//*[@id='mega-menu']/ul/li[1]")).pause(3000)
                .build().perform();
        $x("//*[@id='mega-menu']/ul/li[1]/ul/li[4]/a").shouldBe().click();
        baseTest.sec();
    }
    @Step("Click on Zeitung finden>Geschenkzeitung")
    public void ZeitungfindenGeschenkzeitung(){
        actions()
                .moveToElement($x("//*[@id='mega-menu']/ul/li[1]")).pause(3000)
                .build().perform();
        $x("//*[@id='mega-menu']/ul/li[1]/ul/li[5]/a").shouldBe().click();
        baseTest.sec();
    }

    BaseTest baseTest = new BaseTest();
}
