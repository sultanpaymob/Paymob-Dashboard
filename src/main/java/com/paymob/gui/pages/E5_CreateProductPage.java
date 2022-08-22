package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

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
    public By Create_Product = By.xpath("//button[@id='create_product']");

    private SHAFT.GUI.WebDriver driver;

    public E5_CreateProductPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public void Create_Product(){


    }
//             List<WebElement> Currency = driver.findElements(Product_Currency);
//            Currency.get(1).click();
}
