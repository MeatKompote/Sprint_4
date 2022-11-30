import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjext.ScooterHomePage;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ScooterImportantQuestionsTest {

    private WebDriver driver;

    private final int importantQuestionNumber;
    private final String expectedAnswer;

    public ScooterImportantQuestionsTest(int importantQuestionNumber, String expectedAnswer) {
        this.importantQuestionNumber = importantQuestionNumber;
        this.expectedAnswer = expectedAnswer;
    }

    @Parameterized.Parameters
    public static Object[][] getImportantQuestionsData() {
        return new Object[][] {
                {0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями," +
                        " можете просто сделать несколько заказов — один за другим."},
                {2, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                        "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                        "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {3, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {4, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {5, "Самокат приезжает к вам с полной зарядкой. " +
                        "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. " +
                        "Зарядка не понадобится."},
                {6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {7, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }

    @Before
    public void initialize() {
        driver = new ChromeDriver();
    }

    @Test // проверка ответа на первый важный вопрос
    public void checkAnswerForFirstImportantQuestion() {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsVisible(objScooterHomePage.getYandexScooterEmblem());
        // закрытие сообщения про куки
        objScooterHomePage.clickToTheElement(objScooterHomePage.getClosingCookieMessageButton());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElementFromTheList(importantQuestionNumber, objScooterHomePage.getListOfOrderButtons());
        // клик на важный вопрос
        objScooterHomePage.clickOnTheElementFromTheList(importantQuestionNumber, objScooterHomePage.getLocatorQuestionAccordeonHeader());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElementFromTheList(importantQuestionNumber, objScooterHomePage.getLocatorAnswerAccordeonPanel());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedAnswer,
                objScooterHomePage.getTextFromAnswerPanel(importantQuestionNumber, objScooterHomePage.getLocatorAnswerAccordeonPanel()));
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }

}
