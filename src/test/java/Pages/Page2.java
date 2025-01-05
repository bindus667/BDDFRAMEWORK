package Pages;
import Commonfunctions.Driverhelp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Page2 {
    WebDriver driver=null;
    public String element;
    //public  String elementtxt;

    public Page2(){
        this.driver= Driverhelp.driver;
    }
    By loginverifybutton=By.xpath("//span[text()='Testing']");
    By pickuplinkbutton=By.xpath("(//div[@id='openFulfillmentModalButton'])[1]");
    //By button3=By.id("modal-tab-pickup-btn");
    //By button4=By.cssSelector("#closeFulfillmentModalButton > svg > path");
    //By searchbutton=By.xpath("//input[@name='q']");
    //By selecteditem=By.xpath("//i[@data-qa='hdr_srchcn']");
    //By addbutton=By.xpath("//a[@id='pg970385539']");
    //By addtocart=By.xpath("//button[@id='inc_qtyInfo_970385539']");
    //By viewitem=By.xpath("//span[@data-qa='hdr-crt-icn']");


    public String loginverify(){
        element=driver.findElement(loginverifybutton).getText();
        return element;
    }
    public void clkButton2(){
        driver.findElement(pickuplinkbutton).click();
    }
   /* public void clkButton3(){
        driver.findElement(button3).click();
    }
    public void clkButton4(){
        driver.findElement(button4).click();
    }
    public void searchItem(){
        driver.findElement(searchbutton).sendKeys("milk");
    }

    public void clkselectedItem(){
        driver.findElement(selecteditem).click();
    }
    public String item(){
        String elementtxt=driver.findElement(addbutton).getText();

        return elementtxt;
    }
    public void clkadd(){
        driver.findElement(addtocart).click();
    }
    public void clkviewitem(){
        driver.findElement(viewitem).click();
    }
*/



}
