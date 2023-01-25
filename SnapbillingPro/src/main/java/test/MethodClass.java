package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class MethodClass {
	public static AndroidDriver<WebElement> driver;
	public MethodClass(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	
	public static void main(String[] args) {
		
		System.out.println("main method");
	}
	
		public static void findElementById(String string) {
			MobileElement el = (MobileElement) driver.findElementById(string);
			System.out.println("el" +el);
			  Point point = el.getLocation();
			  int x = point.x +1; 
			  int y = point.y + el.getSize().getHeight() - 1;
			  PointOption p = new PointOption();
			  new TouchAction(driver).tap(p.point(x, y)).perform();		
}
		

public static void findElementByIdAndSendKeys(String string, String string1) {
	 driver.findElementById(string).sendKeys(string1);
	
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


public void wait(int timeoutMillis, TimeUnit timeUnit) {
	driver.manage().timeouts().implicitlyWait(timeoutMillis, timeUnit);	
}


public void allowAndClick(String string) {
	driver.findElement(By.id(string)).click();	
}

public static void findElementByXpathAndSendKeys(String string, String string2) {
	driver.findElementByXPath(string).sendKeys(string2);
}


public void findElementsByXPath(String string) {
	driver.findElementByXPath(string);
	// TODO Auto-generated method stub
	
}

//public void selectByvisibletext(String string) {
//	driver.
//}

public void findElementsById(String string) {
	driver.findElementsById(string);
	// TODO Auto-generated method stub
	
}
}


