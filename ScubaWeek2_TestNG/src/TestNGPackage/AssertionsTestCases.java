package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionsTestCases {
	@Test
	public void testPass() 
	{
		Assert.assertTrue(false);
	}

	@Test
	public void testFail() 
	{
		Assert.assertFalse(false);
	}


}
