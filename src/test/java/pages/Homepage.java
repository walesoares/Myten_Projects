package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 10/01/2017.
 */
public class Homepage {

    WebDriver driver ;
    public Homepage (WebDriver driver) {this.driver = driver ;}

    By SignIn  = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a") ;

    public void Click_SignIn    () {
        driver.findElement(SignIn).click();
    }


}
