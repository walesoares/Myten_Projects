package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 10/01/2017.
 */
public class PurchasePage { WebDriver driver ;
    public PurchasePage (WebDriver driver) {this.driver = driver ;}

    By proceedtocheck = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span") ;
    By addresscheckout = By.xpath("//*[@id='center_column']/form/p/button") ;
    By agreementbutton = By.xpath("//*[@id='cgv']") ;
    By shippingcheckout = By.xpath("//*[@id='form']/p/button") ;
    By paymentmethod = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a") ;
    By confirmorder = By.xpath("//*[@id='cart_navigation']/button") ;
    By storeorder = By.xpath("//*[@id='center_column']/div") ;


    public void clickproceed () {driver.findElement(proceedtocheck).click();}
    public void clickaddresscheckout () {driver.findElement(addresscheckout).click();}
    public void clickaggreementbutton () {driver.findElement(agreementbutton).click();}
    public  void clickshippingcheckout () {driver.findElement(shippingcheckout).click();}
    public void clickpaymentmethod () {driver.findElement(paymentmethod).click();}
    public void clickconfirmorder() {driver.findElement(confirmorder).click();}
    public void confirmstoreorder () {
        Assert.assertTrue(driver.findElement(storeorder).isDisplayed());}


}
