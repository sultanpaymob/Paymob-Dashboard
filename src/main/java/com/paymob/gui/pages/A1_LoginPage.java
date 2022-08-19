package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class A1_LoginPage {

    public By UserName = By.id("user-name");
    public By Password = By.id("password");
    public By Sign_In_Btn = By.xpath("//button[@class='primaryBtn' and @type='submit']");
    public By Forget_Password_Btn = By.xpath("//a[@class='forgetPWLink']");
    public By Sign_Up_Btn = By.xpath(" //a[normalize-space()='Sign Up']");
    public By Paymob_Logo = By.xpath("//img[@alt='Paymob logo consists of paymob word']");

    private SHAFT.GUI.WebDriver driver;

    public A1_LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void Paymob_Sign_In() {
        driver.element().type(UserName, "Ehabnaga");
        driver.element().type(Password, "Ehab@1212");
        driver.element().click(Sign_In_Btn);
    }
    public void Paymob_Forget_Password(){
        driver.element().click(Forget_Password_Btn);
        driver.element().type(UserName, "01008884767");

    }
    public void Paymob_Sign_Up(){
        driver.element().click(Sign_Up_Btn);
    }
}
