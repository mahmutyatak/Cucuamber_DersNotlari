package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private Driver(){

    }
    //daha fazla kontrol imkanı ve extends kullnamdan driver a ulasmak icin
    //webdriver objesini Driver classındaki static bir method ile olusturacgız
    /*
    ancak get driver methodu her kullnaıldıgında yeni bir driver olusturuyor. bunu engellemek ve kodumuzun duzgun
    calismasını sağlamak icin ilk kulanımda driver=new chromeDriver calissin diger kullanımlrda
    calismasın diye bir yöntem gelistirmeliyiz.

     */

    private static WebDriver driver;


    public static WebDriver getdriever(){
        String istenenBrowser=ConfigReader.getProperty("browser");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        if (driver==null){
            switch (istenenBrowser){
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(ops);
            }
            driver.manage().window().maximize();
        }



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }

    }
    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }

    }
     /*
    ChromeOptions ops = new ChromeOptions();
ops.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver(ops);
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/mahmutyatak/Cucuamber_DersNotlari.git
git push -u origin main
     */
}
