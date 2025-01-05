package Pages;
import Commonfunctions.Driverhelp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver=null;

    public Homepage() {
        this.driver= Driverhelp.driver;
    }

    By acceptbutton=By.id("onetrust-accept-btn-handler");
    By signinbutton=By.xpath ("//span[text()='Sign in']");


    public void clickAccept() {
        driver.findElement(acceptbutton).click();
    }
    public void  clicksignin() {

        driver.findElement(signinbutton).click();

    }



}
