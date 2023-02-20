//package test;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
//
//public class Features {
//	private static final String WebElement = null;
//	public static  AndroidDriver<WebElement> driver;
//	public MethodClass m;	
//	public Registration r;
//	
//	public  Features() throws Exception {
		
		

//	}
//	@Test(priority = 3)
//	 public void Login() 
//	 {
//		driver.findElementById("etUserName_login").sendKeys("admin");
//		driver.findElementById("etPassword_login").sendKeys("admin");
//		m.findElementByIdAndClick("btnLogin");
//		driver.findElementById("etPosName").sendKeys("Test");
//		//System.out.println("posname entered");
//		m.findElementByIdAndClick("btnSubmit");
//		System.out.println("Login done");
//		driver.findElementById("et100").sendKeys("1");
//		m.findElementByIdAndClick("btnSubmit");
//		System.out.println("opening cash given");
//		
//	 }
//	@Test(priority = 4)
//	public void Makebills()
//	{
//	
//	
//	m.findElementByXpathAndSendKeys("customer_search_edittext","verti");
//	m.findElementByIdAndClick("search_customername_textview");
//	
//	m.findElementByIdAndClick("quickadd_button");
//	List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");
//	
//	System.out.println("element" +element1.size());
//	element1.get(0).click();
//
//	   m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");
//
//	    m.findElementByIdAndClick("button4");
//		 m.findElementByIdAndClick("button8");
//	  	  m.findElementByIdAndClick("buttonenter");
//		 m.findElementByIdAndClick("view_details_layout");
//	     m.findElementByIdAndClick("invoice_bill_button");
//	      m.findElementByIdAndClick("payment_bill_imageview");
//	      m.findElementByIdAndClick("send_sms_check");
//	      System.out.println("sms sent");
//	      m.findElementByIdAndClick("android:id/button1");
//	      System.out.println("Make bills test case passed");
//	      
//	}
//	@Test(priority = 5)
//	public void addsearchedproduct()
//	{
//	   
//		driver.findElementById("customer_search_edittext").sendKeys("verti");
//		m.findElementByIdAndClick("search_customername_textview");
//		
//		m.findElementById("search_button");
//	
//		m.findElementByXpathAndSendKeys("product_name_search_edittext","app");
//	    driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
//        driver.pressKeyCode(AndroidKeyCode.ENTER);
//	
//	}
//}
