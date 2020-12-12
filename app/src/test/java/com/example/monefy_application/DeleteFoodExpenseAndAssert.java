package com.example.monefy_application;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class DeleteFoodExpenseAndAssert {

    public static void deleteExpense(AndroidDriver<AndroidElement> driver) {

        MobileElement navigateRight = (MobileElement) driver.findElementById("com.monefy.app.lite:id/rightLinesImageView");
        navigateRight.click();
        MobileElement selectFood = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]");
        selectFood.click();
        MobileElement amount = (MobileElement) driver.findElementById("com.monefy.app.lite:id/textViewTransactionAmount");
        amount.click();
        MobileElement delete = (MobileElement) driver.findElementByAccessibilityId("Delete");
        delete.click();
        MobileElement navigateLeft = (MobileElement) driver.findElementById("com.monefy.app.lite:id/leftLinesImageView");
        navigateLeft.click();

        MobileElement newBalanceAmount = (MobileElement) driver.findElementById("com.monefy.app.lite:id/balance_amount");
        newBalanceAmount.click();

        Assert.assertEquals(newBalanceAmount.getText(), "Balance $100.00");

    }
}
