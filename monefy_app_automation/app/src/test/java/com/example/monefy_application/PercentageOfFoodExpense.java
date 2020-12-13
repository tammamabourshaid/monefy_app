package com.example.monefy_application;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PercentageOfFoodExpense {
    public static void ExpensePercentage(AndroidDriver<AndroidElement> driver) {

        MobileElement clickPercentage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView[12]");
        clickPercentage.click();

        MobileElement percentageField = driver.findElementByXPath("findElementByXPath(\"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView[12]");

        MobileElement list = (MobileElement) driver.findElementById("com.monefy.app.lite:id/rightLinesImageView");
        list.click();
        MobileElement textOfFood = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.TextView");
        textOfFood.click();

        String foodPercentage = textOfFood.getText();
        MobileElement goBack = (MobileElement) driver.findElementById("com.monefy.app.lite:id/leftLinesImageView");
        goBack.click();
        MobileElement selectAmount = (MobileElement) driver.findElementById("com.monefy.app.lite:id/expense_amount_text");
        selectAmount.click();
        String amountText =selectAmount.getText();

        Integer numberFoodPercentage = Integer.parseInt(foodPercentage);
        Integer numberAmountText = Integer.parseInt(amountText);

        Integer calculatePercentage = numberAmountText/numberFoodPercentage;
        String percentage = calculatePercentage.toString().trim().substring(2);

        Assert.assertEquals(percentageField.getText(), percentage);

    }
}
