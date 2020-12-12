package com.example.monefy_application;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class AddIncomeAndAssert {

    public static void addIncome(AndroidDriver<AndroidElement> driver) {

        MobileElement income_button = (MobileElement) driver.findElementById("com.monefy.app.lite:id/income_button_title");
        income_button.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.monefy.app.lite:id/amount_text")));

        MobileElement Keyboard1 = (MobileElement) driver.findElementById("com.monefy.app.lite:id/buttonKeyboard1");
        Keyboard1.click();
        MobileElement Keyboard5 = (MobileElement) driver.findElementById("com.monefy.app.lite:id/buttonKeyboard5");
        Keyboard5.click();
        MobileElement Keyboard0 = (MobileElement) driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0");
        Keyboard0.click();

        MobileElement chooseCategoryButton = driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory");
        chooseCategoryButton.click();

        MobileElement selectCategory = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout");
        selectCategory.click();

        Assert.assertEquals(driver.findElementById("com.monefy.app.lite:id/balance_amount").getText(),"Balance $150.00");

    }
}
