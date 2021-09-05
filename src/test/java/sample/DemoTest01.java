package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest01 {
	
	@Test
	
	public void testCase_001() {
		
		System.out.println("This is test case 001");
	}
	
	@Test
	
	public void testCase_002() {
		
		System.out.println("This is test case 002");
	}


	@Test
	
	public void testCase_003() {
		
		System.out.println("This is test case 003");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods= {"testCase_003"})
	
	public void testCase_004() {
		
		System.out.println("This is test case 004");
	}
}
