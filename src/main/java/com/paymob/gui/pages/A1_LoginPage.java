package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class A1_LoginPage {

    public By UserName = By.id("user-name");
    public By Password = By.id("password");
    public By SignIn_Btn = By.xpath("//button[@class='primaryBtn' and @type='submit']");
    public By Paymob_Logo = By.xpath("//img[@alt='Paymob logo consists of paymob word']");

    private SHAFT.GUI.WebDriver driver;

    public A1_LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void SignIn() {
        driver.element().type(UserName, "01008884767");
        driver.element().type(Password, "Sultan@160884");
        driver.element().click(SignIn_Btn);
    }
}
