package pageObjext;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class AbstractPage {

    protected WebDriver driver;

    // конструктор
    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    // ______________________ Прокрутка вниз до элемента ___________________

    public void scrollDownToTheElement(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //___________________ Нажатие на элемент ____________________
    public void clickToTheElement(By elementLocator) {
        driver.findElement(elementLocator).click();
    }

    //___________________ Ожидание прогрузки элемента ___________
    public void waitTillElementIsVisible (By elementLocator) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    //___________________ Получение теста элемента ________________
    public String getTextFromElement(By elementLocator) {
        return driver.findElement(elementLocator).getText();
    }

    //___________________ Вставить тескт в поле ________________
    public void insertTextIntoField(By elementLocator, String newText) {
        driver.findElement(elementLocator).clear();
        driver.findElement(elementLocator).sendKeys(newText);
    }

    // прокрутка до элемента в списке вопросов или ответов
    public void scrollDownToTheElementFromTheList(int questionNumber, By locatorForList) {
        List<WebElement> elements = driver.findElements(locatorForList);
        for (int i = 0; i < elements.size(); i++) {
            if (i == questionNumber) {
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elements.get(i));
                break;
            }
        }
    }

    // клик на нужный вопрос из списка вопросов
    public void clickOnTheElementFromTheList(int questionNumber, By locatorForList) {
        List<WebElement> elements = driver.findElements(locatorForList);
        for (int i = 0; i < elements.size(); i++) {
            if (i == questionNumber) {
                elements.get(i).click();
                break;
            }
        }
    }

    // забираем текст для сравнения ответа на важный вопрос
    public String getTextFromAnswerPanel(int questionNumber, By locatorForList) {
        List<WebElement> elements = driver.findElements(locatorForList);
        for (int i = 0; i < elements.size(); i++) {
            if (i == questionNumber) {
                return elements.get(i).getText();
            }
        }
        return null;
    }
}
