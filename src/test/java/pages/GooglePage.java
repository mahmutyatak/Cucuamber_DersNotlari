package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class GooglePage {
    public GooglePage(){

        PageFactory.initElements(Driver.getdriever(),this);
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mobile-promo/div/div/div/div[2]/g-flat-button")
    public WebElement cookie;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='DFlfde SwHCTb']")
    public WebElement paraKarsilastirma;
}
