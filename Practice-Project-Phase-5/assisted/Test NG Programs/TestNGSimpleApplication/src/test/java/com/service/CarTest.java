package com.service;

import org.testng.annotations.Test;

public class CarTest {
	@Test(groups= {"speed"})
	  public void speed() {
		  System.out.println("Car Speed test");
	  }
	  
	  @Test
	  public void milage() {
		  System.out.println("Car milage test");
	  }
	  
	  @Test
	  public void color() {
		  System.out.println("Car Color is red");
	  }
}
