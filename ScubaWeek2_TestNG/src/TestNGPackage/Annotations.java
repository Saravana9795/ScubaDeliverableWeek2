package TestNGPackage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void testNG() {
		System.out.println("Saravana Kumar");
	}

	@BeforeMethod
	public void testNG1() {
		System.out.println("Saravana Kumar1");
	}

	@Test
	public void testNG2() {
		System.out.println("Saravana Kumar2");
	}

	@Test
	public void testNG3() {
		System.out.println("Saravana Kumar3");
	}
}
