package rerunfailedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Inside test 1");
	}
	@Test(retryAnalyzer = rerunfailedtestcases.RetryAnalyzer.class )
	public void test2()
	{
		System.out.println("Inside test 2");
		int i=1/0;
	}
	@Test
	public void test3()
	{
		System.out.println("Inside test 3");
		Assert.assertTrue(0>1);
	}



}
