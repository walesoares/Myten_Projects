package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

/**
 * Created by Wale on 10/01/2017.
 */
public class ShirtPages {

    WebDriver driver ;

    public ShirtPages (WebDriver driver) {this.driver = driver ;}
    Actions action = new Actions(driver) ;


    WebElement Displayedshirt = driver.findElement(By.xpath ( "//*[@id='center_column']/ul/li/div/div[2]")) ;

    By addtocart = (By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span") );

    By cartmessage = By.xpath("//*[@id='cart_title']") ;
    By proceedcheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span") ;



    public void MoveAddtoCart ()   {

                action.moveToElement(Displayedshirt).build().perform();
                driver.findElement(addtocart).click();

                }


    public void Alert () {driver.switchTo().alert().accept();}

        public void clickproceedheckout () {driver.findElement(proceedcheckout).click();}

    public void confirmcartitem (){
        Assert.assertTrue(driver.findElement(cartmessage).isDisplayed());}


}


