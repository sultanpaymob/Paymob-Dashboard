package com.paymob.gui.test.production;

import com.paymob.gui.pages.A1_LoginPage;
import com.paymob.gui.pages.D4_MainPage;
import com.paymob.gui.pages.E5_CreateProductPage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class D4_Create_Product_Test {
    private SHAFT.GUI.WebDriver driver;
    A1_LoginPage LoginPage_Obj;
    D4_MainPage MainPage_Obj;
    E5_CreateProductPage CreateProductPage_Obj;

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://accept.paymob.com/portal2/en/login");
        LoginPage_Obj = new A1_LoginPage(driver);
        MainPage_Obj = new D4_MainPage(driver);
        CreateProductPage_Obj = new E5_CreateProductPage(driver);
    }

    @AfterTest
    public void tearDown(){
        MainPage_Obj.Paymob_Log_out();
        driver.browser().closeCurrentWindow();
    }

    @Test(description = "Login Paymob Dashboard ", priority = 0)
    public void Login() {
        LoginPage_Obj.Paymob_Sign_In();
        driver.assertThat().element(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/form/fieldset/legend")).text().contains("Sign in").perform();
    }

    @Test(description = "Create Product using Online Card", priority =1)
    public void Create_Product_with_Online_Card() {
        String Page_Label = driver.element().getText(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/span/a"));
        System.out.println("Page Label is "+""+Page_Label);
        MainPage_Obj.Create_Product();
        CreateProductPage_Obj.Create_Product_using_Online_Card();
        MainPage_Obj.Back_to_Home();
    }
    @Test(description = "Create Product using Accept Kiosk", priority =2)
    public void Create_Product_with_Kiosk() {
        String Page_Label = driver.element().getText(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/span/a"));
        System.out.println("Page Label is "+""+Page_Label);
        MainPage_Obj.Create_Product();
        CreateProductPage_Obj.Create_Product_using_Kiosk();
        MainPage_Obj.Back_to_Home();
    }
}
