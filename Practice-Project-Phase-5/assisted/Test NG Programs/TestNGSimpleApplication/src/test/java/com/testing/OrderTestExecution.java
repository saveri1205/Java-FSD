package com.testing;

import org.testng.annotations.Test;

public class OrderTestExecution {
  @Test(priority=1)
  public void b() {
	  System.out.println("b testing");
  }
  
  @Test(priority=2)
  public void a() {
	  System.out.println("a testing");
  }
  
  @Test(priority=3)
  public void c() {
	  System.out.println("c testing");
  }
  
  @Test(priority=4)
  public void d() {
	  System.out.println("d testing");
  }
}
