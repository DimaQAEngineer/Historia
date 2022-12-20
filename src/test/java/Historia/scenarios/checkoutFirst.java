package Historia.scenarios;

import Historia.scenarios.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.swing.text.html.parser.DTD;

import static com.codeborne.selenide.Selenide.*;

public class checkoutFirst extends BaseTest {
    private DTD document;

    @Test
    public void checkHref1(){
        gotoMainPage();
        $(By.id("uc-btn-accept-banner")).click();
        $x("//*[@id='mega-menu']/ul/li[3]/a").click();
        sec();$x("//*[@id='product-item-info_2103165']/div/strong/a").shouldBe().click();
        sec();$x("//*[@id='options-842901-list']/div[2]/label").click();
        sec();$x("//*[@id='product-addtocart-button']").click();
        sec();$x("//*[starts-with(@id, 'cart')]").sendKeys(Keys.BACK_SPACE);
        sec();$x("//*[starts-with(@id, 'cart')]").setValue("3");
        sec();$x("//*[starts-with(@id, 'update')]").click();
        sec();$x("//*[@id='minicart-content-wrapper']/div[3]/div[2]/a").click();
        sec();$x("//*[@id='shopping-cart-table']/section/div[2]/div[1]/div[2]/div/button[1]").click();
        sec();$x("//*[@id='shopping-cart-table']/section/div[2]/div[1]/div[2]/div/button[1]").click();
        sec();$x("//*[@id='shopping-cart-table']/div/button").click();
        sec();$x("//*[@id='maincontent']/div[2]/div/div[3]/div[1]/div[1]/button").click();
        secB();$x("//*[@id='customer-email']").setValue("dimaskopiwritter+test@gmail.com");
        EnterAllReqFields();
        sec();$x("//*[@id='checkout-shipping-method-load']/table/tbody/tr[1]/td[1]/div").shouldBe().click();
        sec();$x("//*[@id='shipping-method-buttons-container']/div/button").click();
        secB();$x("//*[@id='checkout-payment-method-load']/div/div/div[6]/div[1]/label/span").shouldBe().click();
    }
    @Test
    public void checkHref2() {
        open("https://www.historia.net/de-de/");
        $(By.id("uc-btn-accept-banner")).click();
        $x("//*[@id='mega-menu']/ul/li[3]/a").click();
        sec();$x("//*[@id='product-item-info_2103193']/a/div/picture/img").scrollTo();
        sec();$x("//*[@id='product-item-info_2103193']/div/strong/a").click();
        sec();$x("//*[@id='select2-bundle-option-19307-container']").click();
        sec();$x("//*[starts-with(@data-select2-id, 'select2-bundle')][1]").click();
        sec();$x("//*[@id='maincontent']").scrollTo();
        sec();$x("//*[@id='options-843253-list']/div[2]/label/span").click();
        sec();$x("//*[@id='product-addtocart-button']").click();
        sec();$x("//*[@id='minicart-content-wrapper']/div[3]/div[2]/a").click();
        sec();$x("//*[@id='shopping-cart-table']/section/div[2]/div[1]/div[2]/div/button[2]").click();
        sec();$x("//*[@id='shopping-cart-table']/div/button").click();
        sec();$x("//*[@id='maincontent']/div[2]/div/div[3]/div[1]/div[1]/button").click();
        secB();$x("//*[@id='customer-email']").setValue("dimaskopiwritter+test@gmail.com");
        sec();$x("//*[@id='co-shipping-form']//*[@name='prefix']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='firstname']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='lastname']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='street[0]']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='city']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='postcode']").setValue("23456");
        $x("//*[@id='co-shipping-form']//*[@name='city']").setValue("autotest");
        sec();$x("//*[@id='shipping']").scrollTo();
        sec();$x("//*[@id='checkout-shipping-method-load']/table/tbody/tr[3]/td[1]/div").click();
        sec();$x("//*[@id='shipping-method-buttons-container']/div/button").click();
        secV();$x("//*[@id='co-payment-form']/fieldset/div[2]/div[1]/div[1]/div[5]/label/input").click();
        secV(); $x("//*[@id='checkout-payment-method-load']/div/div/div[1]").scrollTo();
       secV(); //sec();$x("//*[@id="place-ppp-order"]/span").click();
    }
    @Test
    public void checkDataFinder1() {
        open("https://www.historia.net/de-de/");
        $(By.id("uc-btn-accept-banner")).click();
        sec();$x("//*[@id='html-body']/div[1]/header/div/div/div[4]").scrollTo();
        sec();$x("//*[@id='maincontent']/div[1]/form/div/div[1]/select").selectOption("23");
        sec();$x("//*[@id='maincontent']/div[1]/form/div/div[2]/select").selectOption("10");
        sec();$x("//*[@id='maincontent']/div[1]/form/div/div[3]/select").selectOption("2011");
        sec();$x("//*[@id='maincontent']/div[1]/form/div/button").click();
    }

}
