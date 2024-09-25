package project_spicejet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import project_spicejet.UtilsClass;

public class BaseClass extends UtilsClass {
	
	@BeforeMethod
	public void start() {
		
		browserLaunch(getProperties("browser"));
		launchUrl(getProperties("url"));
		
		
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
		
	}
	
	
}