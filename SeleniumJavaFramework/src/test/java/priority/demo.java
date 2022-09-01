package priority;

import org.testng.annotations.Test;

public class demo {

	@Test(priority=1)
	public void test1()
	{
		System.out.println("Inside test 1");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Inside test 2");
	}
	@Test(priority=0)
	public void test3()
	{
		System.out.println("Inside test 3");
	}
}
