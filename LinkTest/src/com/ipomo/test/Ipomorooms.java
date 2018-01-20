package com.ipomo.test;


import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

@Test
public class Ipomorooms {

	 WebDriver driver;
	 @Test(enabled = false)
	  public void swipe()
	    {  
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    HashMap<String, Double> swipeObject = new HashMap<String, Double>();
	    swipeObject.put("startX", 0.95);
	    swipeObject.put("startY", 0.5);
	    swipeObject.put("endX", 0.05);
	    swipeObject.put("endY", 0.5);
	    swipeObject.put("duration", 1.8);
	    js.executeScript("mobile: swipe", swipeObject);
	     }
	  
	 

	
     @BeforeTest
	 public void setUp() throws MalformedURLException {
//	  // Created object of DesiredCapabilities class.
//	  DesiredCapabilities capabilities = new DesiredCapabilities();
//	  // Set android deviceName desired capability. Set your device name.
//	  capabilities.setCapability("deviceName", "QO3A07C00021");
//	  // Set BROWSER_NAME desired capability. It's Android in our case here.
//	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
//	  // Set android VERSION desired capability. Set your mobile device's OS version.
//	  capabilities.setCapability(CapabilityType.VERSION, "4.2.2");
//	  // Set android platformName desired capability. It's Android in our case here.
//	  capabilities.setCapability("platformName", "Android");
//	  capabilities.setCapability("noReset","true");
//	  capabilities.setCapability("fullReset","false");	  
//
//	  // Set android appPackage desired capability. It is
//	  // com.android.calculator2 for calculator application.
//	  // Set your application's appPackage if you are using any other app.
//	  capabilities.setCapability("appPackage", "com.ipomo.room");
//	  // Set android appActivity desired capability. It is
//	  // com.android.calculator2.Calculator for calculator application.
//	  // Set your application's appPackage if you are using any other app.
//	  capabilities.setCapability("appActivity", "com.ipomo.room.TWEEK");
//	  // Created object of RemoteWebDriver will all set capabilities.
//	  // Set appium server address and port number in URL string.
//	  // It will launch calculator app in android device.
//	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	   DesiredCapabilities capabilities = new DesiredCapabilities();
	   capabilities.setCapability(MobileCapabilityType.VERSION, "4.2.2");
	   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	   capabilities.setCapability("noReset","true");
	   capabilities.setCapability("fullReset","false");
	   //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"QO3A07C00021");
	   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"T00940X56X");
	   capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.ipomo.room");
	   capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.ipomo.room.TWEEK"); 
	   //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	 } 

	@Test(enabled = false)
	 public void AboutIpomo() {
	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']/android.widget.ImageView[@index = '2']")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[@text = 'About ipomo #R']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//android.widget.TextView[@text = 'Clean All Rooms']")).click();
		  driver.findElement(By.xpath("//android.widget.Button[@text = 'Yes']")).click();
		  
		 
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//android.widget.TextView[@text ='SD Card Path']")).click();
		  driver.findElement(By.xpath("//android.widget.RadioButton[@checkable = 'true']")).click();
		  driver.findElement(By.xpath("//android.widget.Button[@text = 'Select']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//android.widget.TextView[@text = 'Feedback']")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[@NAF='true']")).sendKeys("Super ipomo");
		  driver.findElement(By.xpath("//android.widget.Button[@text = 'Cancel']")).click();
		  driver.navigate().back();

	 }
	@Test(enabled = false)
	 public void SearchTest(){
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '1']/android.widget.RelativeLayout[@index = '0']/android.widget.FrameLayout[@index='0']/android.widget.ImageView[@index='0']")).click();
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '2']/android.widget.RelativeLayout[@index = '0']/android.widget.RelativeLayout[@index = '0']/android.widget.ImageView[@index = '2']")).click();
         driver.findElement(By.xpath("//android.widget.TextView[@text = 'Refresh Room']")).click();  
		 //driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '1']/android.widget.RelativeLayout[@index = '0']/android.widget.RelativeLayout[@index = '0']")).click();
		 swipe();
		// driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '4']/android.widget.RelativeLayout[@index = '0']/android.widget.RelativeLayout[@index = '0']/android.widget.ImageView[@index = '2']")).click();

	 }
	@Test(enabled = false)
	 public void store(){
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '1']/android.widget.RelativeLayout[@index = '0']/android.widget.ImageView[@index='0']")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '1']/android.widget.RelativeLayout[@index = '0']/android.widget.EditText[@index='0']")).sendKeys("acks");
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '1']/android.widget.RelativeLayout[@index = '0']/android.widget.ImageView[@index='1']")).click();
	 }
	@Test(enabled = false)
	 public void share(){
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '0']/android.widget.RelativeLayout[@index = '2']/android.widget.ImageView[@index='0']")).click();
		 driver.findElement(By.xpath("//android.widget.FrameLayout[@index = '1']/android.widget.GridView[@index = '0']/android.widget.LinearLayout[@index = '5']/android.widget.ImageView[@index = '0']")).click();
	 }
	@Test(enabled = false)
	 public void commenttext(){
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '2']/android.widget.RelativeLayout[@index = '0']/android.widget.RelativeLayout[@index = '1']/android.widget.ImageView[@index ='0'")).click();
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '1']/android.widget.RelativeLayout[@index = '0']/android.widget.EditText[@index='0']")).sendKeys("acks");
	 }
	@Test (enabled = true)
		public void  dimenstionTest() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement Image = driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '3']/android.widget.ImageView[index = '2]"));
		int ImageWidth = Image.getSize().getWidth();
        System.out.println("Image width Is "+ImageWidth+" pixels");
        int ImageHeight = Image.getSize().getHeight();        
        System.out.println("Image height Is "+ImageHeight+" pixels");
		 Dimension dimensions = driver.manage().window().getSize();
	        int screenWidth = dimensions.getWidth();
	        int screenHeight = dimensions.getHeight();
	        System.out.println (screenWidth);
	        System.out.println (screenHeight);
	}
		 @AfterTest
	 public void End() {
	 driver.quit();
	 }
	}
