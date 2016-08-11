/**
 * 
 */
package com.earn.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.earn.pages.Login;

/**
 * @author prasanta_sahoo
 *
 */
public class VerifyEarnLogin 
{
	
	@Test
	public void validlogin()
	{
   //WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Data_Backups\\Jars\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://starter.earn.org/login");
    
       Login log= new Login(driver);
    log.loginvalidation("earn@org", "Temp1234");
      driver.quit();
}
}



