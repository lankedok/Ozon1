package Ozon1;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WorkWithOzon {
    public static final String URL = "https://www.ozon.ru/";

    public static SelenideElement putCataloge() {
        return $(byText("Каталог"));
    }
    public static SelenideElement hoverBooks() {
        return $(byText("Книги"));
    }
    public static SelenideElement putTec() {
        return $(byText("Компьютерные технологии"));
    }
    public static class CheckBoxInBooks {
        public static SelenideElement checkBest() {
            return $(byText("Бестселлеры"));
        }
        public static SelenideElement languageProgramm() {
            return $(byText("Языки программирования"));
        }
    }
    public static void closeCookie() {
        $(By.xpath("//button[@class='close']")).click();
    }

    public static SelenideElement trash() {
        return $(By.xpath("//a[@href='/cart']"));
    }

}
