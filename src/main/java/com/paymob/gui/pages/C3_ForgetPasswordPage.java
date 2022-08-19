package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class C3_ForgetPasswordPage {
    public By UserName = By.id("user-name");
    public By Continue_Btn = By.xpath("//button[@type='submit' and @class='primaryBtn']");

    private SHAFT.GUI.WebDriver driver;

    public C3_ForgetPasswordPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public void create_New_Password(){
        driver.element().type(UserName,"01004822119");
        driver.element().click(Continue_Btn);
    }
}
