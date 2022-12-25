package ru.yandex.SamokatTest;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import ru.yandex.SamokatPOM.MainPage;
import static org.junit.Assert.*;

public class MainPageTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void shouldEqualTextAccordion0() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(0);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel0(), actual);
    }
    @Test
    public void shouldEqualTextAccordion1() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(1);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel1(), actual);
    }
    @Test
    public void shouldEqualTextAccordion2() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(2);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel2(), actual);
    }
    @Test
    public void shouldEqualTextAccordion3() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(3);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel3(), actual);
    }
    @Test
    public void shouldEqualTextAccordion4() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(4);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel4(), actual);
    }
    @Test
    public void shouldEqualTextAccordion5() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(5);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel5(), actual);
    }
    @Test
    public void shouldEqualTextAccordion6() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(6);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel6(), actual);
    }
    @Test
    public void shouldEqualTextAccordion7() {
        MainPage objMainPageScooter = new MainPage(browserRule.getDriver());
        objMainPageScooter.open();
        String actual = objMainPageScooter.getTextAccordion(7);
        assertEquals(objMainPageScooter.expectedTextAccordionPanel7(), actual);
    }
}