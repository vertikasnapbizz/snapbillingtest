
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
import test.MethodClass;
import test.Registration;



public class SnapbillingLogin {
	

	static AndroidDriver<WebElement> driver;	 
	public static void main(String[] args) {
		
		
		try {
			opensnapnillingpro();
		} catch (Exception e) {
			System.out.println("error" +e.getMessage());
			System.out.println("error cause" +e.getCause());
			e.printStackTrace();
		}
	
	}
	public static void opensnapnillingpro() throws Exception
	{
		System.out.println("App started....");
		Registration r = new Registration();
		r.Launchapp();
	}
}
