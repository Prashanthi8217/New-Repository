package Sample;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions{
	@Test
	public void strictComparisonSoftAssert()
	{
		String expectedValue="raja";
		String actualValue="Raja";
		SoftAssert s =new SoftAssert();
		System.out.println("Strict comparison soft assertion completed");
		s.assertAll();
	}
	@Test
	public void containsComparisonsoftassert()
	{
		String expectedValue="corn";
		String actualValue="babycorn";
		SoftAssert s =new SoftAssert();
		s.assertFalse(actualValue.contains(expectedValue));
		System.out.println("Contains comparison soft assert completed");
		s.assertAll();
	}

}


