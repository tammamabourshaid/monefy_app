# Setup

To run this project you will need:

- Android Studio 4.1.1 - https://developer.android.com/studio
- Appium 1.18.3 - http://appium.io/downloads.html

# implemented JSON Representationfor for Appium 

{
  "deviceName": "emulator-5554",
  "platformName": "android",
  "appPackage": "com.monefy.app.lite",
  "appActivity": "com.monefy.activities.main.MainActivity_",
  "noReset": true
}


## Android Studio
On SDK Manager
- SDK Platform - Android Pie 9.0
- SDK Tools
    - Android SDK Build-Tools
    - Android Emulator 30.2.6-6962233
    - Android SDK Platform-Tools 30.0.5
    - Android SDK Tools 30.0.0

- Create a virtual device:
    - Pixel 4 5.7 1080x2220 xxhdpi
    - Android Pie 9.0 x86
    - Portrait mode

- Install apk on the virtual device
    - Open a terminal window
    - Go to the Android Studio project folder
    - Run adb install -t `Path to the com.monefy.app.lite.apk in this project`

## Appium
Start a session on:
- Host 0.0.0.0
- Port 4723

## Android Studio
Libraries needed:
- Gradle: junit:junit:4.13.1
- io.appium:java-client:7.4.1
- TestNG:testng-7.0.0
- log4j:log4j-1.2-api-2.14
- log4j:log4j-core-2.14


## Usage

# Run the next steps to install the APK to the Emulator in Android Studio:

1- Run the emulator, and wait until it's completely started.

2- Go to your sdk installation folder then go to platform-tools (you should see an executable called adb.exe)

3- create a new file and call it run.bat, edit the file with notepad and write CMD in it and save it.

4- copy your desired apk to the same folder

5- now open run.bat and write adb install "com.monefy.app.lite.apk"

6- wait until the installation is complete 



# Run the project within Android Stodio

With the virtual device opened in the home screen
In the test folder run Test file 'MonefyTest.java'

The following scenarios should run:
- Add an Income and check the new balance.
- Add an expense "Bills" and assert that balance has added the amount.
- Add an expense "Food" and assert that balance has added the amount.
- Verify the percentage of the Food expense is correct.
- Delete the expense "added" and assert that the new balance. 

