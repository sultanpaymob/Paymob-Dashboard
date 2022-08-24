package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import net.andreinc.mockneat.MockNeat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    String Full_Name;
    String Phone_Number;
    String Email;
    String MID;
    String Expiry_Hours;
    String Order_Name;
    String Order_Desc;
    String Order_Amount;



    public F6_CreateInvoicePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

//    public void Create_Invoice(){
//        driver.element().type(G_Full_Name, Get_User_Name());
//        driver.element().type(G_Phone_Number, Get_Phone_Number());
//        driver.element().type(G_Email, Get_Email());
//        driver.element().type(G_MID, Get_MID());
//        driver.element().type(G_Expiry_Hours, Get_Expiry_Hours());
//        driver.element().type(O_Order_Name, Get_Order_Name());
//        driver.element().type(O_Order_Desc, Get_Order_Desc());
//        driver.element().type(O_Order_Amount, Get_Order_Amount());
//
//        driver.element().click(O_Order_Currency);
//        Select Currency = new Select(driver.getDriver().findElement(O_Order_Currency));
//        Currency.selectByIndex(1);
//
//        String Selected_Currency = driver.element().getText(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div/div/div/div[2]/div/form/div[1]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/select/option[2]"));
//        System.out.println("Currency is " + Selected_Currency);
//        driver.element().doubleClick(Create_Invoice_Btn);
//    }

    public void Create_Online_Invoice(){
        driver.element().type(G_Full_Name, Get_User_Name());
        driver.element().type(G_Phone_Number, Get_Phone_Number());
        driver.element().type(G_Email, Get_Email());
        driver.element().type(G_MID, Get_MID());
        driver.element().type(G_Expiry_Hours, Get_Expiry_Hours());
        driver.element().type(O_Order_Name, Get_Order_Name());
        driver.element().type(O_Order_Desc, Get_Order_Desc());
        driver.element().type(O_Order_Amount, Get_Order_Amount());

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

        driver.element().doubleClick(Create_Invoice_Btn);
    }


    public void Create_Kiosk_Invoice(){
        driver.element().type(G_Full_Name, Get_User_Name());
        driver.element().type(G_Phone_Number, Get_Phone_Number());
        driver.element().type(G_Email, Get_Email());
        driver.element().type(G_MID, Get_MID());
        driver.element().type(G_Expiry_Hours, Get_Expiry_Hours());
        driver.element().type(O_Order_Name, Get_Order_Name());
        driver.element().type(O_Order_Desc, Get_Order_Desc());
        driver.element().type(O_Order_Amount, Get_Order_Amount());

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

        driver.element().doubleClick(Create_Invoice_Btn);
    }
    public String Get_User_Name() {
        Full_Name = RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10);
        return Full_Name;
    }
    public String Get_Phone_Number() {
        Phone_Number = RandomStringUtils.randomNumeric(11);
        return Phone_Number;
    }
    public String Get_Email() {
        MockNeat mock =  MockNeat.threadLocal();
        return Email = mock.emails().domain("paymob.com").val();
    }
    public String Get_MID() {
        MID = RandomStringUtils.randomNumeric(4);
        return MID;
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
        Order_Desc = RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10);
        return Order_Desc;
    }
    public String Get_Order_Amount() {
        Order_Amount = RandomStringUtils.randomNumeric(4);
        return Order_Amount;
    }
}
