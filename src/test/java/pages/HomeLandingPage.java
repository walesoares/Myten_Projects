package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 10/01/2017.
 */
public class HomeLandingPage {

    WebDriver driver ;
    public HomeLandingPage (WebDriver driver) {this.driver = driver ;}

    By emailaddress = By.id("email_create") ;
    By Createaccount = By.name("SubmitCreate") ;

    By username = By.xpath("//*[@id='email']") ;
    By password = By.xpath("//*[@id='passwd']") ;
    By Login = By.xpath(" //*[@id='SubmitLogin'] ") ;
    By Loginerror = By.xpath("//*[@id='center_column']/div[1]/ol/li") ;
    By Shirt = By.xpath( "//*[@id='block_top_menu']/ul/li[3]/a") ;


    public void Enter_email (){
        driver.findElement(emailaddress).sendKeys("walesoares@gmail.com");
    } ;

    public void Click_create (){driver.findElement(Createaccount).click();};

    public void Enterusername () {driver.findElement(username).sendKeys("walesoares@gmail.com");}
    public void Enterwrongpw () {driver.findElement(password).sendKeys("london");}
    public void ClickLogin () {driver.findElement(Login).click();}
    public  void GotoErrorMsg () {
        Assert.assertTrue(driver.findElement(Loginerror).isDisplayed());}
    public void ClearPW (){driver.findElement(password).clear();}
    public void Enterrightpw () {driver.findElement(password).sendKeys("12345");}

    public void ClickShirts () {driver.findElement(Shirt).click();}
}
