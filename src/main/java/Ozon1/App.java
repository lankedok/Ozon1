package Ozon1;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
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
        String name = book.find(By.xpath(RandomBook.passForName)).getText();
        Thread.sleep(5000);
        if  (book.find(By.xpath(RandomBook.randomBookPassTrash)).isDisplayed()) {
            System.out.println("botton is here");
        } else System.out.println("botton is't here");

        WorkWithOzon.trash().click();

        String nameFromTrash = WorkWithOzon.passForTrash().getText();
        if (nameFromTrash.equals(name)) {
            System.out.println("book is here");
        } else System.out.println("book isn't here");

        Thread.sleep(100000);

    }
}
