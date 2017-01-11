package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Wale on 10/01/2017.
 */
public class Driver {


    public static WebDriver driver = new FirefoxDriver() ;

    @BeforeTest
    public void Setup () {

        driver.get ("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
