package Historia.scenarios;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1720x900";
        Configuration.headless = false;
            }
            public void gotoMainPage(){
                open("https://www.historia.net/de-de/");
            }
    public void sec(){
        sleep(2000);
    }
//    }
    public void secB(){sleep(4000);
    }
    public void secV(){sleep(9000);
    }
    public void EnterAllReqFields() {
        sec();
        $x("//*[@id='co-shipping-form']//*[@name='prefix']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='firstname']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='lastname']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='street[0]']").setValue("autotest");
        $x("//*[@id='co-shipping-form']//*[@name='postcode']").setValue("23456");
        $x("//*[@id='co-shipping-form']//*[@name='city']").setValue("autotest");}

        @Before
    public void init(){
        setUp();
            }
            @After
    public void tearDown(){
                Selenide.closeWebDriver();
            }
   }
