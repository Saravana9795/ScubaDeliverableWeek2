package TestNGPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class ParametersTestNG {

	@BeforeClass
	@Parameters({"Browsers","Platforms"})
	public void setUp(String browser, String platform) {
		System.out.println("1. Paramater values from XML file: " +browser);
		System.out.println("1. Paramater values from XML file: " +platform);
	}

	@Test
	@Parameters({"response"})
	public void sample(String response) throws InterruptedException {
		String[] stringArray = response.split(",");
		System.out.println("Response from XML file: " + response);
		System.out.println("StringArray[0] from XML file: "+ stringArray[0]);
		System.out.println("StringArray[1] from XML file: "+ stringArray[1]);
		
	
	}
}
