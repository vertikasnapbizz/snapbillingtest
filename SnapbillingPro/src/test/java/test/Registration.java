package test;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


public class Registration 
{
	public static  AndroidDriver<WebElement> driver;
	public MethodClass m;	
	public Registration() {
		
	}
@Test
public void Launchapp() throws Exception
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("DeviceName", "HUAWEI MediaPad T5");
	cap.setCapability("Udid", "VQTBB20821101069");
	cap.setCapability("platformName", "Android");
	cap.setCapability("PlatformVersion", "8.0.0");
	cap.setCapability("appPackage", "com.snapbizz.snapbillingprox");
	cap.setCapability("appActivity", "com.snapbizz.snapbilling.activity.BillingSplashscreenActivity");
	System.out.println("in registration page");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AndroidDriver<WebElement>(url,cap);
	MethodClass m = new MethodClass(driver);
	System.out.println("App started. registration...");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement allow1 =driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
	allow1.click();
	
	
	WebElement allow2 =driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
	allow2.click();

	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Registerstore();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 Login();

}

	@Test
	public void Registerstore() {
	

	m.findElementByIdAndSendKeys("store_phone_no_edittext","8953830535");
    m.findElementByIdAndClick("ok_button");
    m.findElementByIdAndSendKeys("otp_edittext","123456");
    m.findElementByIdAndClick("ok_button");
    m.scrollAndClick("Terms and Conditions");  
    m.findElementById("agreement_textvw","Terms and Conditions" );
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
	System.out.println("Login done");
	m.findElementByIdAndSendKeys("etPosName","Test");
	m.findElementByIdAndClick("btnSubmit");
	System.out.println("posname entered");
	m.findElementByIdAndSendKeys("et100","1");
	m.findElementByIdAndClick("btnSubmit");
	System.out.println("opening cash geven");
	
 }
	@Test
	public void Makebills()
	{
	
	for(int i = 0;i<10;i++) {
	m.findElementByIdAndSendKeys("customer_search_edittext","verti");
	m.findElementByIdAndClick("search_customername_textview");
	
	m.findElementByIdAndClick("quickadd_button");
	List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");
	System.out.println("element" +element1.size());
	element1.get(0).click();
	    m.findElementByIdAndClick("button4");
		 m.findElementByIdAndClick("button8");
	  	  m.findElementByIdAndClick("buttonenter");
	  	  m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
	     m.findElementByIdAndClick("view_textview");
	     m.findElementByIdAndClick("invoice_bill_button");
	      m.findElementByIdAndClick("payment_bill_imageview");
	      m.findElementByIdAndClick("android:id/button1");
	      System.out.println("Make bills test case passed");
	}
	}
	
	@Test
	public void Otherbill()
	{
	for(int j=0;j<5;j++) {
		
		  m.findElementByIdAndSendKeys("customer_search_edittext","shipra");
		  m.findElementByIdAndClick("search_customername_textview");
		
	      m.findElementByIdAndClick("quickadd_button");
		WebElement el = (WebElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.ImageView");
	      el.click();
	         m. findElementByIdAndClick("button5");
	         m.findElementByIdAndClick("button5");
		  	 m.findElementByIdAndClick("buttonenter");
//		  	  findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
//	  	  findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
//		  	  findElementByIdAndClick("button5");
//		  	  findElementByIdAndClick("buttonenter");
		  	  m.findElementByIdAndClick("view_textview");
		      m.findElementByIdAndClick("invoice_bill_button");
		      m.findElementByIdAndClick("payment_bill_imageview");
		     m.findElementByIdAndClick("android:id/button1");
		      System.out.println("Other bills created");
			
	}
}

}
    



