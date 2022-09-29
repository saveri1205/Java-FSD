package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Saveri\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://127.0.0.1:5500/login.html");
		
		WebElement emailIdRef=wd.findElement(By.id("userName"));
		WebElement passwordRef=wd.findElement(By.id("userPw"));
		
		emailIdRef.sendKeys("Saveri@gmail.com");
		passwordRef.sendKeys("123");
		
		WebElement submitButtonRef=wd.findElement(By.id("login_btn"));
		submitButtonRef.click();
		
		Alert alertRef=wd.switchTo().alert();
		System.out.println(alertRef.getText());
		alertRef.accept();
	}
}
