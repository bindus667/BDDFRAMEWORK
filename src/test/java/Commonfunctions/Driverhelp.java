package Commonfunctions;
import Pages.Homepage;
import Pages.Page2;
import Pages.Page3;
import Pages.Signinpage;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
public class Driverhelp {

    public static WebDriver driver;
    static Homepage objpage;
    static Signinpage lognpage;
    static Page2 nxtpage;
    static Page3 ad;

    public static void main(String[] args) throws IOException, InterruptedException {
        launchBrowser();
    }

    public static void getURL() {
        switch (GlobalVariables.ENV.toUpperCase()) {
            case "QA1":
                GlobalVariables.URL = "https://gmail.com";
                break;
            case "QA2":
                GlobalVariables.URL = "https://www-qa2.safeway.com";
                break;
            case "UAT":
                GlobalVariables.URL = "https://facebook.com";
                break;
            default:
                System.out.println("no such enviroment selected");
                break;
        }

    }

    public static void launchBrowser() throws IOException, InterruptedException {

        FileInputStream inputStream = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(inputStream);

        String browser = prop.getProperty("browsertype");
        GlobalVariables.ENV = prop.getProperty("environment");
        getURL();

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.get(GlobalVariables.URL);
        driver.manage().window().maximize();
        objpage = new Homepage();
        Thread.sleep(6000);
        objpage.clickAccept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);
        objpage.clicksignin();

        lognpage = new Signinpage();
        lognpage.logIn();
        Thread.sleep(2000);
        lognpage.setEmail();
        Thread.sleep(2000);
        lognpage.clickPwd();
        lognpage.setPwd();
        lognpage.signIncart();
        Thread.sleep(4000);

        nxtpage = new Page2();
        String loginverifymsg = nxtpage.loginverify();
        System.out.println(loginverifymsg);
        if (loginverifymsg.contains("Testing")) {
            System.out.println("login verified");
        }
        Thread.sleep(4000);
        nxtpage.clkButton2();
        /* nxtpage.clkButton3();
         Thread.sleep(2000);
         nxtpage.clkButton4();
         Thread.sleep(4000);
         nxtpage.searchItem();
         Thread.sleep(3000);
        // nxtpage.selectedinList();

        nxtpage.clkselectedItem();
         Thread.sleep(6000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String iteminfo=nxtpage.item();
        System.out.println(iteminfo);
        if(nxtpage.item().equalsIgnoreCase("iteminfo")){
            nxtpage.clkadd();
        }*/
        ad=new Page3();
        //ad.storeDetails();
        String printdetails= ad.addresspickup();
        System.out.println(printdetails);

    }

}













