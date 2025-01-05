package Pages;

import Commonfunctions.Driverhelp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signinpage {

        WebDriver driver=null;
        public Signinpage(){
            this.driver= Driverhelp.driver;

        }
        By loginbutton=By.xpath("//*[@id=\"signin-dropdown\"]/div/div/div/div[1]/button");
        By mailid=By.id("enterUsername");
        By getLoginbutton=By.xpath("//button[contains(text(),'Sign in with Google')]");

        By passwordbutton=By.xpath("//*[@id=\"modal-authenticate\"]/div/div/div[2]/div/div/sign-in/enter-username/form/div[2]/button[2]\n" +
                "\n ");
        By enterpwd=By.id("password");
        By clklogin=By.xpath("//button[@type='submit']");


        public void logIn(){
            driver.findElement(loginbutton).click();
        }
        public void setEmail(){
            driver.findElement(mailid).sendKeys("testuserqa1safeway@yopmail.com");
        }
        public void signwithGoogle(){
            driver.findElement(getLoginbutton).click();
        }



        public void clickPwd(){
            driver.findElement(passwordbutton).click();
        }
        public void setPwd(){
            driver.findElement(enterpwd).sendKeys("Password@123");
        }
        public void signIncart(){
            driver.findElement(clklogin).click();
        }
    }


