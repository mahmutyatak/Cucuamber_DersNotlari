package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class HerokupPage {
    public HerokupPage(){
        PageFactory.initElements(Driver.getdriever(),this);
    }
    @FindBy(xpath = "//button[text()='Add Element']")
    public WebElement addElementButonu;
    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement delteButonu;
}
