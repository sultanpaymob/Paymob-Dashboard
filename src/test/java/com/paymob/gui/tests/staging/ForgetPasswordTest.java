package com.paymob.gui.tests.staging;

import com.paymob.gui.pages.A1_LoginPage;
import com.paymob.gui.pages.C3_ForgetPasswordPage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgetPasswordTest {
    private SHAFT.GUI.WebDriver driver;
    A1_LoginPage LoginPage_Obj;
    C3_ForgetPasswordPage ForgetPasswordPage_Obj;

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://acceptstagingtest.paymobsolutions.com/portal2/en/login");
        LoginPage_Obj = new A1_LoginPage(driver);
        ForgetPasswordPage_Obj = new C3_ForgetPasswordPage(driver);}

    @AfterTest
    public void tearDown(){
        driver.browser().closeCurrentWindow();
    }

    @Test(description = "Navigate Paymob Dashboard and Select Forget Password", priority = 0)
    public void Select_Forget_Password() {
        LoginPage_Obj.Paymob_Forget_Password();}

    @Test(description = "Request OTP Password ", priority = 1)
    public void Request_OTP_Password(){
        ForgetPasswordPage_Obj.create_New_Password();
        // Validations
        String pageLabel =  driver.element().getText(By.xpath("//p[@class='sub-title']"));
        System.out.println("Page Label is " +"" +pageLabel);
        driver.assertThat().element(By.xpath("//p[@class='sub-title']")).text().contains("Paymob account").perform();}
}
