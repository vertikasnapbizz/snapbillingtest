package smoketestgroup;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Sanitytestcases {

	private static final String WebElement = null;
	public static AndroidDriver<WebElement> driver;
	public MethodClass m;

	public Sanitytestcases() {

	}

	@Test(priority=1,groups = {"Sanity-test"})
	public void Launchapp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("DeviceName", "HUAWEI MediaPad T5");
		cap.setCapability("Udid", "VQTBB20821101069");
		cap.setCapability("platformName", "Android");
		cap.setCapability("PlatformVersion", "8.0.0");
		cap.setCapability("appPackage", "com.snapbizz.snapbillingprox");
		cap.setCapability("appActivity", "com.snapbizz.snapbilling.activity.BillingActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, cap);
		MethodClass m = new MethodClass(driver);
		System.out.println("App started. registration...");
//		String allow = "com.android.packageinstaller:id/permission_allow_button";
//		m.allowAndClick(allow);
//		m.allowAndClick(allow);
//		m.wait(30, TimeUnit.SECONDS);
//		Registerstore();
		m.wait(30, TimeUnit.SECONDS);
		Login();

	}

//	@Test(priority = 2)
//	public void Registerstore() {
//
//		m.findElementByIdAndSendKeys("store_phone_no_edittext", "8953830535");
//		m.findElementByIdAndClick("ok_button");
//		m.findElementByIdAndSendKeys("otp_edittext", "123456");
//		m.findElementByIdAndClick("ok_button");
//		m.scrollAndClick("Terms and Conditions");
//		m.findElementById("agreement_textvw");
//		m.findElementByIdAndClick("btn_agree");
//		m.findElementByIdAndClick("btn_accept");
//		System.out.println("store registered");
//
//	}

	@Test(priority=2,groups = {"Sanity-tset"})

	public void Login() {

		m.findElementByIdAndSendKeys("etUserName_login", "admin");
		m.findElementByIdAndSendKeys("etPassword_login", "admin");
		m.findElementByIdAndClick("btnLogin");
		m.findElementByIdAndSendKeys("etPosName", "Test");
		System.out.println("posname entered");

		m.findElementByIdAndClick("btnSubmit");
		System.out.println("Login done");
		m.findElementByIdAndSendKeys("et100", "1");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("opening cash given");

	}
	// code for new store inventory

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

	@Test(priority=5,groups = {"Sanity-tset"})
	public void Makebills() {

//    m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
//    m.findElementByIdAndClick("Navigate up");
		m.findElementByIdAndSendKeys("customer_search_edittext", "verti");
		m.findElementByIdAndClick("search_customername_textview");

		m.findElementByIdAndClick("quickadd_button");
		// top quickadd product (kitchen)
		List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");

		System.out.println("element" + element1.size());
		element1.get(0).click();

		m.findElementByXpathAndClick(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");

		m.findElementByIdAndClick("button4");
		m.findElementByIdAndClick("button8");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageButton");

		WebElement el3 = (WebElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
		el3.click();
		m.findElementByIdAndClick("quickadd_weight2kg_button");
		m.findElementByIdAndClick("quickadd_button");

		WebElement el4 = (WebElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
		el4.click();
		m.findElementByIdAndClick("button8");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByIdAndClick("offers_button");
		m.findElementByXpathAndClick(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.ImageView");
		m.findElementByXpathAndClick(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[3]/android.widget.ImageView");
		m.findElementByXpathAndClick(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[5]/android.widget.ImageView");
		System.out.println("quick ADD AND best offer product bill done");

		m.findElementByIdAndClick("view_details_layout");
		m.findElementByIdAndClick("invoice_bill_button");
		m.findElementByIdAndClick("payment_bill_imageview");
		m.findElementByIdAndClick("send_sms_check");
		System.out.println("sms sent");
		m.findElementByIdAndClick("android:id/button1");
		System.out.println("Make bills test case passed");
	}


	@Test(priority = 6)
	public void Otherbill() {

		m.findElementByIdAndSendKeys("customer_search_edittext", "shipra");
		m.findElementByIdAndClick("search_customername_textview");

		m.findElementByIdAndClick("quickadd_button");

		WebElement el = (WebElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.ImageView");
		el.click();
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("buttonenter");

		WebElement e2 = (WebElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
		e2.click();
		m.findElementByIdAndClick("quickadd_product_imageview");
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		WebElement e3 = (WebElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ImageView");
		e3.click();
		m.findElementByIdAndClick("quickadd_product_imageview");
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		WebElement e4 = (WebElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView");
		e4.click();
		m.findElementByIdAndClick("quickadd_product_imageview");
		m.findElementByIdAndClick("button3");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByIdAndClick("view_textview");
		m.findElementByIdAndClick("invoice_bill_button");
		m.findElementByIdAndClick("payment_bill_imageview");
		m.findElementByIdAndClick("send_sms_check");
		System.out.println("sms sent");
		m.findElementByIdAndClick("android:id/button1");
		System.out.println("Other bills created");

	}

	@Test(priority = 7)
	public void bestoffer() {
		// m.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.ListView");
		m.findElementByIdAndClick("offers_button");
		m.findElementByIdAndClick("product_imageview");
		m.findElementByIdAndClick("bill_productquantity_textview");
		m.findElementByIdAndClick("button3");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByIdAndClick("view_textview");
		m.findElementByIdAndClick("payment_bill_imageview");
		m.findElementByIdAndClick("android:id/button1");
		System.out.println("best offer product bill done");

	}

	@Test(priority=8,groups = {"Sanity-tset"})
	public void syncbills() throws InterruptedException {
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Backup Summary\"]");
		m.findElementByIdAndClick("refresh_dialog");

		m.wait(50, TimeUnit.SECONDS);

		m.findElementByIdAndClick("refresh_dialog");

		m.wait(30, TimeUnit.SECONDS);

		m.findElementByIdAndClick("close_dialog");

		System.out.println("close");
	}

	// ldb and gdb products mixed bills

	@Test(priority=9,groups = {"Sanity-tset"})
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
		// m.findElementByIdAndClick("positiveButton");

		m.findElementByIdAndClick("negativeButton");

		System.out.println("pass");
//		Thread.sleep(1000);
	}

	@Test(priority = 10)
	public void logout() throws Exception {
		m.findElementByXpathAndClick("//android.widget.ImageView[@content-desc=\"More options\"]");
		m.scrollAndClick("Logout");
		m.findElementByIdAndClick("positiveButton");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("logout done");

	}

	@Test(priority=11)
	public void Relogin() throws Exception {

		m.findElementByIdAndSendKeys("etUserName_login", "admin");
		m.findElementByIdAndSendKeys("etPassword_login", "admin");
		m.findElementByIdAndClick("btnLogin");
		System.out.println("Login done");
		m.findElementByIdAndSendKeys("et100", "1");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("opening cash given");
		m.wait(30, TimeUnit.SECONDS);
//		Makebills();
//		Otherbill();
		logout();

	}

//	@Test(priority = 15)
//	public void quickaddAndbestofferproducts() throws Throwable {
//
//		syncbills();
//		logout();

	}

