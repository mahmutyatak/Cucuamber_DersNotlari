package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUnivercityPage;
import utulities.Driver;
import utulities.ReusableMethods;

public class WebUnivercityStepdefinition {
    String ilkHandle="";
    WebUnivercityPage webUnivercityPage=new WebUnivercityPage();
    @Then("Login Portal gorununceye kadar asagi iner")
    public void login_portal_gorununceye_kadar_asagi_iner() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getdriever();
        jse.executeScript("arguments[0].scrollIntoView();",webUnivercityPage.loginPortalElement);
    }
    @Then("Login Portal butonuna tiklar")
    public void login_portal_butonuna_tiklar() {
        ilkHandle=Driver.getdriever().getWindowHandle();
       webUnivercityPage.loginPortalElement.click();
    }
    @Then("acilan ikinci windowa gecer")
    public void acilan_ikinci_windowa_gecer() {
        ReusableMethods.switchToWindowHandle(Driver.getdriever().getWindowHandles());
    }
    @Then("Username kutusuna deger yazdirir")
    public void username_kutusuna_deger_yazdirir() {
       webUnivercityPage.usernameBox.sendKeys("username");
    }
    @Then("Password kutusuna deger yazdirir")
    public void password_kutusuna_deger_yazdirir() {
       webUnivercityPage.passwordBox.sendKeys("password");
    }
    @Then("webunivercity login butonuna basar")
    public void webunivercity_login_butonuna_basar() {

     webUnivercityPage.loginButton.click();
    }
    @Then("Popup'ta cikan yazinin validation failed oldugunu test edin")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_edin() {
       String expected="validation failed";
       String actual=Driver.getdriever().switchTo().alert().getText();
        Assert.assertEquals(actual,expected);
    }
    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {
       Driver.getdriever().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri donun")
    public void ılk_sayfaya_geri_donun() {
        Driver.getdriever().switchTo().window(ilkHandle);
    }
    @Then("Ilk sayfaya donuldugunu test edin")
    public void ılk_sayfaya_donuldugunu_test_edin() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getdriever();
        jse.executeScript("arguments[0].scrollIntoView();",webUnivercityPage.loginPortalElement);
        Assert.assertTrue(webUnivercityPage.loginPortalElement.isDisplayed());
    }

    @And("tum sayfalari kapatir.")
    public void tumSayfalariKapatir() {
        Driver.quitDriver();
    }
}
