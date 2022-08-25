package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class F6_CreateInvoicePage {

    public By G_Full_Name = By.xpath("//input[@placeholder='Enter Your Name']");
    public By G_Phone_Number = By.xpath("//input[@placeholder='Enter Your Phone']");
    public By G_Email = By.xpath("//input[@placeholder='Enter Your Email']");
    public By G_MID = By.xpath("//input[@placeholder='ِEnter Your Id']");
    public By G_Expiry_Hours = By.xpath("//input[@placeholder='Enter Expiry Hours']");

    public By O_Order_Name = By.xpath("//input[@placeholder='Enter Your Order']");
    public By O_Order_Desc = By.xpath("//textarea[@name='orderDescription']");
    public By O_Order_Amount = By.xpath("//input[@name='orderAmount']");
    public By O_Order_Currency = By.xpath("//select[@name='currency']");

    public By O_Online_Card = By.xpath("//body//div[@id='root']//div[@class='row']//div[@class='row']//div[@class='row']//div[2]//div[1]//label[1]//span[1]");
    public By O_Select_Online_Card_List = By.xpath("//select[@name='integrationId-VPC']");

    public By O_Accept_Kiosk = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]");
    public By O_Accept_Kiosk_List = By.xpath("//select[@name='integrationId-CAGG']");

    public By Create_Invoice_Btn = By.xpath("//button[@class='primaryBtn iconeBtn' and @id='create_invoice']");

    private SHAFT.GUI.WebDriver driver;

    public F6_CreateInvoicePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void Create_Online_Invoice(){
        driver.element().type(G_Full_Name, ZZ_MethodsGenerator.Get_Name());
        driver.element().type(G_Phone_Number, ZZ_MethodsGenerator.Get_Phone_Number());
        driver.element().type(G_Email, ZZ_MethodsGenerator.Get_Email());
        driver.element().type(G_MID, ZZ_MethodsGenerator.Get_Merchant_ID());
        driver.element().type(G_Expiry_Hours, ZZ_MethodsGenerator.Get_Expiry_Hours());
        driver.element().type(O_Order_Name, ZZ_MethodsGenerator.Get_Order_Name());
        driver.element().type(O_Order_Desc, ZZ_MethodsGenerator.Get_Description());
        driver.element().type(O_Order_Amount, ZZ_MethodsGenerator.Get_Price_or_Amount());

        driver.element().click(O_Order_Currency);
        Select Currency = new Select(driver.getDriver().findElement(O_Order_Currency));
        Currency.selectByIndex(1);
        String Selected_Currency = driver.element().getText(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div/div/div/div[2]/div/form/div[1]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/select/option[2]"));
        System.out.println("Currency is " + Selected_Currency);

        driver.element().click(O_Online_Card);
        driver.element().click(O_Select_Online_Card_List);
        Select OnlineCard = new Select(driver.getDriver().findElement(O_Select_Online_Card_List));
        OnlineCard.selectByIndex(1);

        String Selected_Online_Card = driver.element().getText(By.xpath("//select[@name='integrationId-VPC']"));
        System.out.println("Selected Card is " + Selected_Online_Card);

        driver.element().click(Create_Invoice_Btn);
    }


    public void Create_Kiosk_Invoice(){
        driver.element().type(G_Full_Name, ZZ_MethodsGenerator.Get_Name());
        driver.element().type(G_Phone_Number, ZZ_MethodsGenerator.Get_Phone_Number());
        driver.element().type(G_Email, ZZ_MethodsGenerator.Get_Email());
        driver.element().type(G_MID, ZZ_MethodsGenerator.Get_Merchant_ID());
        driver.element().type(G_Expiry_Hours, ZZ_MethodsGenerator.Get_Expiry_Hours());
        driver.element().type(O_Order_Name, ZZ_MethodsGenerator.Get_Order_Name());
        driver.element().type(O_Order_Desc, ZZ_MethodsGenerator.Get_Description());
        driver.element().type(O_Order_Amount, ZZ_MethodsGenerator.Get_Price_or_Amount());

        driver.element().click(O_Order_Currency);
        Select Currency = new Select(driver.getDriver().findElement(O_Order_Currency));
        Currency.selectByIndex(1);
        String Selected_Currency = driver.element().getText(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div/div/div/div[2]/div/form/div[1]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/select/option[2]"));
        System.out.println("Currency is " + Selected_Currency);

        driver.element().click(O_Accept_Kiosk);
        driver.element().click(O_Accept_Kiosk_List);
        Select OnlineCard = new Select(driver.getDriver().findElement(O_Accept_Kiosk_List));
        OnlineCard.selectByIndex(1);

        String Selected_Online_Card = driver.element().getText(By.xpath("//select[@name='integrationId-CAGG']"));
        System.out.println("Selected Card is " + Selected_Online_Card);

        driver.element().click(Create_Invoice_Btn);
    }

}
