package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class DemoqaPage {

    public DemoqaPage(){
        PageFactory.initElements(Driver.getdriever(),this);
    }
    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertTusu;
    @FindBy(id = "timerAlertButton")
    public WebElement ikinciClick;
}
