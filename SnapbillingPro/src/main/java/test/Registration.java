package test;

import java.awt.Point;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Registration 
{
	
	private static final String WebElement = null;
	public static  AndroidDriver<WebElement> driver;
	public MethodClass m;
		
	
public Registration()  {  
	
	
	}

@Test(priority = 1)
public void Launchapp() throws Exception
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("DeviceName", "HUAWEI MediaPad T5");
	cap.setCapability("Udid", "VQTBB20821101069");
	cap.setCapability("platformName", "Android");
	cap.setCapability("PlatformVersion", "8.0.0");
	cap.setCapability("appPackage", "com.snapbizz.snapbillingprox");
	cap.setCapability("appActivity", "com.snapbizz.snapbilling.activity.BillingSplashscreenActivity");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AndroidDriver<WebElement>(url,cap);
	MethodClass m = new MethodClass(driver);
	System.out.println("App started. registration...");
	String allow = "com.android.packageinstaller:id/permission_allow_button";
	m.allowAndClick(allow);
	m.allowAndClick(allow);
	m.wait(30,TimeUnit.SECONDS);
	Registerstore();
	m.wait(30,TimeUnit.SECONDS);
	Login();
	
}

	@Test(priority = 2)
	public void Registerstore() {
	

	m.findElementByIdAndSendKeys("store_phone_no_edittext","8953830535");	
    m.findElementByIdAndClick("ok_button");
    m.findElementByIdAndSendKeys("otp_edittext","123456");
    m.findElementByIdAndClick("ok_button");
    m.scrollAndClick("Terms and Conditions"); 
    m.findElementById("agreement_textvw");
    m.findElementByIdAndClick("btn_agree");
    m.findElementByIdAndClick("btn_accept");
    System.out.println("store registered");
   
	}
	
	
	@Test(priority = 3)
	
	public void Login() {
		 
	 
		m.findElementByIdAndSendKeys("etUserName_login","admin");
		m.findElementByIdAndSendKeys("etPassword_login","admin");
		m.findElementByIdAndClick("btnLogin");
		m.findElementByIdAndSendKeys("etPosName","Test");
		System.out.println("posname entered");
		
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("Login done");
		m.findElementByIdAndSendKeys("et100","1");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("opening cash given");
		
	 }
	//code for new store inventory
	
