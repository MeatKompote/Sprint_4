package pageObjext;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserInformationPage extends AbstractPage {
    //private WebDriver driver;


    // конструктор
    public UserInformationPage(WebDriver driver) {
        super(driver);
    }

    //___________________ Локатор на заголовок страницы _______________

    private By userInformationPageLabel = By.className("Order_Header__BZXOb");

    //___________________ Локаторы на поля ввода ______________________

    // имя
    private By userName = By.xpath(".//div[@class='Order_Form__17u6u']/div[1]/input");

    // фамилия
    private By userSurname = By.xpath(".//div[@class='Order_Form__17u6u']/div[2]/input");

    // адрес
    private By userAddress = By.xpath(".//div[@class='Order_Form__17u6u']/div[3]/input");

    // станция Метро
    private By userMetroStation = By.xpath(".//div[@class='Order_Form__17u6u']/div[4]/div/div/input");

    // телефон
    private By userPhoneNumber = By.xpath(".//div[@class='Order_Form__17u6u']/div[5]/input");

    //___________________ Локаторы на кнопки ______________________

    // кнопка "Далее"
    private By buttonNext = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");

    //___________________Геттеры для локаторов ______________________

    public By getUserInformationPageLabel() {
        return userInformationPageLabel;
    }

    public By getUserName() {
        return userName;
    }

    public By getUserSurname() {
        return userSurname;
    }

    public By getUserAddress() {
        return userAddress;
    }

    public By getUserMetroStation() {
        return userMetroStation;
    }

    public By getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public By getButtonNext() {
        return buttonNext;
    }

    // ______________________ ввод станции метро _______________________
    public void selectUserMetroStation(String newMetroStation) {
        driver.findElement(userMetroStation).click();
        driver.findElement(userMetroStation).sendKeys(newMetroStation);
        driver.findElement(userMetroStation).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

/*
    // ______________________ Прокрутка вниз до элемента ___________________

    public void scrollDownToTheElement(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //___________________ Нажатие на элемент ____________________

    public void сlickToTheElement(By elementLocator) {
        driver.findElement(elementLocator).click();
    }

    //___________________ Ожидание прогрузки элемента ___________

    public void waitTillElementIsvisible (By elementLocator) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }
*/
}
