package Historia.scenarios;

import Historia.pages.Categories;
import Historia.pages.MainPage;
import org.junit.Test;

import javax.swing.text.html.parser.DTD;

public class FirstThree extends BaseTest {
    private DTD document;

    MainPage mainPage = new MainPage();
    Categories categories = new Categories();
    @Test
    public void CataloguePages(){
        gotoMainPage();
        mainPage.Acceptallcookies();
        mainPage.ZeitungfindenHochzeitszeitung();
        categories.Ish1likethis_Hochzeitszeitung();
        mainPage.ZeitungfindenZeitungvomTagderGeburt();
        categories.Ish1likethis_GeburtstagszeitungalsGeschenk();
        mainPage.ZeitungfindenZeitungsarchiv();
        categories.Ish1likethis_GeschenkeausdemZeitungsarchiv();
        mainPage.ZeitungfindenJubilaumszeitung();
        categories.Ish1likethis_Jubilaumszeitung();
        mainPage.ZeitungfindenGeschenkzeitung();
        categories.Ish1likethis_Geschenkzeitung();
    }
}