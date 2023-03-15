package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;

public class GoogleStepDefinition {
    GooglePage googlePage=new GooglePage();
    double karsilatirma;
    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
       String para=googlePage.paraKarsilastirma.getText().replace(",",".");
      karsilatirma=Double.parseDouble(para);

    }


    @Then("Arama Kutusuna karsilastirma yapmak istedigi {string} girer")
    public void aramaKutusunaKarsilastirmaYapmakIstedigiGirer(String paraBirimi) {
        googlePage.searchBox.sendKeys(paraBirimi+ Keys.ENTER);
    }

    @Then("Verilen degerlerin {int} den kucuk oldugunu dogrular dogrular")
    public void verilenDegerlerinDenKucukOldugunuDogrularDogrular(int deger) {
        Assert.assertTrue(karsilatirma<deger);
    }


}
