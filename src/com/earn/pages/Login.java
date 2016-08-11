/**
 * 
 */
package com.earn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author prasanta_sahoo
 *
 */
public class Login 
{
	WebDriver driver;
	
   By Un= By.id("email");
   By Pwd= By.id("password");
   By SignIn= By.id("submit");
   
   
   public Login(WebDriver driver)
   {
	   this.driver= driver;
	   
   }
   
   public void loginvalidation(String Username,String Password)
   {
	   driver.findElement(Un).sendKeys(Username);
	   driver.findElement(Pwd).sendKeys(Password);
	   driver.findElement(SignIn).click();
   }
   	
}
