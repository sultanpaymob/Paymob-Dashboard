package com.paymob.gui.tests;

import com.paymob.gui.pages.A1_LoginPage;
import com.paymob.gui.pages.B2_SignUpPage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest {
    private SHAFT.GUI.WebDriver driver;
    A1_LoginPage LoginPage_Obj;
    B2_SignUpPage SignUpPage_Obj;

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://acceptstagingtest.paymobsolutions.com/portal2/en/login");
        LoginPage_Obj = new A1_LoginPage(driver);
        SignUpPage_Obj = new B2_SignUpPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.browser().closeCurrentWindow();
    }

    @Test(description = "Login Paymob Dashboard ", priority = 0)
    public void Paymob_Sign_Up() {
        LoginPage_Obj.Paymob_Sign_Up();
        SignUpPage_Obj.create_Paymob_Account();

        // Validations
        //driver.assertThat().element(By.xpath("//p[@class='sub-title']")).text().contains("verification code was just sent").perform();
    }

}
