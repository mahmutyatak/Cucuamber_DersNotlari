package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QdPage;
import utulities.ConfigReader;

public class CalismaStepDefinition {
    QdPage qdPage=new QdPage();
    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
       qdPage.ilkLoginLinki.click();
    }
    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String emailKutusu) {
        qdPage.emailKutusu.sendKeys(emailKutusu);
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
     qdPage.passwordKutusu.sendKeys(password);
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
    qdPage.loginButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qdPage.basariliGirisElementi.isEnabled());
    }

    @And("cokkie kabul eder")
    public void cokkieKabulEder() {
        qdPage.cookie.click();
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(qdPage.loginButonu.isDisplayed());
    }

    @And("kullanici kutusuna config reader dan {string} yazar")
    public void kullaniciKutusunaConfigReaderDanYazar(String username) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(username));
    }

    @And("password kutusuna config reader dan {string} yazar")
    public void passwordKutusunaConfigReaderDanYazar(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
}
