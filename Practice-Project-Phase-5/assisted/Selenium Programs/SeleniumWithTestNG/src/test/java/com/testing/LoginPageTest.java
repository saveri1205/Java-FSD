package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginPageTest {
	WebDriver wd;
	
  @Test
  public void loginPageTest() {
	  wd.get("file:///C:/Users/Admin/Desktop/Saveri/Java/programs/Java%20Phase%205/login.html");
	  WebElement emailIdRef=wd.findElement(By.id("n1"));
	  WebElement passwordRef=wd.findElement(By.id("n2"));
		
		emailIdRef.sendKeys("Saveri@gmail.com");
		passwordRef.sendKeys("123");
		
		WebElement submitButtonRef=wd.findElement(By.id("b1"));
		submitButtonRef.click();
		
		Alert alertRef=wd.switchTo().alert();
		String result=alertRef.getText();
		alertRef.accept();
		assertEquals(result, "Login done successfully");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Saveri\\chromedriver_win32\\chromedriver.exe");
	  wd=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  wd.close();
  }

}
