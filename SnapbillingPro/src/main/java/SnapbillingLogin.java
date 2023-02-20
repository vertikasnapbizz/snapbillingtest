

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import test.Registration;


public class SnapbillingLogin  {
	
	
	public static void main(String[] args) {
		
		try {
			opensnapbilling();
			
		} catch (Exception e) {
			System.out.println("error" +e.getMessage());
			System.out.println("error cause" +e.getCause());
			e.printStackTrace();
		}
	
	}
	public static void opensnapbilling() throws Exception
	{
		System.out.println("App started....");
		
		Registration r = new Registration();
		r.Launchapp();
//		r.Registerstore();
		
	}
}