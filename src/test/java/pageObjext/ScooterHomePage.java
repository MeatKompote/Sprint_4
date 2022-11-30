package pageObjext;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ScooterHomePage extends AbstractPage{

    //private WebDriver driver;

    // конструктор
    public ScooterHomePage(WebDriver driver) {
        super(driver);
    }

    //___________________ Локатор на эмблему сайта _______________

    private By yandexScooterEmblem = By.className("Header_LogoScooter__3lsAR");

    //___________________ Локаторы на вопросы ____________________

    // локатор для хэдеров выпадающего списка
    private By locatorQuestionAccordeonHeader = By.xpath(".//div[@class='accordion__heading']");

    // локатор для ответов на важные вопросы
    private By locatorAnswerAccordeonPanel = By.xpath(".//div[@class='accordion__panel']/p");

    // первый вопрос в списке "Сколько это стоит? И как оплатить?"
    private By firstImportantQuestion = By.id("accordion__heading-0");

    // второй вопрос в списке "Хочу сразу несколько самокатов! Так можно?"
    private By secondImportantQuestion = By.id("accordion__heading-1");

    // третий вопрос в списке "Как рассчитывается время аренды?"
    private By thirdImportantQuestion = By.id("accordion__heading-2");

    // четвертый вопрос в списке "Можно ли заказать самокат прямо на сегодня?"
    private By fourthImportantQuestion = By.id("accordion__heading-3");

    // пятый вопрос в списке "Можно ли продлить заказ или вернуть самокат раньше?"
    private By fifthImportantQuestion = By.id("accordion__heading-4");

    // шестой вопрос в списке "Вы привозите зарядку вместе с самокатом?"
    private By sixthImportantQuestion = By.id("accordion__heading-5");

    // седьмой вопрос в списке "Можно ли отменить заказ?"
    private By seventhImportantQuestion = By.id("accordion__heading-6");

    // восьмой вопрос в списке "Я жизу за МКАДом, привезёте?"
    private By eighthImportantQuestion = By.id("accordion__heading-7");

    //___________________ Локаторы на ответы ____________________
    // первый ответ
    private By firstAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");

    // второй ответ
    private By secondAnswer = By.xpath(".//div[@id='accordion__panel-1']/p");

    // третий ответ
    private By thirdAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");

    // четвертый ответ
    private By fourthAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");

    // пятый ответ
    private By fifthAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");

    // шестой ответ
    private By sixthAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");

    // седьмой ответ
    private By seventhAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");

    // восьмой ответ
    private By eighthAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");

    // _________________ локаторы для кнопок _____________________

    // локатор для списка кнопок с тектом "Заказать"
    private By listOfOrderButtons = By.xpath(".//button[text()='Заказать']");

    // кнопка "Заказать" в верхней часте страницы
    private By orderButtonHeader = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");

    // кнопка "Заказать" в середине страницы
    private By orderButtonBody = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");

    // кнопка для закрытия сообщения о куках

    private By closingCookieMessageButton = By.id("rcc-confirm-button");

    // _________________ геттеры для локаторов _____________________
    public By getFirstImportantQuestion() {
        return firstImportantQuestion;
    }

    public By getSecondImportantQuestion() {
        return secondImportantQuestion;
    }

    public By getThirdImportantQuestion() {
        return thirdImportantQuestion;
    }

    public By getFourthImportantQuestion() {
        return fourthImportantQuestion;
    }

    public By getFifthImportantQuestion() {
        return fifthImportantQuestion;
    }

    public By getSixthImportantQuestion() {
        return sixthImportantQuestion;
    }

    public By getSeventhImportantQuestion() {
        return seventhImportantQuestion;
    }

    public By getEighthImportantQuestion() {
        return eighthImportantQuestion;
    }

    public By getFirstAnswer() {
        return firstAnswer;
    }

    public By getSecondAnswer() {
        return secondAnswer;
    }

    public By getThirdAnswer() {
        return thirdAnswer;
    }

    public By getFourthAnswer() {
        return fourthAnswer;
    }

    public By getFifthAnswer() {
        return fifthAnswer;
    }

    public By getSixthAnswer() {
        return sixthAnswer;
    }

    public By getSeventhAnswer() {
        return seventhAnswer;
    }

    public By getEighthAnswer() {
        return eighthAnswer;
    }

    public By getYandexScooterEmblem() {
        return yandexScooterEmblem;
    }

    public By getOrderButtonHeader() {
        return orderButtonHeader;
    }

    public By getOrderButtonBody() {
        return orderButtonBody;
    }

    public By getLocatorQuestionAccordeonHeader() {
        return locatorQuestionAccordeonHeader;
    }

    public By getLocatorAnswerAccordeonPanel() {
        return locatorAnswerAccordeonPanel;
    }

    public By getListOfOrderButtons() {
        return listOfOrderButtons;
    }

    public By getClosingCookieMessageButton() {
        return closingCookieMessageButton;
    }
}
