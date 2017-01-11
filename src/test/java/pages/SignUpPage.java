package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Wale on 10/01/2017.
 */
public class SignUpPage {


    WebDriver driver ;
    public SignUpPage (WebDriver driver) {this.driver = driver ;}

    By title  = By.cssSelector("#id_gender1") ;
    By Firstname = By.id("customer_firstname") ;
    By Lastname = By.xpath("//*[@id='customer_lastname']") ;
    By Email = By.xpath( "//*[@id='email'] ") ;
    By PW = By.xpath( "//*[@id='passwd']") ;
    By day = By.id("days") ;
    By month = By.xpath(" //*[@id='months'] ") ;
    By years = By.xpath( "//*[@id='years']")  ;
    By address = By.xpath("//*[@id='address1']") ;
    By city = By.xpath("//*[@id='city']") ;
    By state = By.name("id_state") ;
    By postcode = By.xpath(" //*[@id='postcode']") ;
    By country = By.xpath("//*[@id='id_country']") ;
    By mobilephone = By.cssSelector("#phone_mobile") ;
    By alias = By.xpath(" //*[@id='alias']") ;
    By register = By.xpath("//*[@id='submitAccount']") ;

    public void clicktitle () {driver.findElement(title).click();}
    public void enterfirstname() {driver.findElement(Firstname).sendKeys("Bill");}
    public void enterlastname () {driver.findElement(Lastname).sendKeys("Gate");}
    public void enterpw () {driver.findElement(PW).sendKeys("12345");}
    public void enterday () {Select select = new Select(driver.findElement(day)) ;
        select.selectByIndex(1);}
    public void entermonth () {Select select = new Select(driver.findElement(month)) ;
        select.selectByIndex(2);}
    public void enteryear () {Select select = new Select(driver.findElement(years)) ;
        select.selectByIndex(44);}
    public void enteraddress () {driver.findElement(address).sendKeys("78 billings gate");}
    public void entercity () {driver.findElement(city).sendKeys("London");}
    public void selectstate () {Select select = new Select(driver.findElement(state)) ;
        select.selectByIndex(10); }
    public void enterpostcode () {driver.findElement(postcode).sendKeys("00000");}
    public  void entermobile () {driver.findElement(mobilephone).sendKeys("070000155");}
    public void clearalias () {driver.findElement(alias).clear();}
    public void enteralias () {driver.findElement(alias).sendKeys("bondstreet");}
    public void clickregister () {driver.findElement(register).click();}
}
