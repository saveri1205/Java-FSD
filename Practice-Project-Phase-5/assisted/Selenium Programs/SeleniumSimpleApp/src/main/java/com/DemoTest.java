package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Saveri\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		wd.get("file:///C:/Users/Admin/Desktop/Saveri/Java/programs/Java%20Phase%205/index.html");
//		String titleTagContent=wd.getTitle();
//		String url=wd.getCurrentUrl();
//		String content=wd.getPageSource();
//		System.out.println(titleTagContent);
//		System.out.println(url);
//		System.out.println(content);
		
		WebElement h2TagRef=wd.findElement(By.tagName("h2"));
		WebElement pTagRef=wd.findElement(By.tagName("p"));
		WebElement divTagRef=wd.findElement(By.tagName("div"));
		System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
		System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
		System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
		
		List<WebElement>listOfpTag=wd.findElements(By.tagName("p"));
		Iterator<WebElement>ii=listOfpTag.iterator();
		while(ii.hasNext()) {
			WebElement ww=ii.next();
			System.out.println(ww.getTagName()+" "+ww.getText());
		}
		
		WebElement divTagIdRef=wd.findElement(By.id("d1"));
		System.out.println(divTagIdRef.getTagName()+" "+divTagIdRef.getText());
		wd.close();
		
	}

}
