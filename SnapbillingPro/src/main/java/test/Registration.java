package test;

import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Iterables;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;


public class Registration 
{
	
	private static final String WebElement = null;
	public static  AndroidDriver<WebElement> driver;
	public MethodClass m;	
	
public Registration()  {
	
	}

@BeforeTest
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

	@Test
	public void Registerstore() {
	

	m.findElementByIdAndSendKeys("store_phone_no_edittext","8953830535");
    m.findElementByIdAndClick("ok_button");
    m.findElementByIdAndSendKeys("otp_edittext","123456");
    m.findElementByIdAndClick("ok_button");
    m.scrollAndClick("Terms and Conditions");  
    m.findElementById("agreement_textvw" );
    m.findElementByIdAndClick("btn_agree");
    m.findElementByIdAndClick("btn_accept");
 System.out.println("store registered");
	}
	
 @Test
 public void Login() 
 {
	m.findElementByIdAndSendKeys("etUserName_login", "admin");
	m.findElementByIdAndSendKeys("etPassword_login", "admin");
	m.findElementByIdAndClick("btnLogin");
	m.findElementByIdAndSendKeys("etPosName","Test");
	//System.out.println("posname entered");
	m.findElementByIdAndClick("btnSubmit");
	System.out.println("Login done");
	m.findElementByIdAndSendKeys("et100","1");
	m.findElementByIdAndClick("btnSubmit");
	System.out.println("opening cash given");
	
 }
 

	@Test
	public void Makebills()
	{
	
	
	m.findElementByIdAndSendKeys("customer_search_edittext","verti");
	m.findElementByIdAndClick("search_customername_textview");
	
	m.findElementByIdAndClick("quickadd_button");
	List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");
	
	System.out.println("element" +element1.size());
	element1.get(0).click();

	   m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");

	    m.findElementByIdAndClick("button4");
		 m.findElementByIdAndClick("button8");
	  	  m.findElementByIdAndClick("buttonenter");
	  //	m.findElementById("search_button");  
	  //	m.findElementByIdAndSendKeys("product_name_search_edittext","apple");
	//  	List<WebElement> element2 = (List<WebElement>) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]");
//			for (WebElement Element2 : element2)
//				 System.out.println( Element2.getText());
		//	System.out.println(element2.size());
		//	Random rnd = new Random();
		//	int rndInt = rnd.nextInt(element2.size());
		//	((org.openqa.selenium.WebElement) element2.get(rndInt)).click();
	 
		//	System.out.println("element2");
		 m.findElementByIdAndClick("view_details_layout");
	     m.findElementByIdAndClick("invoice_bill_button");
	      m.findElementByIdAndClick("payment_bill_imageview");
	      m.findElementByIdAndClick("send_sms_check");
	      System.out.println("sms sent");
	      m.findElementByIdAndClick("android:id/button1");
	      System.out.println("Make bills test case passed");
	}
	@Test
	public void addsearchedproduct()
	{
		m.findElementByIdAndSendKeys("customer_search_edittext","verti");
		m.findElementByIdAndClick("search_customername_textview");
		m.findElementById("search_button");
		m.findElementByIdAndSendKeys("barcode_product_name_search_edittext","12");
		m.findElementByIdAndClick("barcode_search_textview");
//		List<WebElement> productElements = productListContainer.findElements(By.className("android.widget.FrameLayout"));
//for (WebElement productElement : productElements) {
//		    if (productElement.getText().equals("fig")) {
//		        // Click the "Add to Cart" button
//		        productElement.findElement(By.className("android.widget.FrameLayout")).click();
//		        break;
//		    }
		    m.findElementByIdAndClick("view_details_layout");
		     m.findElementByIdAndClick("invoice_bill_button");
		      m.findElementByIdAndClick("payment_bill_imageview");
		      m.findElementByIdAndClick("send_sms_check");
		      System.out.println("sms sent");
		      m.findElementByIdAndClick("android:id/button1");
		      System.out.println("add opther pro test case passed");
}
		    


	
//	@Test
//	public void addOtherproduct() throws InterruptedException {
//		m.findElementByIdAndSendKeys("customer_search_edittext","verti");
//		m.findElementByIdAndClick("search_customername_textview");
//		m.findElementById("search_button");
//		m.findElementByIdAndSendKeys("product_name_search_edittext","app");
//		m.findElementsById("content_framelayout");
//		
//	m.findElementByIdAndClick("view_details_layout");
//    m.findElementByIdAndClick("invoice_bill_button");
//     m.findElementByIdAndClick("payment_bill_imageview");
//     m.findElementByIdAndClick("send_sms_check");
//     System.out.println("sms sent");
//     m.findElementByIdAndClick("android:id/button1");
//     System.out.println("otherpro added");
//     Thread.sleep(10);
//	
//	}





//	@Test
//	public void Otherbill()
//	{
//		
//
//		
//		  m.findElementByIdAndSendKeys("customer_search_edittext","shipra");
//		  m.findElementByIdAndClick("search_customername_textview");
//		
//	      m.findElementByIdAndClick("quickadd_button");
//	      
//		WebElement el = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.ImageView");
//	      el.click();
//	         m. findElementByIdAndClick("button5");
//	         m.findElementByIdAndClick("button5");
//		  	 m.findElementByIdAndClick("buttonenter");
//		  	 
//  WebElement e2 = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
//             e2.click();  	 
//		  	 m.findElementByIdAndClick("quickadd_product_imageview");
//		  	 m.findElementByIdAndClick("button5");
//		  	m.findElementByIdAndClick("buttonenter");
//		  	m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
//		  	 
//		  	WebElement e3 = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ImageView"); 
//		  	e3.click(); 
//		  	m.findElementByIdAndClick("quickadd_product_imageview");
//            m. findElementByIdAndClick("button5");
//            m.findElementByIdAndClick("buttonenter");
//            m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
//
//		  	WebElement e4 = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView"); 
//		  	e4.click(); 
//		  	m.findElementByIdAndClick("quickadd_product_imageview");
//		  	m. findElementByIdAndClick("button3");
//		  	 m.findElementByIdAndClick("buttonenter");
//		  	  m.findElementByIdAndClick("view_textview");
//		      m.findElementByIdAndClick("invoice_bill_button");
//		      m.findElementByIdAndClick("payment_bill_imageview");
//		      m.findElementByIdAndClick("send_sms_check");
//		      System.out.println("sms sent");
//		     m.findElementByIdAndClick("android:id/button1");
//		      System.out.println("Other bills created");
//			
//	}
	
	@Test
	public void syncbills() {
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
	//	m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView");
		m.scrollAndClick("Backup Summary");
		m.findElementByIdAndClick("refresh_dialog");
		m.wait(10,TimeUnit.SECONDS);
	    m.findElementByClassNameAndClick("android.widget.Button");
	    System.out.println("app refreshed");
	    }

	
	
	
	@Test
	public void logout(){
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
//		m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[15]/android.widget.LinearLayout");
		m.scrollAndClick("Logout");
//		m.findElementByIdAndClick("positiveButton");
        System.out.println("logout done");
		m.findElementByIdAndClick("btnSubmit");
		
	}
}
    



