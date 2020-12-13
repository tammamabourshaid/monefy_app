# Task 2

A list of ideas/bullet points I test for:
-	Total Balance before insert an Income
-	Insert an expense with an amount from a category and check if the amount is added
-	Insert an expense with an amount from another category and check if the amount is added
-	Check the percentage of the expense if it is correct 
-	Delete an expense and check the Total Balance has reduce the deleted amount.


I explore the Income first with insert an amount (150 $), while the balance was ZERO (First use of the APP).
then explore how total balance is change, and how correctly calculate expenses.
to check the percentage of an expense by divided expense amount on amount withdrawn.
then delete an expense to check total balance has reduce this expense


# The possibilities of automating proposed test cases on different levels:
the first case - the positive point
The budget entry had to be tested above all to ensure that the budget was properly updateable from each entry
Negative point - wrong entry, back to delete the record

The second case - the positive point
Expenses per category to ensure proper budget cuts
Negative point: Select the wrong category, go back to deleting the record and re-enter again

The third case - the positive point
 The user wants to delete the expense for a specific reason, it must be verified that it will directly affect the budget and that the expense will be subtracted.
Negative case No deletion from records completely

Fourth case - positive point
The percentage of the percentage, it was interesting to check it based on the percentage of withdrawals so that the user can benefit from knowing the higher percentage of the monthly, weekly or even annual expenses
Negative case Correct display of the percentage in the category

I have been using an Excel file almost daily for several years to monitor expenses and determine expenses between cash payments or through the bank
With the use of this application, one can determine the categories of expenses, the prevailing percentage of expenses, and determine the monthly amount allocated to savings

 
# I choosed Appium, while:

    I can Test the same app it submited to the marketplace 
	Write my tests in any language, using any framework
    I can use a standard automation specification and API
    I can build a large and thriving open-source community effort

	
	

# Setup

To run this project We will need:

- Android Studio 4.1.1 - https://developer.android.com/studio
- Appium 1.18.3 - http://appium.io/downloads.html

## implemented JSON Representationfor for Appium 

{
  "deviceName": "emulator-5554",
  "platformName": "android",
  "appPackage": "com.monefy.app.lite",
  "appActivity": "com.monefy.activities.main.MainActivity_",
  "noReset": true
}

## Appium
Start a session on:
- Host 0.0.0.0
- Port 4723

## Libraries "dependencies" needed to Android Studio
- Gradle: junit:junit:4.13.1
- io.appium:java-client:7.4.1
- TestNG:testng-7.0.0
- log4j:log4j-1.2-api-2.14
- log4j:log4j-core-2.14

## Android Studio
I have set On SDK Manager
- SDK Platform - Android Pie 9.0
- SDK Tools:
    - Android Emulator 30.2.6-6962233
    - Android SDK Build-Tools
    - Android SDK Tools 30.0.0

- Virtual device:
    - Pixel 4 5.7 1080x2220 xxhdpi
    - Android Pie 9.0 x86
    - Portrait mode

## Install apk on the virtual device
Run the next steps to install the APK to the Emulator in Android Studio:

- Run the emulator, and wait until it's completely started.
- Go to your sdk installation folder then go to platform-tools (you should see an executable called adb.exe)
- create a new file and call it run.bat, edit the file with notepad and write CMD in it and save it.
- copy your desired apk to the same folder
- now open run.bat and write adb install "com.monefy.app.lite.apk"
- wait until the installation is complete 

## Run the project within Android Studio
With the virtual device opened, In the test folder run Test file 'MonefyTest.java'

The following scenarios should run:
- Add an Income and check the new balance.
- Add an expense "Bills" and assert that balance has added the amount.
- Add an expense "Food" and assert that balance has added the amount.
- Verify the percentage of the Food expense is correct.
- Delete the expense "added" and assert that the new balance. 

