package listeners;

import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class TestNGListeners implements ITestListener {

	public  void onTestStart(ITestResult result) {
		System.out.println("*****Test Started : "+result.getName());
	  }
	
	  public void onTestSuccess(ITestResult result) {
	    System.out.println("*****Test is successful : "+result.getName());
	  }

	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("*****Test failed : "+result.getName());
	  }

	 
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("*****Test Skipped : "+result.getName());
	  }

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	  public void onFinish(ITestContext context) {
		  System.out.println("*****Tests completed : "+context.getName());
	  }

}
