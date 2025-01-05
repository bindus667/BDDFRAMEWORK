package Pages;
import Commonfunctions.Driverhelp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page3 {
    WebDriver driver=null;
    //public String details;
    public String pickupdetails;

    public Page3(){
        this.driver= Driverhelp.driver;
    }
    // By mainelement=By.xpath("//*[@id='fulfilmentPickup']");
    //By addressdetails=By.xpath("//*[@id='addressOf_3132']");
    By pickupbutton=By.xpath("//*[@id='fulfilmentPickup']");

    //List<WebElement>totalelements;
    /*public void storeDetails() {
        driver.findElement(mainelement);
    }*/
    public String addresspickup(){

        //for (int i=1;i< totalelements.size();i++){
        //details=driver.findElement(addressdetails).getText();
        pickupdetails=driver.findElement(pickupbutton).getText();
        System.out.println(pickupdetails );
        //System.out.println(elementinfo);

        return pickupdetails;

    }



}
