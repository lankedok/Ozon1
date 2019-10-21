package Ozon1;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 6000;

        open(WorkWithOzon.URL);
        WorkWithOzon.putCataloge().click();
        WorkWithOzon.hoverBooks().hover();
        WorkWithOzon.putTec().click();
        WorkWithOzon.CheckBoxInBooks.checkBest().click();
        WorkWithOzon.CheckBoxInBooks.languageProgramm().click();


        ElementsCollection books = RandomBook.allBooksPass();
        SelenideElement book = books.get((int) (Math.random() * books.size()));
        WorkWithOzon.closeCookie();
        book.find(By.xpath(RandomBook.randomBookPassTrash)).click();

        WorkWithOzon.trash().click();

        Thread.sleep(100000000);

    }
}
