import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Iterables;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import test.Registration;



public class launchsnapbillingpro {

	static AndroidDriver<WebElement> driver;
	TouchAction action = new TouchAction(driver);
	 
	public static void main(String[] args) {
		
		
		try {
			//opensnapnillingpro();
		} catch (Exception e) {
			System.out.println("error" +e.getMessage());
			System.out.println("error cause" +e.getCause());
			e.printStackTrace();
		}
	
	}
	public static void opensnapnillingpro() throws Exception
	{
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("DeviceName", "HUAWEI MediaPad T5");
//		cap.setCapability("Udid", "VQTBB20821101069");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("PlatformVersion", "8.0.0");
//		cap.setCapability("appPackage", "com.snapbizz.snapbillingprox");
//		cap.setCapability("appActivity", "com.snapbizz.snapbilling.activity.BillingSplashscreenActivity");
//		System.out.println("cap"+cap);
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
//		driver= new AndroidDriver<WebElement>(url,cap);
		System.out.println("App started....");
		Registration r = new Registration();
		r.Launchapp();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement allow1 =driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
//		allow1.click();
//		
//		
//		WebElement allow2 =driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
//		allow2.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		findElementByIdAndSendKeys("store_phone_no_edittext","8953830535");
//        findElementByIdAndClick("ok_button");
//        findElementByIdAndSendKeys("otp_edittext","123456");
//        findElementByIdAndClick("ok_button");
//        scrollAndClick("Terms and Conditions");  
//        findElementById("agreement_textvw","Terms and Conditions" );
//        findElementByIdAndClick("btn_agree");
//        findElementByIdAndClick("btn_accept");
//     
//      
//      	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		findElementByIdAndSendKeys("etUserName_login", "admin");
//		findElementByIdAndSendKeys("etPassword_login", "admin");
//		findElementByIdAndClick("btnLogin");
//		findElementByIdAndSendKeys("etPosName","Test");
//		findElementByIdAndClick("btnSubmit");
//		findElementByIdAndSendKeys("et100","1");
//		findElementByIdAndClick("btnSubmit");
//		
//		for(int i = 0;i<10;i++) {
//		findElementByIdAndSendKeys("customer_search_edittext","verti");
//		findElementByIdAndClick("search_customername_textview");
//		
//		findElementByIdAndClick("quickadd_button");
//		List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");
//		System.out.println("element" +element1.size());
//		element1.get(0).click();
//		
//		
//			 findElementByIdAndClick("button4");
//			 findElementByIdAndClick("button8");
//		  	  findElementByIdAndClick("buttonenter");
//		  	  findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
//		      findElementByIdAndClick("view_textview");
//		      findElementByIdAndClick("invoice_bill_button");
//		      findElementByIdAndClick("payment_bill_imageview");
//		      findElementByIdAndClick("android:id/button1");
//		}
//		for(int j=0;j<5;j++) {
//			
//			  findElementByIdAndSendKeys("customer_search_edittext","shipra");
//			  findElementByIdAndClick("search_customername_textview");
//			
//		      findElementByIdAndClick("quickadd_button");
//			WebElement el = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.ImageView");
//		      el.click();
//		          findElementByIdAndClick("button5");
//		          findElementByIdAndClick("button5");
//			  	  findElementByIdAndClick("buttonenter");
////			  	  findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
//		  	  findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
////			  	  findElementByIdAndClick("button5");
////			  	  findElementByIdAndClick("buttonenter");
//			  	  findElementByIdAndClick("view_textview");
//			      findElementByIdAndClick("invoice_bill_button");
//			      findElementByIdAndClick("payment_bill_imageview");
//			      findElementByIdAndClick("android:id/button1");
				
		}
	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView

	private static void findElementById(String string, String string2) {
 			MobileElement el = (MobileElement) driver.findElementById(string);
 			System.out.println("el" +el);
 			  Point point = el.getLocation();
 			  int x = point.x +1; 
 			  int y = point.y + el.getSize().getHeight() - 1;
 			  PointOption p = new PointOption();
 			  new TouchAction(driver).tap(p.point(x, y)).perform();		
	}
 		
		  
	private static void findElementByIdAndSendKeys(String string, String i) {
		 driver.findElementById(string).sendKeys(i);
		
	}
	
	
	private static void findElementByIdAndClick(String string) {
		 driver.findElementById(string).click();
	}
	public static void scrollAndClick(String visibleText) {
	     
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\"))");
	        
	}
	public static void findElementByClassNameAndClick(String string) {
		driver.findElementByClassName(string).click();
	}
	private static void findElementByXpathAndClick(String string) {
		driver.findElementByXPath(string).click();
	}
	private void findElementByIdandtext(String string, String string2) {
		MobileElement ele = (MobileElement) driver.findElementById(string);
		System.out.println("ele" +ele);
		  Point point = ele.getLocation();
		  int x = point.x +5; 
		  int y = point.y + ele.getSize().getHeight() - 6;
		  PointOption p = new PointOption();
		  new TouchAction(driver).tap(p.point(x, y)).perform();
		  }
	
	
	
	
        
    }



	
	
	

