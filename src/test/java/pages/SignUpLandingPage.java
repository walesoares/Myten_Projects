package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * Created by Wale on 10/01/2017.
 */
public class SignUpLandingPage {

    WebDriver driver ;
    public SignUpLandingPage (WebDriver driver) {this.driver = driver ;}

    By logout = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By registrationname = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span") ;



    public void GotoClientName () {
        Assert.assertTrue(driver.findElement(registrationname).getAttribute("span").contains("Bill Gate") );}

    public void Click_logout (){driver.findElement(logout).click();}

    public void GotoLogout (){Assert.assertTrue(driver.findElement(logout).isDisplayed());}







}
