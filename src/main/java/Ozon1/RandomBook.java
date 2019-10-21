package Ozon1;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class RandomBook {
    public static String randomBookPassTrash = "div/div/button[contains(@class, 'buy-text-button')]";
    public static ElementsCollection allBooksPass() {
        return $$(By.xpath("//div[@class='tile-wrapper']"));
    }

}
