package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import net.andreinc.mockneat.MockNeat;

public class F6_CreateInvoicePage {

    public By G_Full_Name = By.xpath("//input[@placeholder='Enter Your Name']");
    public By G_Phone_Number = By.xpath("//input[@placeholder='Enter Your Phone']");
    public By G_Email = By.xpath("//input[@placeholder='Enter Your Email']");
    public By G_MID = By.xpath("//input[@placeholder='ِEnter Your Id']");
    public By G_Expiry_Hours = By.xpath("//input[@placeholder='Enter Expiry Hours']");

    public By O_Order_Name = By.xpath("//input[@placeholder='Enter Your Order']");
    public By O_Order_Desc = By.xpath("//input[@placeholder='Enter product price']");
    public By O_Order_Amount = By.xpath("//input[@placeholder='Enter Your Amount In Chosen Currency']");
    public By O_Order_Currency = By.xpath("//select[@name='currency']");
    public By O_Online_Card = By.xpath("//div[@class='invoiceFormSelectDiv']//span[@class='switch-slider']");
    public By O_Select_Online_Card_List = By.xpath("//select[@name='integrationId-VPC']");

    public By Create_Invoice_Btn = By.id("create_invoice");

    private SHAFT.GUI.WebDriver driver;
    String Full_Name;
    String Phone_Number;
    String Email;
    String Expiry_Hours;
    String Order_Name;
    String Order_Desc;



    public F6_CreateInvoicePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void Create_Invoice(){
        driver.element().type(G_Full_Name, Get_User_Name());
        driver.element().type(G_Phone_Number, Get_Phone_Number());
        driver.element().type(G_Email, Get_Email());
        driver.element().type(G_MID, "4163");
        driver.element().type(G_Expiry_Hours, Get_Expiry_Hours());
        driver.element().type(O_Order_Name, Get_Order_Name());
        driver.element().type(O_Order_Desc, Get_Order_Desc());
        driver.element().type(O_Order_Amount, "50");
        driver.element().click(O_Order_Currency);
        driver.element().click(Create_Invoice_Btn);
    }

    public String Get_User_Name() {
        Full_Name = RandomStringUtils.randomAlphabetic(10);
        return Full_Name;
    }
    public String Get_Phone_Number() {
        Phone_Number = RandomStringUtils.randomNumeric(11);
        return Phone_Number;
    }
    public String Get_Email() {
        MockNeat mock =  MockNeat.threadLocal();
        return Email = mock.emails().domain("startup.io").val();
    }
    public String Get_Expiry_Hours() {
        Expiry_Hours = RandomStringUtils.randomNumeric(2);
        return Expiry_Hours;
    }
    public String Get_Order_Name() {
        Order_Name = RandomStringUtils.randomAlphabetic(10);
        return Order_Name;
    }
    public String Get_Order_Desc() {
        Order_Desc = RandomStringUtils.randomAlphabetic(10);
        return Order_Desc;
    }

}
