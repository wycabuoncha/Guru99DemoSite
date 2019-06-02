package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gtpl_Bank_Login_Page {

	By username = By.name("uid");
	By password = By.name("password");
	
	WebDriver driver;
	public Gtpl_Bank_Login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
		
	public void enterUsername(String usernm) {
		System.out.println("...Entering Username ...........");
	    driver.findElement(username).sendKeys(usernm);
	 }
	
	public void enterPassword(String pass) {
		 System.out.println("...Entering password ...........");
		    driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		System.out.println("...Clicking login button.........");
	    driver.findElement(By.name("btnLogin")).click();
	}
}
