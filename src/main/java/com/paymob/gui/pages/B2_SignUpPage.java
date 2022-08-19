package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class B2_SignUpPage {
    public By Sign_Up_Phone_Num = By.id("phone-number");
    public By Sign_Up_Next_Btn = By.xpath("//button[@type='submit' and @class='primaryBtn']");

    private SHAFT.GUI.WebDriver driver;

    public B2_SignUpPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public void create_Paymob_Account(){
        driver.element().type(Sign_Up_Phone_Num,"01004822119");
        driver.element().click(Sign_Up_Next_Btn);
        //driver.assertThat().element(By.xpath("//legend[normalize-space()='Sign Up']")).text().contains("Sign Up").perform();
    }
}
