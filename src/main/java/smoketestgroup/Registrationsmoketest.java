package smoketestgroup;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Registrationsmoketest {

	private static final String WebElement = null;
	public static AndroidDriver<WebElement> driver;
	public MethodClass m;

	public Registrationsmoketest() {

	}

	@Test(priority = 1)
	public void Launchapp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("DeviceName", "HUAWEI MediaPad T5");
		cap.setCapability("Udid", "VQTBB20821101069");
		cap.setCapability("platformName", "Android");
		cap.setCapability("PlatformVersion", "8.0.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability("appPackage", "com.snapbizz.snapbillingv2");
		cap.setCapability("appActivity", "com.snapbizz.snapbilling.activity.BillingSplashscreenActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, cap);
		MethodClass m = new MethodClass(driver);
		System.out.println("App started. registration...");
		String allow = "com.android.packageinstaller:id/permission_allow_button";
		m.allowAndClick(allow);
		m.allowAndClick(allow);
		m.wait(30, TimeUnit.SECONDS);
        Registerstore();
		m.wait(30, TimeUnit.SECONDS);
		Login();

	}

	@Test(priority = 2)
	public void Registerstore() {

		//17055 store id
		m.findElementByIdAndSendKeys("store_phone_no_edittext", "8775678755");              
		m.findElementByIdAndClick("ok_button");
		m.findElementByIdAndSendKeys("otp_edittext", "741316");
		m.findElementByIdAndClick("ok_button");
//		m.findElementByIdAndClick("multipos_client_switch");
//		m.findElementByIdAndClick("registration_type_value");
		
//		List<WebElement> elements = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
//				for(WebElement element : elements) {
//		if(element.getText().equals("New store")) {
//		element.click();
//		break;
//		}
//		}
     
		m.scrollAndClick("Terms and Conditions");
		m.findElementById("agreement_textvw");
		m.findElementByIdAndClick("btn_agree");
		m.findElementByIdAndClick("btn_accept");
		System.out.println("store registered");
		
		

	}

	@Test(priority = 3)

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
//	@Test (priority=4)
//	public void multipos() throws Throwable {
//		m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"More options\"]");
//		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Settings\"]");
//		m.findElementByXpathAndClick("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]");
//		
//		m.findElementByXpathAndClick(
//				"//android.widget.LinearLayout[@content-desc=\"SnapBillingV2, Navigate home\"]/android.widget.FrameLayout/android.widget.ImageView");
//		
//		Thread.sleep(1200000);
//	}

	@Test(priority = 4) // ldb and gdb products mixed bills
	public void Makebills() {

		
		for(int i=0;i<=5;i++) {
		m.findElementByIdAndSendKeys("customer_search_edittext", "vert");
		m.findElementByIdAndClick("search_customername_textview");

		m.findElementByIdAndClick("quickadd_button");
		// top quickadd product (kitchen)
		List<WebElement> element1 = (List<WebElement>) driver.findElementsByXPath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout");

		System.out.println("element" + element1.size());
		element1.get(0).click();

		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Food\"]");

		m.findElementByIdAndClick("button4");
		m.findElementByIdAndClick("button8");
		m.findElementByIdAndClick("buttonenter");

		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Home Care\"]");

		m.findElementByIdAndClick("button2");
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("buttonenter");
//		m.findElementByXpathAndClick(
//				"//android.widget.LinearLayout[@content-desc=\"SnapBillingV2, Navigate home\"]/android.widget.FrameLayout/android.widget.ImageView");
		WebElement el3 = (WebElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Dals & Pulses\"]");
		el3.click();
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"urad daal\"]");

		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");

		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Masoor daal\"]");
		m.findElementByIdAndClick("quickadd_weight1kg_button"); 
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Toor daal\"]");
		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");


		m.findElementByXpathAndClick(
				"//android.widget.LinearLayout[@content-desc=\"SnapBillingV2, Navigate home\"]/android.widget.FrameLayout/android.widget.ImageView");
		
		WebElement el4 = (WebElement) driver
				.findElementByXPath("//android.widget.TextView[@text=\"Butter, Fresh Cream, Etc\"]");
		el4.click();
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"butter\"]");

		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Ghee\"]");
		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"white butter\"]");

		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");


		m.findElementByXpathAndClick(
				"//android.widget.LinearLayout[@content-desc=\"SnapBillingV2, Navigate home\"]/android.widget.FrameLayout/android.widget.ImageView");
		WebElement el5 = (WebElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Cooking Oils\"]");
		el5.click();
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"coconut oil\"]");
		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"sesame oil\"]");
		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Mustard oil\"]");
		m.findElementByIdAndClick("button1");
		m.findElementByIdAndClick("buttonenter");
		
