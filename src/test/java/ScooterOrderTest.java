import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjext.OrderDetailsPage;
import pageObjext.ScooterHomePage;
import pageObjext.UserInformationPage;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ScooterOrderTest {

    private WebDriver driver;

    private final String userName;
    private final String userSurname;
    private final String userAddress;
    private final String userMetroStation;
    private final String userPhoneNumber;
    private final String deliveryDate;
    private final int rentTime;
    private final int scooterColorNumber;
    private final String commentForCourier;
    private final String result;

    public ScooterOrderTest(String userName, String userSurname, String userAddress, String userMetroStation,
                            String userPhoneNumber, String deliveryDate, int rentTime, int scooterColorNumber,
                            String commentForCourier, String result) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
        this.userMetroStation = userMetroStation;
        this.userPhoneNumber = userPhoneNumber;
        this.deliveryDate = deliveryDate;
        this.rentTime = rentTime;
        this.scooterColorNumber = scooterColorNumber;
        this.commentForCourier = commentForCourier;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][] {
                {"Иван", "Иванов", "ул. Седова 66", "Черкизовская", "+79041112233", "27.11.2022", 2, 0, "Не поскользнись", "Заказ оформлен"},
                {"Петр", "Петров", "ул. Победы 77", "Сокольники", "+79064445566", "28.11.2022", 3, 1, "Не опаздай", "Заказ оформлен"},
        };
    }

    @Test
    public void orderScooterUsingHeaderButton() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);
        UserInformationPage objUserInformationPage = new UserInformationPage(driver);
        OrderDetailsPage objOrderDetailsPage = new OrderDetailsPage(driver);

        // ожидание загрузки главной страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // нажатие на копку "Заказать" в хэдере
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getOrderButtonHeader());
        // дождаться появления страницы "Для кого самокат"
        objUserInformationPage.waitTillElementIsvisible(objUserInformationPage.getUserInformationPageLabel());
        // вставить текст в поле Имя
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserName(), userName);
        // вставить текст в поле Фамилия
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserSurname(), userSurname);
        // вставить текст в поле Адрес
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserAddress(), userAddress);
        // вставить текст в поле Станция метро
        objUserInformationPage.selectUserMetroStation(userMetroStation);
        // вставить текст в поле Номер телефона
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserPhoneNumber(), userPhoneNumber);
        // кликнуть кнопку Далее
        objUserInformationPage.сlickToTheElement(objUserInformationPage.getButtonNext());
        // дождаться появления страницы "Про аренду"
        objOrderDetailsPage.waitTillElementIsvisible(objOrderDetailsPage.getOrderDetailsPageLabel());
        // вставить текст в поле "Когда привети самокат"
        objOrderDetailsPage.selectScooterDeliveryDate(deliveryDate);
        // вставить текст в поле "Срок аренды"
        objOrderDetailsPage.selectRentTime(rentTime);
        // выбор цвета скутера
        objOrderDetailsPage.selectScooterColor(scooterColorNumber);
        // вставить текст в поле "Комментарий для курьера"
        objOrderDetailsPage.insertTextIntoField(objOrderDetailsPage.getCommentForCourier(), commentForCourier);
        // кликнуть по кнопке "Заказать"
        objOrderDetailsPage.сlickToTheElement(objOrderDetailsPage.getButtonOrder());
        // кликнуть по кнопке "Да" на поп-апе "Хотите офрмить заказ"
        objOrderDetailsPage.сlickToTheElement(objOrderDetailsPage.getButtonOrderConfimation());
        assertEquals("Заголовок не совпадает с ожидаемым", result,
                objOrderDetailsPage.getTextFromElement(objOrderDetailsPage.getOrderCompleteLabel()));
    }

    @Test
    public void orderScooterUsingButtonInBody() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);
        UserInformationPage objUserInformationPage = new UserInformationPage(driver);
        OrderDetailsPage objOrderDetailsPage = new OrderDetailsPage(driver);

        // ожидание загрузки главной страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутить стрианицу до кнопки "Заказать"
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getOrderButtonBody());
        // нажатие на копку "Заказать" в середине страниы
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getOrderButtonBody());
        // дождаться появления страницы "Для кого самокат"
        objUserInformationPage.waitTillElementIsvisible(objUserInformationPage.getUserInformationPageLabel());
        // вставить текст в поле Имя
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserName(), userName);
        // вставить текст в поле Фамилия
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserSurname(), userSurname);
        // вставить текст в поле Адрес
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserAddress(), userAddress);
        // вставить текст в поле Станция метро
        objUserInformationPage.selectUserMetroStation(userMetroStation);
        // вставить текст в поле Номер телефона
        objUserInformationPage.insertTextIntoField(objUserInformationPage.getUserPhoneNumber(), userPhoneNumber);
        // кликнуть кнопку Далее
        objUserInformationPage.сlickToTheElement(objUserInformationPage.getButtonNext());
        // дождаться появления страницы "Про аренду"
        objOrderDetailsPage.waitTillElementIsvisible(objOrderDetailsPage.getOrderDetailsPageLabel());
        // вставить текст в поле "Когда привети самокат"
        objOrderDetailsPage.selectScooterDeliveryDate(deliveryDate);
        // вставить текст в поле "Срок аренды"
        objOrderDetailsPage.selectRentTime(rentTime);
        // выбор цвета скутера
        objOrderDetailsPage.selectScooterColor(scooterColorNumber);
        // вставить текст в поле "Комментарий для курьера"
        objOrderDetailsPage.insertTextIntoField(objOrderDetailsPage.getCommentForCourier(), commentForCourier);
        // кликнуть по кнопке "Заказать"
        objOrderDetailsPage.сlickToTheElement(objOrderDetailsPage.getButtonOrder());
        // кликнуть по кнопке "Да" на поп-апе "Хотите офрмить заказ"
        objOrderDetailsPage.сlickToTheElement(objOrderDetailsPage.getButtonOrderConfimation());
        assertEquals("Заголовок не совпадает с ожидаемым", result,
                objOrderDetailsPage.getTextFromElement(objOrderDetailsPage.getOrderCompleteLabel()));
    }


    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
