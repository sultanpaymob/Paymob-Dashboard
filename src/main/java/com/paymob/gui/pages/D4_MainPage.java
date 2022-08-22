package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class D4_MainPage {

    public By Paymob_Logo = By.xpath("//img[@alt='Accept Logo' and @class='navbar-brand-minimized']");
    public By Create_Btn = By.xpath("/html[1]/body[1]/div[1]/div[2]/header[1]/ul[1]/li[1]/a[1]/i[1]");
    public By Create_Invoice_Btn = By.xpath("//img[@src='/portal2/static/media/Bill.8e80cae4.svg']");
    public By Create_Product_Btn = By.xpath("//img[@src='/portal2/static/media/Product.dcbaf80a.svg']");
    public By View_All_Btn = By.xpath("//a[@class='blockLink']");
    public By Home_Btn = By.xpath("//a[normalize-space()='Home']");
    public By Payments_Btn = By.xpath("//a[normalize-space()='Payments']");
    public By Transactions_Payments_Btn = By.xpath("//a[normalize-space()='Transactions']");
    public By Orders_Payments_Btn = By.xpath("//a[normalize-space()='Orders']");
    public By Transfers_Btn = By.xpath("//a[normalize-space()='Transfers']");
    public By Payment_Links_Btn = By.xpath("//a[normalize-space()='Payment Links']");
    public By Payment_L_Products_Btn = By.xpath("//a[normalize-space()='Products']");
    public By Payment_L_Invoices_Btn = By.xpath("//a[normalize-space()='Invoices']");
    public By Reports_Btn = By.xpath("//a[normalize-space()='Reports']");
    public By Users_Btn = By.xpath("//a[normalize-space()='Users']");
    public By Developers_Btn = By.xpath("//a[normalize-space()='Developers']");
    public By Dev_Payment_Int_Btn = By.xpath("//a[normalize-space()='Payment Integrations']");
    public By Dev_Iframes_Btn = By.xpath("//a[normalize-space()='Iframes']");
    public By Dev_Documentation_Btn = By.xpath("//a[@class='documentationUrl nav-link active']");
    public By Terminal_Management_Btn = By.xpath("//a[normalize-space()='Terminal Management']");
    public By Terminal_Dev_POS_Btn = By.xpath("//a[normalize-space()='Devices (POS)']");
    public By Terminal_Branches_Btn = By.xpath("//a[normalize-space()='Branches']");


    //Account Area
    public By Account_Settings_Btn = By.xpath("//i[@class='fa fa-angle-down']");
    public By Edit_Profile_Btn = By.xpath("//button[normalize-space()='Edit Profile']");
    public By Log_out_Btn = By.xpath("//button[normalize-space()='Log Out']");

    private SHAFT.GUI.WebDriver driver;

    public D4_MainPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void Paymob_Log_out(){
        driver.element().click(Account_Settings_Btn);
        driver.element().click(Log_out_Btn);
    }
    public void Preview_Main_Page_Functions() {
        driver.element().click(Home_Btn);
        driver.element().click(Payments_Btn);
        driver.element().click(Transactions_Payments_Btn);
        driver.element().click(Orders_Payments_Btn);
        driver.element().click(Transfers_Btn);
        driver.element().click(Payment_Links_Btn);
        driver.element().click(Payment_L_Products_Btn);
        driver.element().click(Payment_L_Invoices_Btn);
        driver.element().click(Reports_Btn);
        driver.element().click(Users_Btn);
        driver.element().click(Developers_Btn);
        driver.element().click(Dev_Payment_Int_Btn);
        driver.element().click(Dev_Iframes_Btn);
        driver.element().click(Terminal_Management_Btn);
        driver.element().click(Terminal_Dev_POS_Btn);
        driver.element().click(Terminal_Branches_Btn);
    }
    public void Create_Invoice(){
        driver.element().click(Create_Btn);
        driver.element().click(Create_Invoice_Btn);
    }
    public void Create_Product(){
        driver.element().click(Create_Btn);
        driver.element().click(Create_Product_Btn);
    }
}
