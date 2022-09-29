package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Saveri\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		wd.get("file:///C:/Users/Admin/Desktop/Saveri/Java/programs/Java%20Phase%205/login.html");
//		String sourcePagePath=wd.getCurrentUrl();
//		System.out.println(sourcePagePath);
//		WebElement emailIdRef=wd.findElement(By.id("n1"));
//		WebElement passwordRef=wd.findElement(By.id("n2"));
//		
//		emailIdRef.sendKeys("Saveri@gmail.com");
//		passwordRef.sendKeys("123");
//		
//		//Submit button
//		WebElement submitButtonRef=wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		String targetPagePath=wd.getCurrentUrl();
//		System.out.println(targetPagePath);
//		WebElement h2TagRef=wd.findElement(By.tagName("h2"));
//		System.out.println(h2TagRef.getText());
//		
//		//Reset button
////		WebElement resetButtonRef=wd.findElement(By.id("b2"));
////		resetButtonRef.click();
		
		//email validation
		WebElement emailIdRef=wd.findElement(By.id("n1"));
		WebElement passwordRef=wd.findElement(By.id("n2"));
		
		emailIdRef.sendKeys("Saveri@gmail.com");
		passwordRef.sendKeys("123");
		
		WebElement submitButtonRef=wd.findElement(By.id("b1"));
		submitButtonRef.click();
		
		Alert alertRef=wd.switchTo().alert();
		System.out.println(alertRef.getText());
		alertRef.accept();
		//wd.close();
	}
}
