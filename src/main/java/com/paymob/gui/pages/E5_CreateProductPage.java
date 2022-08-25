package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class E5_CreateProductPage {

    public By Product_Name = By.xpath("//input[@placeholder='Like Nike Shoes,Addidas T-shirt']");
    public By Product_Description = By.xpath("//textarea[@name='product_description']");
    public By Product_Quantity = By.xpath("//input[@placeholder='Number of products in stock']");
    public By Product_MID = By.xpath("//input[@placeholder='Enter merchant product ID']");
    public By Allow_Quantity_Change_CBox = By.xpath("//div[normalize-space()='Allow Quantity Change']//span[@data-checked='On']");
    public By Needs_Delivery_CBox = By.xpath("//div[normalize-space()='Needs Delivery']//span[@data-checked='On']");
    public By Product_Price = By.xpath("//input[@placeholder='Enter product price']");
    public By Product_Currency = By.xpath("//select[@name='currency']");
    public By Product_Image = By.xpath("//div[@class='prompter-button-holder no-user-select']");

    public By Online_Card = By.xpath("//body//div[@id='root']//div[@class='row']//div[@class='row']//div[@class='row']//div[@class='row']//div[2]//div[1]//label[1]//span[1]");
    public By Select_Online_Card_List = By.xpath("//select[@name='integrationId-VPC']");

    public By Accept_Kiosk = By.xpath("//main[@class='main']//div[3]//div[1]//label[1]//span[1]");
    public By Accept_Kiosk_List = By.xpath("//select[@name='integrationId-CAGG']");


    public By Create_Product = By.xpath("//button[@id='create_product']");

    private SHAFT.GUI.WebDriver driver;

    public E5_CreateProductPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void Create_Product_using_Online_Card(){
        driver.element().type(Product_Name, ZZ_MethodsGenerator.Get_Name());
        driver.element().type(Product_Description, ZZ_MethodsGenerator.Get_Description());

        driver.element().type(Product_Quantity, ZZ_MethodsGenerator.Get_Price_or_Amount());
        driver.element().type(Product_MID, ZZ_MethodsGenerator.Get_Merchant_ID());

        driver.element().type(Product_Price, ZZ_MethodsGenerator.Get_Price_or_Amount());

        driver.element().click(Product_Currency);
        Select Currency = new Select(driver.getDriver().findElement(Product_Currency));
        Currency.selectByIndex(1);
        String Selected_Currency = driver.element().getText(By.xpath("//select[@name='currency']"));
        System.out.println("Currency is " + Selected_Currency);

        driver.element().click(Online_Card);
        driver.element().click(Select_Online_Card_List);
        Select OnlineCard = new Select(driver.getDriver().findElement(Select_Online_Card_List));
        OnlineCard.selectByIndex(1);

        String Selected_Online_Card = driver.element().getText(By.xpath("//select[@name='integrationId-VPC']"));
        System.out.println("Selected Card is " + Selected_Online_Card);

        driver.element().click(Create_Product);
    }
    public void Create_Product_using_Kiosk(){
        driver.element().type(Product_Name, ZZ_MethodsGenerator.Get_Name());
        driver.element().type(Product_Description, ZZ_MethodsGenerator.Get_Description());

        driver.element().type(Product_Quantity, ZZ_MethodsGenerator.Get_Price_or_Amount());
        driver.element().type(Product_MID, ZZ_MethodsGenerator.Get_Merchant_ID());

        driver.element().type(Product_Price, ZZ_MethodsGenerator.Get_Price_or_Amount());

        driver.element().click(Product_Currency);
        Select Currency = new Select(driver.getDriver().findElement(Product_Currency));
        Currency.selectByIndex(1);
        String Selected_Currency = driver.element().getText(By.xpath("//select[@name='currency']"));
        System.out.println("Currency is " + Selected_Currency);

        driver.element().click(Accept_Kiosk);
        driver.element().click(Accept_Kiosk_List);
        Select OnlineCard = new Select(driver.getDriver().findElement(Accept_Kiosk_List));
        OnlineCard.selectByIndex(1);

        String Selected_Online_Card = driver.element().getText(By.xpath("//select[@name='integrationId-CAGG']"));
        System.out.println("Selected Card is " + Selected_Online_Card);

        driver.element().click(Create_Product);
    }

}
