package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import testbase.TestBase;


public class HomePageTest extends TestBase{

HomePage home=new HomePage();
	
	@BeforeTest
	public void setup(){
		initialization();
	}
	
	@Test
	public void run(){
		home=new HomePage();
		home.JioCinemaHeader.click();
		
	 }
	
	@AfterTest
	public void end(){
		
		driver.quit();
	}

}
