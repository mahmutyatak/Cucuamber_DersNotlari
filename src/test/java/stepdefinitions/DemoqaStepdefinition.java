package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utulities.Driver;
import utulities.ReusableMethods;

import java.time.Duration;

public class DemoqaStepdefinition {
DemoqaPage demoqaPage=new DemoqaPage();
    @Then("Alerts sekmesine tiklar")
    public void alerts_sekmesine_tiklar() {
        ReusableMethods.scrollToElement(demoqaPage.alertTusu);
    demoqaPage.alertTusu.click();
    }
    @Then("ustten ikinci click me butonuna basar")
    public void ustten_ikinci_click_me_butonuna_basar() {
        demoqaPage.ikinciClick.click();

    }
    @Then("Allert in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() {

        WebDriverWait wait=new WebDriverWait(Driver.getdriever(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    @Then("Allert uzerindeki yazinin {string} oldugunu test eder")
    public void allert_uzerindeki_yazinin_oldugunu_test_eder(String yazi) {
        Assert.assertEquals(yazi, Driver.getdriever().switchTo().alert().getText());

    }
    @Then("Ok diyerek alerti kapatir")
    public void ok_diyerek_alerti_kapatir() {
Driver.getdriever().switchTo().alert().accept();
    }

}
