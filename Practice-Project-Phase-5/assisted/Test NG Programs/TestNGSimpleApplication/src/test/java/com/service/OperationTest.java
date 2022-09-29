package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.service.Operation;

public class OperationTest {

  @Test
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result1=op.add(100,200);
	  assertEquals(result1, 300 );
  }

  @Test
  @Ignore		//same as @Disable annotation in JUnit
  public void divideTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result2=op.divide(20,10);
	  assertEquals(result2, 5 );
  }

  @Test
  public void multiplyTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result3=op.multiply(10,20);
	  assertEquals(result3, 200 );
  }

  @Test
  public void subtractTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result4=op.subtract(100,200);
	  assertEquals(result4, -100 );
  }
}
