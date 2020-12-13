package com.example.monefy_application;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class AddExpenseBillsAndAssert {

    public static void addBillsToExpense(AndroidDriver<AndroidElement> driver) {

        MobileElement addExpense = driver.findElementById("com.monefy.app.lite:id/expense_button");
        addExpense.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.monefy.app.lite:id/amount_text")));

        MobileElement valueField = driver.findElementById("com.monefy.app.lite:id/amount_text");
        valueField.click();

        MobileElement Keyboard5 = driver.findElementById("com.monefy.app.lite:id/buttonKeyboard5");
        Keyboard5.click();

        MobileElement Keyboard0 = driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0");
        Keyboard0.click();

        MobileElement viewNote = driver.findElementById("com.monefy.app.lite:id/textViewNote");
        viewNote.click();
        viewNote.sendKeys("Bills");
        valueField.click();

        MobileElement layoutCategoryButton = driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory");
        layoutCategoryButton.click();

        MobileElement selectListedCategory = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout");
        selectListedCategory.click();

        Assert.assertEquals(driver.findElementById("com.monefy.app.lite:id/balance_amount").getText(),"Balance $100.00");

    }
}
