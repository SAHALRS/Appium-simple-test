package com.appium.tests;


import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class appiumFirsttest {
	
	 public static void main(String[] args) throws Exception {

	        DesiredCapabilities capabilities = new DesiredCapabilities();

	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("appium:automationName", "UiAutomator2");
	        capabilities.setCapability("appium:deviceName", "Android Emulator");

	        capabilities.setCapability("appium:appPackage", "com.android.settings");
	        capabilities.setCapability("appium:appActivity", ".Settings");

	        URL appiumServer = URI.create("http://127.0.0.1:4723").toURL();

	        AndroidDriver driver = new AndroidDriver(appiumServer, capabilities);

	        System.out.println("Settings opened!");

	        Thread.sleep(2000);
	        
	        

	        // Find the Search button
	     
	        driver.findElement(By.id("com.android.settings:id/search_action_bar")).click();

	        Thread.sleep(1000);

	        driver.findElement(By.id("com.google.android.settings.intelligence:id/open_search_view_edit_text"))
	        .sendKeys("Wi-Fi");
	        
	        //System.out.println(driver.getPageSource());
	        
	        System.out.println("Wi-Fi entered in search!");

	        Thread.sleep(5000);

	        driver.quit();

}
}

