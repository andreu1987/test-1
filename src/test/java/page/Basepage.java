package page;

import dev.failsafe.internal.TimeoutImpl;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLImageElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Basepage {
    public WebDriver driver;
    public WebDriverWait wait;
    // для вебдрайвера создаем конструктор //Constructor
    public Basepage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, int timeOutInSeconds:15);
    }

    //wait wrapper Method - апстрактный метод - будем ждать элемент пока мы его не выбирем
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));

    }
    // click Method нажать на какой-то элимент
    public void click (By elemenyBy) {
        waitVisibility(elemenyBy);
        driver.findElement(elemenyBy).click();
    }
    // Is Element Displayed
    public void isElementDisplayed (By elemenyBy) {
        waitVisibility(elemenyBy);
        assertTrue(driver.findElement(elemenyBy).isDisplayed());
}

