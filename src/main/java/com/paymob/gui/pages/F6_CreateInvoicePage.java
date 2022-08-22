package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Currency;
import java.util.List;

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
    public void Create_Product(){
        driver.element().type(G_Full_Name, Full_Name);

    }

    public String Get_User_Name() {
        Full_Name = RandomStringUtils.randomAlphabetic(10);
        return Full_Name;
    }
}
