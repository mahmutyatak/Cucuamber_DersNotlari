package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

public class AmazonStepdefinitions {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getdriever().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("arama kutusuna Nutella yazar ve enter tusuna basar")
    public void arama_kutusuna_nutella_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
   ;
    }
    @Then("sayfayi kapatir.")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }

    @When("arama kutusuna Java yazar ve enter tusuna basar")
    public void aramaKutusunaJavaYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIcerik="Java";
        String actualIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @When("arama kutusuna Apple yazar ve enter tusuna basar")
    public void aramaKutusunaAppleYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Apple"+ Keys.ENTER);
    }

    @Then("arama sonuclarinin Apple icerdigini test eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder() {
        String expectedIcerik="Apple";
        String actualIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("amazonda {string} icin arama yapar")
    public void amazondaIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {

        String actualIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualIcerik.contains(arananKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int istenenSaniye) {
        ReusableMethods.bekle(istenenSaniye);
    }
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
    Driver.getdriever().get(ConfigReader.getProperty(istenenUrl));

    }
    @Then("{string} sayfsina gittigini test eder")
    public void sayfsina_gittigini_test_eder(String istenenUrl) {
    String actualUrl=Driver.getdriever().getCurrentUrl();
    String expectedUrl=ConfigReader.getProperty(istenenUrl)+"/";
    Assert.assertEquals(expectedUrl,actualUrl);
    }
    @When("{int}. urune gider")
    public void urune_gider(Integer istenenIndex) {
        amazonPage.istenenUrunElementi(istenenIndex).click();
    }
    @Then("urun isminin {string} icerdigini test eder.")
    public void urun_isminin_icerdigini_test_eder(String arananKelime) {
    String actualUrunIsmi=amazonPage.ilkUrunIsimElementi.getText();
    Assert.assertTrue(actualUrunIsmi.contains(arananKelime));
    }

}
