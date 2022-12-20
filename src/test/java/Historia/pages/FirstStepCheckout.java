package Historia.pages;

import Historia.scenarios.BaseTest;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class FirstStepCheckout extends BaseTest {

    @Step("Enter All Required Fields")
    public void EnterAllReqFields() {
        sec();
        $x("//*[@id='co-shipping-form']//*[@name='prefix']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='firstname']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='lastname']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='street[0]']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='postcode']").setValue("23456");
        $x("//*[@id='co-shipping-form']//*[@name='city']").setValue("autotest");}
    }

