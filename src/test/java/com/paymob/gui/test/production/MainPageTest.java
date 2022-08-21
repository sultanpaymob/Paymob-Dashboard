package com.paymob.gui.test.production;

import com.paymob.gui.pages.A1_LoginPage;
import com.paymob.gui.pages.D4_MainPage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainPageTest {
    private SHAFT.GUI.WebDriver driver;
    A1_LoginPage LoginPage_Obj;
    D4_MainPage MainPage_Obj;

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
//        driver.browser().navigateToURL("https://acceptstagingtest.paymobsolutions.com/portal2/en/login");
        driver.browser().navigateToURL("https://accept.paymob.com/portal2/en/login");
        LoginPage_Obj = new A1_LoginPage(driver);
        MainPage_Obj = new D4_MainPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.browser().closeCurrentWindow();
    }

    @Test(description = "Login Paymob Dashboard ", priority = 0)
    public void Login() {
        LoginPage_Obj.Paymob_Sign_In();
        // Validations
        driver.assertThat().element(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/form/fieldset/legend")).text().contains("Sign in").perform();
    }

    @Test(description = "Preview Main Page Functions")
    public void Preview_Main_Page_Functions() {
        MainPage_Obj.Preview_Main_Page_Functions();
    }
}
