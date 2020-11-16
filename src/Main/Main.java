package Main;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // Установить браузер на весь экран
        driver.manage().window().maximize();

        // Установить размеры окна браузера
        driver.manage().window().setSize(new Dimension(1000,500));


        //позволяет открыть какую либо страницу
        driver.get("https://www.google.com/");

        // позволяет открыть какую либо страницу (второй способ)
        driver.navigate().to("https://habr.com/ru/");

        // вернуться на предыдущую страницу
        driver.navigate().back();

        // вернуться на страницу вперед
        driver.navigate().forward();

        // перезагрузить страницу
        driver.navigate().refresh();

        // получить title на странице
        String title = driver.getTitle();
        System.out.println(title);

        // получить url текущего сайта
        String urlSite = driver.getCurrentUrl();
        System.out.println(urlSite);

        // браузер будет закрыт
        driver.quit();
    }

}

