package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class B2_MainPage {

    public By Paymob_Logo = By.xpath("//img[@alt='Accept Logo' and @class='navbar-brand-minimized']");
    public By Create_Btn = By.xpath("//span[normalize-space()='Create']");
    public By Create_Invoice_Btn = By.xpath("//img[@src='/portal2/static/media/Bill.8e80cae4.svg']");
    public By Create_Product_Btn = By.xpath("//img[@src='/portal2/static/media/Product.dcbaf80a.svg']");
    public By View_All_Btn = By.xpath("//a[@class='blockLink']");
    public By Home_Btn = By.cssSelector(".nav-link.active[href='/portal2/en/home']");
    public By Payments_Btn = By.xpath("//a[normalize-space()='Payments']");

    private SHAFT.GUI.WebDriver driver;

    public B2_MainPage (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void select_Payment_Btn() {
        driver.element().click(Payments_Btn);
    }
}
