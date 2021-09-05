package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest02 {
	
    @Test
	
	 public void testCase_005() {
		
		System.out.println("This is test case 005");
	}

@Test
	
	public void testCase_006() {
		
		System.out.println("This is test case 006");
	}
    
    @Test

    public void testCase_007() {
	
	System.out.println("This is test case 007");
	
	Assert.assertTrue(false);
}

    @Test(dependsOnMethods= {"testCase_007"})

    public void testCase_008() {
	
	System.out.println("This is test case 008");
}


}
