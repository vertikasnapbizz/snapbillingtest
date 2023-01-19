import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class MethodClass {
	 static AndroidDriver<WebElement> driver;
	public static void main(String[] args) {
		System.out.println("main method");
	}
		public void findElementById(String string, String string2) {
			MobileElement el = (MobileElement) driver.findElementById(string);
			System.out.println("el" +el);
			  Point point = el.getLocation();
			  int x = point.x +1; 
			  int y = point.y + el.getSize().getHeight() - 1;
			  PointOption p = new PointOption();
			  new TouchAction(driver).tap(p.point(x, y)).perform();		
}
		

public static void findElementByIdAndSendKeys(String string, String i) {
	 driver.findElementById(string).sendKeys(i);
	
}

public static void findElementByIdAndClick(String string) {
	 driver.findElementById(string).click();
}

public static void scrollAndClick(String visibleText) {
     
driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\"))");
        
}

public  static void findElementByClassNameAndClick(String string) {
	driver.findElementByClassName(string).click();
}

public static void findElementByXpathAndClick(String string) {
	driver.findElementByXPath(string).click();
}

public void findElementByIdandtext(String string, String string2) {
	MobileElement ele = (MobileElement) driver.findElementById(string);
	System.out.println("ele" +ele);
	  Point point = ele.getLocation();
	  int x = point.x +5; 
	  int y = point.y + ele.getSize().getHeight() - 6;
	  PointOption p = new PointOption();
	  new TouchAction(driver).tap(p.point(x, y)).perform();
	  }



	}