// @Test(priority = 4)
// public void inventoryadd() throws Exception {
//	 m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
//	 m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Inventory Management\"]");
//	 m.findElementByIdAndClick("gdb_tab_layout");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[3]");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[4");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[5]");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[6]");
//	 m.findElementByXpathAndClick("(//android.widget.ImageView[@content-desc=\"Product Image\"])[7]");
//	 m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
//	 m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Backup Summary\"]");
//     Thread.sleep(30000);
//		m.findElementByIdAndClick("refresh_dialog"); 
//		
//		Thread.sleep(30000);
//		
//		m.findElementByIdAndClick("refresh_dialog"); 
//		 Thread.sleep(5000);
//	
//		m.findElementByIdAndClick("close_dialog"); 
//		
//	 
//	 
// }
// 

	@Test(priority = 5)
	public void Makebills()
	{
	
//    m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
//    m.findElementByIdAndClick("Navigate up");
	m.findElementByIdAndSendKeys("customer_search_edittext","verti");
	m.findElementByIdAndClick("search_customername_textview");
	
	m.findElementByIdAndClick("quickadd_button");
	// top quickadd product (kitchen)
	List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");
	
	System.out.println("element" +element1.size());
	element1.get(0).click();

	   m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");

	    m.findElementByIdAndClick("button4");
		 m.findElementByIdAndClick("button8");
	  	  m.findElementByIdAndClick("buttonenter");
		 m.findElementByIdAndClick("view_details_layout");
	     m.findElementByIdAndClick("invoice_bill_button");
	      m.findElementByIdAndClick("payment_bill_imageview");
	      m.findElementByIdAndClick("send_sms_check");
	      System.out.println("sms sent");
	      m.findElementByIdAndClick("android:id/button1");
	      System.out.println("Make bills test case passed");
	}
	
	
  
 
  

	@Test(priority = 6)
	public void addsearchedproduct() throws InterruptedException
	{
	   
		
		m.findElementByIdAndSendKeys("customer_search_edittext","verti");
		m.findElementByIdAndClick("search_customername_textview");
		
		m.findElementById("search_button");
		m.findElementByIdAndSendKeys("product_name_search_edittext","apple");

  List<WebElement> elements = driver.findElementsById("productname_textview");
  for(WebElement element : elements) 
  element.getText().equals("apple");
  ((WebElement) elements).click();
   m.findElementByIdAndClick("bill_productquantity_textview");
   m.findElementByIdAndClick("button3");
   m.findElementByIdAndClick("buttonenter");
   m.findElementByIdAndClick("view_details_layout");
   m.findElementByIdAndClick("invoice_bill_button");
   m.findElementByIdAndClick("payment_bill_imageview");
   m.findElementByIdAndClick("send_sms_check");
   System.out.println("sms sent");
   m.findElementByIdAndClick("button1");
   System.out.println("add other pro test case passed");	   
  
 
  }
  
	@Test(priority = 8)
	public void Otherbill()
	{
		

		
		  m.findElementByIdAndSendKeys("customer_search_edittext","shipra");
		  m.findElementByIdAndClick("search_customername_textview");
		
	      m.findElementByIdAndClick("quickadd_button");
	      
		WebElement el = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.ImageView");
	      el.click();
	         m. findElementByIdAndClick("button5");
	         m.findElementByIdAndClick("button5");
		  	 m.findElementByIdAndClick("buttonenter");
		  	 
  WebElement e2 = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
             e2.click();  	 
		  	 m.findElementByIdAndClick("quickadd_product_imageview");
		  	 m.findElementByIdAndClick("button5");
		  	m.findElementByIdAndClick("buttonenter");
		  	m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		  	 
		  	WebElement e3 = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ImageView"); 
		  	e3.click(); 
		  	m.findElementByIdAndClick("quickadd_product_imageview");
            m. findElementByIdAndClick("button5");
            m.findElementByIdAndClick("buttonenter");
            m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		  	WebElement e4 = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView"); 
		  	e4.click(); 
		  	m.findElementByIdAndClick("quickadd_product_imageview");
		  	m. findElementByIdAndClick("button3");
		  	 m.findElementByIdAndClick("buttonenter");
		  	  m.findElementByIdAndClick("view_textview");
		      m.findElementByIdAndClick("invoice_bill_button");
		      m.findElementByIdAndClick("payment_bill_imageview");
		      m.findElementByIdAndClick("send_sms_check");
		      System.out.println("sms sent");
		     m.findElementByIdAndClick("android:id/button1");
		      System.out.println("Other bills created");
			
	}
	@Test(priority = 9)
	public void bestoffer() {
	//	m.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.ListView");
		m.findElementByIdAndClick("offers_button");
		m.findElementByIdAndClick("product_imageview");
		m.findElementByIdAndClick("bill_productquantity_textview");
		m. findElementByIdAndClick("button3");
		m.findElementByIdAndClick("buttonenter");
		 m.findElementByIdAndClick("view_textview");
		 m.findElementByIdAndClick("payment_bill_imageview");
		 m.findElementByIdAndClick("android:id/button1");
	      System.out.println("best offer product bill done");
		
	     
		  
	}
	
	@Test(priority = 10)
	public void syncbills() throws InterruptedException {
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
        m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Backup Summary\"]");
        Thread.sleep(30000);
		m.findElementByIdAndClick("refresh_dialog"); 
		
		Thread.sleep(30000);
		
		m.findElementByIdAndClick("refresh_dialog"); 
		 Thread.sleep(5000);
	
		m.findElementByIdAndClick("close_dialog"); 
		
	
	    System.out.println("close");
	    }
	
	@Test(priority = 11)	
	  public void Savedb() throws InterruptedException {  
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]"); 
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Settings\"]");
		m.scrollAndClick("Database Backup");
		System.out.println("database clicked");
	    m.findElementByClassNameAndClick("android.widget.Switch");
	    m.scrollAndClick("vertika verma");
		Thread.sleep(3000);
		m.findElementByIdAndClick("nnf_button_ok");
		m.findElementByIdAndClick("btnSave_dbBackUpSettings");
		// after saving db restart app
		//		m.findElementByIdAndClick("positiveButton");
		
		m.findElementByIdAndClick("negativeButton");
		
		System.out.println("pass");
		Thread.sleep(10000);
		
		
		
	  }

	 
	@Test(priority = 12)
	public void logout() throws Exception{
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
		m.scrollAndClick("Logout");
		m.findElementByIdAndClick("positiveButton");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("logout done");
		
		}
	@Test(priority = 13)
	public void Relogin() throws Exception {
		 
		 
		m.findElementByIdAndSendKeys("etUserName_login","admin");
		m.findElementByIdAndSendKeys("etPassword_login","admin");
		m.findElementByIdAndClick("btnLogin");
//		m.findElementByIdAndClick("btnSubmit");
		System.out.println("Login done");
		m.findElementByIdAndSendKeys("et100","1");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("opening cash given");
		Makebills();
		Otherbill();
		logout();
	
}
}
//
//	
//	
//
//	
//	 
//    
//
//
//
