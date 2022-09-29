package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Saveri\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://127.0.0.1:5500/signup.html");
		
		WebElement emailIdRef=wd.findElement(By.id("name"));
		WebElement passwordRef=wd.findElement(By.id("pw"));
		
		emailIdRef.sendKeys("Saveri@gmail.com");
		passwordRef.sendKeys("123");
		
		WebElement submitButtonRef=wd.findElement(By.id("rgstr_btn"));
		submitButtonRef.click();
		
		
		Alert alertRef=wd.switchTo().alert();
		System.out.println(alertRef.getText());
		alertRef.accept();
	}
}
