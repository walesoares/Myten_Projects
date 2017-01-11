package testcase;

import base.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Wale on 10/01/2017.
 */
public class TestRun extends Driver {

    @Test (priority = 0)
    public void HomeStart() {

        Homepage HP = new Homepage(driver);
        HP.Click_SignIn();
    }

   @Test(priority = 1)

    public void NewUser() {
        HomeLandingPage HoLP = new HomeLandingPage(driver);

        HoLP.Enter_email();
        HoLP.Click_create();

        SignUpPage SP = new SignUpPage(driver);

        SP.clicktitle();
        SP.enterfirstname();
        SP.enterlastname();
        SP.enterpw();
        SP.enterday();
        SP.entermonth();
        SP.enteryear();
        SP.enteraddress();
        SP.entercity();
        SP.selectstate();
        SP.enterpostcode();
        SP.entermobile();
        SP.clearalias();
        SP.enteralias();
        SP.clickregister();
    }

    @Test(priority = 2)
    public void ConfirmNewUser() {

        SignUpLandingPage SLP = new SignUpLandingPage(driver);

        SLP.GotoLogout();
        SLP.GotoClientName();
        SLP.Click_logout();
    }

    @Test(priority = 3)
    public void LoginUnsuccessfully() {

        HomeLandingPage HLP = new HomeLandingPage(driver);

        HLP.Enterusername();
        HLP.Enterwrongpw();
        HLP.ClickLogin();
        HLP.GotoErrorMsg();
    }

    @Test(priority = 4)
    public void LoginSuccessfully() {
        HomeLandingPage HomeLP = new HomeLandingPage(driver);

        HomeLP.ClearPW();
        HomeLP.Enterrightpw();
        HomeLP.ClickLogin();
        HomeLP.ClickShirts();
    }

    @Test(priority = 5)
    public void AddItem() {

        ShirtPages SHP = new ShirtPages(driver);

        SHP.MoveAddtoCart();
        SHP.Alert();
       SHP.clickproceedheckout();
        SHP.confirmcartitem();
    }

    @Test(priority = 6)
    public void PurchaseItem() {

        PurchasePage PP = new PurchasePage(driver);
        PP.clickproceed();
        PP.clickaddresscheckout();
        PP.clickaggreementbutton();
        PP.clickshippingcheckout();
        PP.clickpaymentmethod();
        PP.clickconfirmorder();
        PP.confirmstoreorder();
    }

}




