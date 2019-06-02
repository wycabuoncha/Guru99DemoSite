package test;

import org.testng.annotations.Test;

import pages.Gtpl_Bank_Login_Page;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Gtpl_Bank_Login {
	WebDriver driver;
	Gtpl_Bank_Login_Page loginObject;
	private String _username = "mngr198962" ;
	private String _password = "EhehArU" ;
	
	  @BeforeTest  
	  public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\OnchariWycliffe\\git\\repository_ToolsQADemoSite\\ToolsQADemoSite\\drivers\\geckodriver.exe");
		
	    driver = new FirefoxDriver();
	   
	  }
	 
	  @Test (priority=1)
	  public void Login_to_Gtpl_Bank() {
	    driver.get("http://demo.guru99.com/V1/index.php");
	    driver.manage().window().setSize(new Dimension(1318, 794));
	    loginObject = new Gtpl_Bank_Login_Page(driver);
	    loginObject.enterUsername(_username);
	    loginObject.enterPassword(_password);
	    loginObject.clickLoginBtn();
	    
	    //Verify home page

	  }
	  
	  
	  @Test (priority=2)
	  public void Verify_Whether_Gtpl_Bank_Dashboard_is_Correct() {
		  Assert.assertEquals(driver.getTitle(), "GTPL Bank Manager HomePage");
		  Assert.assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/V1/html/Managerhomepage.php");
	  }
	  
	  @Test (priority=3)
	  public void Logout_of_Gtpl_Bank() {
		  driver.findElement(By.linkText("Log out")).click();
	  }
	 
 

  @AfterTest
  public void tearDown() {
	  System.out.println("......Quiting all browser.......");
    driver.quit();
  }

}
