import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjext.ScooterHomePage;

import static org.junit.Assert.assertEquals;

public class ScooterImportantQuestionsTest {

    private WebDriver driver;

    String expectedFirstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    String expectedSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, " +
            "можете просто сделать несколько заказов — один за другим.";

    String expectedThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
            "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
            "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    String expectedFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    String expectedFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку " +
            "по красивому номеру 1010.";

    String expectedSyxthAnswer = "Самокат приезжает к вам с полной зарядкой. " +
            "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    String expectedSeventhAnswer = "Да, пока самокат не привезли. " +
            "Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    String expectedEighthAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test // проверка ответа на первый важный вопрос
    public void checkAnswerForFirstImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до первого важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getFirstImportantQuestion());
        // клик на первый важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getFirstImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getFirstAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedFirstAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getFirstAnswer()));

    }

    @Test //проверка ответа на второй важный вопрос
    public void checkAnswerForSecondImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getSecondImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getSecondImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getSecondAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedSecondAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getSecondAnswer()));

    }

    @Test //проверка ответа на третий важный вопрос
    public void checkAnswerForThirdImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getThirdImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getThirdImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getThirdAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedThirdAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getThirdAnswer()));

    }

    @Test //проверка ответа на четвертый важный вопрос
    public void checkAnswerForFourthImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getFourthImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getFourthImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getFourthAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedFourthAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getFourthAnswer()));

    }

    @Test //проверка ответа на пятый важный вопрос
    public void checkAnswerForFifthImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getFifthImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getFifthImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getFifthAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedFifthAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getFifthAnswer()));

    }

    @Test //проверка ответа на шестой важный вопрос
    public void checkAnswerForSixthImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getSixthImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getSixthImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getSixthAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedSyxthAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getSixthAnswer()));
    }

    @Test //проверка ответа на седьмой важный вопрос
    public void checkAnswerForSeventhImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getSeventhImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getSeventhImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getSeventhAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedSeventhAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getSeventhAnswer()));
    }

    @Test //проверка ответа на восьмой важный вопрос
    public void checkAnswerForEighthImportantQuestion() {
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objScooterHomePage = new ScooterHomePage(driver);

        // ожидание загрузки страницы
        objScooterHomePage.waitTillElementIsvisible(objScooterHomePage.getYandexScooterEmblem());
        // прокрутка до важного вопроса
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getEighthImportantQuestion());
        // клик на важный вопрос
        objScooterHomePage.сlickToTheElement(objScooterHomePage.getEighthImportantQuestion());
        // прокрутка до ответа
        objScooterHomePage.scrollDownToTheElement(objScooterHomePage.getEighthAnswer());
        // проверка текста в ответе
        assertEquals("Ответ не совпадает с ожидаемым ответом", expectedEighthAnswer,
                objScooterHomePage.getTextFromElement(objScooterHomePage.getEighthAnswer()));
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }

}
