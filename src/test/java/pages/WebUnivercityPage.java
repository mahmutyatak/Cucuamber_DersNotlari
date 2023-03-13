package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class WebUnivercityPage {
    public WebUnivercityPage(){
        PageFactory.initElements(Driver.getdriever(),this);
    }
    @FindBy (id = "login-portal")
    public WebElement loginPortalElement;

    @FindBy (xpath = "//*[@id='text']")
    public WebElement usernameBox;
    @FindBy (xpath = "//*[@id='password']")
    public WebElement passwordBox;
    @FindBy (xpath = "//*[@id='login-button']")
    public WebElement loginButton;
}
