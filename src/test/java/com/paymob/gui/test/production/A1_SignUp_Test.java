package com.paymob.gui.test.production;

import com.paymob.gui.pages.A1_LoginPage;
import com.paymob.gui.pages.B2_SignUpPage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A1_SignUp_Test {
    private SHAFT.GUI.WebDriver driver;
    A1_LoginPage LoginPage_Obj;
    B2_SignUpPage SignUpPage_Obj;

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://accept.paymob.com/portal2/en/login");
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
       String pageLabel =  driver.element().getText(By.xpath("//p[@class='sub-title']"));
       System.out.println("Page Label is " +"" +pageLabel);
       driver.assertThat().element(By.xpath("//p[@class='sub-title']")).text().contains("Paymob account").perform();
    }

}
