package TestNGPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener {
  
  @Override
  public void onTestStart(ITestResult result) {
 
  }
  
  @Override
  public void onTestSuccess(ITestResult result) {
	  System.out.println("Reason for success are : "+result.getName());
  }

  @Override
  public void onTestFailure(ITestResult result) {
	  System.out.println("Reason for failure are : "+result.getName());
  }
}
