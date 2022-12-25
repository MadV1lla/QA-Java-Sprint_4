package ru.yandex.SamokatPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private By buttonUp = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    private By buttonDown = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");
    private final String url = "https://qa-scooter.praktikum-services.ru/";  //Адрес сайта
    private final String expected0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой."; //Ожидаемый ответ на 1 вопрос
    private final String expected1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; //Ожидаемый ответ на 2 вопрос
    private final String expected2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; //Ожидаемый ответ на 3 вопрос
    private final String expected3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; //Ожидаемый ответ на 4 вопрос
    private final String expected4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; //Ожидаемый ответ на 5 вопрос
    private final String expected5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; //Ожидаемый ответ на 6 вопрос
    private final String expected6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; //Ожидаемый ответ на 7 вопрос
    private final String expected7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; //Ожидаемый ответ на 8 вопрос

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get(url);
    }
    public void clickButtonUp() {
        driver.findElement(buttonUp).click();
    }

    public void clickButtonDown() {
        WebElement element = driver.findElement(buttonDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(buttonDown).click();
    }
    public String getTextAccordion(int num) {
        String accordionHeading_id = "accordion__heading-" + num; //Локатор "вопрос о важном"
        String accordionPanel_id = "accordion__panel-" + num; //Локатор "ответ на вопрос"
        By accordionHeading = By.id(accordionHeading_id);
        By accordionPanel = By.id(accordionPanel_id);
        WebElement element = driver.findElement(accordionHeading);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel)).getText();
    }
    public String expectedTextAccordionPanel0() {
        return expected0;
    }
    public String expectedTextAccordionPanel1() {
        return expected1;
    }
    public String expectedTextAccordionPanel2() {
        return expected2;
    }
    public String expectedTextAccordionPanel3() {
        return expected3;
    }
    public String expectedTextAccordionPanel4() {
        return expected4;
    }
    public String expectedTextAccordionPanel5() {
        return expected5;
    }
    public String expectedTextAccordionPanel6() {
        return expected6;
    }
    public String expectedTextAccordionPanel7() {
        return expected7;
    }
}