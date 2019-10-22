package Ozon1;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;
import org.openqa.selenium.By;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$$;

public class RandomBook {
    public static String randomBookPassTrash = "div/div/button[contains(@class, 'buy-text-button')]";
    public static String passForName = ".//span[@data-test-id='tile-name']";
   // public static SelenideElement book;
    public static ElementsCollection allBooksPass() {
        return $$(By.xpath("//a[@class='tile-wrapper']"));
    }







}