//		// Best offers Gdb products

		m.findElementByIdAndClick("offers_button");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Tetley Green Tea\"]");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Surf Excel Washing Powder 10/-\"]");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Nestle Milkmaid\"]");
		m.findElementByIdAndClick("view_details_layout");
		m.findElementByIdAndClick("invoice_bill_button");
		m.findElementByIdAndClick("payment_bill_imageview");
//		m.findElementByIdAndClick("send_sms_check");
//		System.out.println("sms sent");
//		m.findElementByIdAndClick("send_email_check");
		m.findElementByIdAndClick("android:id/button1");
		System.out.println("quick ADD AND best offer product bill done");
		}
	}

	// ldb and gdb products mixed bills

	@Test(priority = 6)
	public void Otherbill() {
		for(int j=0;j<=5;j++) {

		m.findElementByIdAndSendKeys("customer_search_edittext", "vert");
		m.findElementByIdAndClick("search_customername_textview");

		m.findElementByIdAndClick("quickadd_button");

		WebElement el = (WebElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Bathroom\"]");
				el.click();
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("button5");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByIdAndClick("view_details_layout");
		m.findElementByIdAndClick("cash_clear_button");
		m.findElementByIdAndClick("invoice_bill_button");
		m.findElementByIdAndClick("payment_bill_imageview");
//		m.findElementByIdAndClick("send_sms_check");
//		System.out.println("sms sent");
		m.findElementByIdAndClick("android:id/button1");
		System.out.println("Other bills created");
	}
	}

	@Test(priority = 7)
	public void bestoffer() {
		m.findElementByIdAndClick("offers_button");
		m.findElementByIdAndClick("product_imageview");
		m.findElementByIdAndClick("bill_productquantity_textview");
		m.findElementByIdAndClick("button3");
		m.findElementByIdAndClick("buttonenter");
		m.findElementByIdAndClick("view_details_layout");
		m.findElementByIdAndClick("payment_bill_imageview");
		m.findElementByIdAndClick("android:id/button1");
		System.out.println("best offer product bill done");

	}

	@Test(priority = 8)
	public void syncbills() throws InterruptedException {
		m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"More options\"]");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Backup Summary\"]");
		m.findElementByIdAndClick("refresh_dialog");

		Thread.sleep(40000);

		m.findElementByIdAndClick("refresh_dialog");
		
		Thread.sleep(10000);
		m.findElementByIdAndClick("refresh_dialog");

		m.findElementByIdAndClick("close_dialog");

		System.out.println("close");
	}

	@Test(priority = 9)
	public void Savedb() throws InterruptedException {
		m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"More options\"]");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Settings\"]");
		m.scrollAndClick("Database Backup");
		
		Thread.sleep(3000);
		m.findElementByIdAndClick("btnSelectFolder");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"Android\"]");
		m.findElementByXpathAndClick("//android.widget.TextView[@text=\"data\"]");
		m.scrollAndClick("Snapbizz");


		
		m.findElementByIdAndClick("nnf_button_ok");
		m.findElementByIdAndClick("btnSave_dbBackUpSettings");
		System.out.println("database clicked");
		// after saving db restart app
		// m.findElementByIdAndClick("positiveButton");

//		m.findElementByIdAndClick("negativeButton");

	}

	@Test(priority = 10)
	public void logout() throws Exception {
		m.findElementByXpathAndClick("//android.widget.ImageButton[@content-desc=\"More options\"]");
		m.scrollAndClick("Logout");
		m.findElementByIdAndClick("positiveButton");
		m.findElementByIdAndClick("btnSubmit");
		System.out.println("logout done");

	}

//	@Test(priority = 11)
//	public void Relogin() throws Exception {
//
//		m.findElementByIdAndSendKeys("etUserName_login", "admin");
//		m.findElementByIdAndSendKeys("etPassword_login", "admin");
//		m.findElementByIdAndClick("btnLogin");
//		
//		m.findElementByIdAndSendKeys("et100", "1");
//		m.findElementByIdAndClick("btnSubmit");
//		System.out.println("opening cash given");
//		m.wait(30, TimeUnit.SECONDS);
//		

	}


