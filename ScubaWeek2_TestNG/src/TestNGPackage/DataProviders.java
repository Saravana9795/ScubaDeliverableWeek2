package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider(name="games")
	public Object[][] getData() {
		return new Object[][] {
			{"Football","Messi"},
			{"Cricket","Dhoni"},
			{"F1","Hamilton"}

		};
	}

	@Test(dataProvider = "games")
	public void method(String games1, String games2) {
		System.out.println("games1: " + games1);
		System.out.println("games2: " + games2);
	}



}
