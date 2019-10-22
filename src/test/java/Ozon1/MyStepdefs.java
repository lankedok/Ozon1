package Ozon1;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.nio.file.Files;

public class MyStepdefs {

    public SelenideElement book;
    public String nameOfBookFirst;
    public String nameOfBookSecond;

    @When("^open ozon$")
    public void openOzon() {
        open(WorkWithOzon.URL);
    }


    @And("^click on Catalog$")
    public void clickOnCatalog() {
        WorkWithOzon.putCataloge().click();
    }

    @And("^hover on Books$")
    public void hoverOnBooks() {
        WorkWithOzon.hoverBooks().hover();
    }

    @And("^click on Science$")
    public void clickOnScience() {
        WorkWithOzon.putTec().click();
    }

    @And("^waiting for check$")
    public void waitingForCheck() throws InterruptedException {
        Thread.sleep(10000);
    }

    @And("^choose check-box Best$")
    public void chooseCheckBoxBest() {
        WorkWithOzon.CheckBoxInBooks.checkBest().click();
    }

    @And("^choose check-box Lang$")
    public void chooseCheckBoxLang() {
        WorkWithOzon.CheckBoxInBooks.languageProgramm().click();
    }

    @Then("^choose random book$")
    public void chooseRandomBook() {
        ElementsCollection books = RandomBook.allBooksPass();
        book = books.get((int) (Math.random() * books.size()));
    }

    @And("^close cookie$")
    public void closeCookie() {
        WorkWithOzon.closeCookie();
    }

    @And("^add in Trash$")
    public void addInTrash() {
        book.find(By.xpath(RandomBook.randomBookPassTrash)).click();
    }

    @Then("^save book's name$")
    public void saveBookSName() {
        nameOfBookFirst = book.find(By.xpath(RandomBook.passForName)).getText();
    }

    @Then("^cheak that botton is dis$")
    public void cheakThatBottonIsDis() {
        Assert.assertFalse("ras_ras", book.find(By.xpath(RandomBook.randomBookPassTrash)).isDisplayed());
    }

    @And("^click on Trash$")
    public void clickOnTrash() {
        WorkWithOzon.trash().click();
    }

    @Then("^cheak book's name in trash$")
    public void cheakBookSNameInTrash() {
        nameOfBookSecond = WorkWithOzon.passForTrash().getText();
        Assert.assertTrue("eto_hardbas", nameOfBookSecond.equals(nameOfBookFirst));
    }
}
