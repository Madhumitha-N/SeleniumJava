package TestNGDependencies;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("Inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Inside test 2");
		int i=1/0;
	}
	@Test
	public void test3()
	{
		System.out.println("Inside test 3");
	}


}
