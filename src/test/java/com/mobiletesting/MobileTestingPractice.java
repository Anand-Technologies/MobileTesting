package com.mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTestingPractice {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi Note 5 PRO");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.facebook.katana");
		dc.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		AppiumDriver driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);

	}

}
