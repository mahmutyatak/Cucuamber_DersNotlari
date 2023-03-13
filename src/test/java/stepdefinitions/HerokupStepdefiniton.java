package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokupPage;
import utulities.Driver;

import java.time.Duration;

public class HerokupStepdefiniton {
    HerokupPage herokupPage=new HerokupPage();
    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokupPage.addElementButonu.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        //WebDriverWait wait=new WebDriverWait(Driver.getdriever(), Duration.ofSeconds(40));
        //herokupPage.delteButonu=wait.until(ExpectedConditions.visibilityOfElementLocated((By) herokupPage.delteButonu));
        //implicitly wait suresi yeterli oldugu icin bu adimda kod yazilmadi

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokupPage.delteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
    herokupPage.delteButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        //olmayan bir elementi test etmek icin try catch yapması gerekir.
        Driver.getdriever().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            Assert.assertFalse(herokupPage.delteButonu.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }
}
