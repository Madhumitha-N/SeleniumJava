package ignoretests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {
	
	@Ignore
	
	@Test
	public void test1()
	{
		System.out.println("Inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Inside test 2");
	}

}
