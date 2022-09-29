package com.service;

import org.testng.annotations.Test;

public class BikeTest {
  @Test(groups= {"speed"})
  public void speed() {
	  System.out.println("Bike Speed test");
  }
  
  @Test
  public void milage() {
	  System.out.println("Bike milage test");
  }
  
  @Test
  public void color() {
	  System.out.println("Bike Color is red");
  }
}
