package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	
	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
	public void Sample()
	{
		Assert.fail();
		System.out.println("Hi");
	}
	

}
