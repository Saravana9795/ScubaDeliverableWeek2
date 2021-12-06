package TestNGPackage;

import org.testng.annotations.Test;

public class Grouping {
	@Test (groups = "football")
	public void football() {
		System.out.println("I am playing football");
	}

	@Test(groups = "Cricket")
	public void cricket() {
		System.out.println("I am playing Cricket");
	}

	@Test(groups = "Tennis")
	public void tennis() {
		System.out.println("I am playing Tennis");	
	}
}
