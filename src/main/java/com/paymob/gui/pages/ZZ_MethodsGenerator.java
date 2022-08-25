package com.paymob.gui.pages;

import com.shaft.driver.SHAFT;
import net.andreinc.mockneat.MockNeat;
import org.apache.commons.lang3.RandomStringUtils;

public class ZZ_MethodsGenerator {
    private SHAFT.GUI.WebDriver driver;
    static String Full_Name;
    static String Phone_Number;
    static String Email;
    static String Merchant_ID;
    static String Expiry_Hours;
    static String Order_Name;
    static String Description;
    static String Price_or_Amount;

    public ZZ_MethodsGenerator(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public static String Get_Name() {
        Full_Name = RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10);
        return Full_Name;
    }
    public static String Get_Phone_Number() {
        Phone_Number = RandomStringUtils.randomNumeric(11);
        return Phone_Number;
    }
    public static String Get_Email() {
        MockNeat mock =  MockNeat.threadLocal();
        return Email = mock.emails().domain("paymob.com").val();
    }
    public static String Get_Merchant_ID() {
        Merchant_ID = RandomStringUtils.randomNumeric(4);
        return Merchant_ID;
    }
    public static String Get_Expiry_Hours() {
        Expiry_Hours = RandomStringUtils.randomNumeric(2);
        return Expiry_Hours;
    }
    public static String Get_Order_Name() {
        Order_Name = RandomStringUtils.randomAlphabetic(10);
        return Order_Name;
    }
    public static String Get_Description() {
        Description = RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10)+ " " +RandomStringUtils.randomAlphabetic(10);
        return Description;
    }
    public static String Get_Price_or_Amount() {
        Price_or_Amount = RandomStringUtils.randomNumeric(3);
        return Price_or_Amount;
    }
}
