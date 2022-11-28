package pageObjext;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OrderDetailsPage extends AbstractPage {

    //private WebDriver driver;

    // конструктор
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    //___________________ Локатор на заголовок страницы _______________

    private By orderDetailsPageLabel = By.className("Order_Header__BZXOb");

    //___________________ Локаторы на поля ввода ______________________

    // дата доставки
    private By deliveryDate = By.xpath(".//div[@class='react-datepicker__input-container']/input");

    // срок аренды
    private By rentTime = By.xpath(".//div[@class='Dropdown-control']");

    // список количества дней для аренды
    private By listOfRentDays = By.xpath(".//div[@class='Dropdown-menu']/div");

    // локаторы чекбоксов

    private By colorCheckboxes = By.className("Checkbox_Input__14A2w");

    // чекбокс цвет самоката: черный жемчуг
    //private By blackPearlColorCheckbox = By.xpath(".//div[@class='Order_Checkboxes__3lWSI']/label/input[@id='black']");
    private By blackPearlColorCheckbox = By.xpath(".//div[@class='Order_Checkboxes__3lWSI']/label[1]");

    // чекбокс цвет самоката: серая безысходность
    //private By greyHopelessnessColorCheckbox = By.xpath(".//div[@class='Order_Checkboxes__3lWSI']/label/input[@id='grey']");
    private By greyHopelessnessColorCheckbox = By.xpath(".//div[@class='Order_Checkboxes__3lWSI']/label[2]");

    // комментарий для курьера
    private By commentForCourier = By.xpath(".//div[@class='Order_Content__bmtHS']//div[@class='Input_InputContainer__3NykH']/input");

    //___________________ Локаторы на кнопки ______________________

    // кнопка "Заказать"
    private By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

    // кнопка "Ок" на попапе "Хотите оформить заказ"

    private By buttonOrderConfimation = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    //_____________Локатор на заголок попапа "Заказ оформлен"___________

    private By orderCompleteLabel = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    //___________________Гетеры для локаторов _____________________

    public By getOrderDetailsPageLabel() {
        return orderDetailsPageLabel;
    }

    public By getDeliveryDate() {
        return deliveryDate;
    }

    public By getRentTime() {
        return rentTime;
    }

    public By getBlackPearlColorCheckbox() {
        return blackPearlColorCheckbox;
    }

    public By getGreyHopelessnessColorCheckbox() {
        return greyHopelessnessColorCheckbox;
    }

    public By getCommentForCourier() {
        return commentForCourier;
    }

    public By getButtonOrder() {
        return buttonOrder;
    }

    public By getButtonOrderConfimation() {
        return buttonOrderConfimation;
    }

    public By getOrderCompleteLabel() {
        return orderCompleteLabel;
    }

    // ______________________ ввод количества дней аренды _______________________
    public void selectRentTime(int newRentTime) {
        driver.findElement(rentTime).click();
        List<WebElement> elements = driver.findElements(listOfRentDays);
        for (int i = 0; i < elements.size(); i++) {
            if (i == newRentTime) {
                elements.get(i).click();
                break;
            }
        }

    }

    // ______________________ Выбор цвета для скутера _______________________
    public void selectScooterColor(int colorNumber) {
        List<WebElement> elements = driver.findElements(colorCheckboxes);
        for (int i = 0; i < elements.size(); i++) {
            if (i == colorNumber) {
                elements.get(i).click();
                break;
            }
        }
    }
        // ______________________ Выбор даты доставки _____________________________
        public void selectScooterDeliveryDate(String orderDate){
            driver.findElement(deliveryDate).click();
            driver.findElement(deliveryDate).sendKeys(orderDate);
            driver.findElement(deliveryDate).sendKeys(Keys.ENTER);
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

