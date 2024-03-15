package TestNGprograms;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Annotations {

@Test 
	public void softAssert() {
	SoftAssert softAssertion = new SoftAssert();
	System.out.println("softAssert Method was started");
	softAssertion.assertEquals("test",  "test1");
	System.out.println("softAssert Method was executed");
	softAssertion.assertAll();
	
}
@Test
	public void hardAssert() {
	System.out.println("hardAssert Method was started");
	Assert.assertTrue(false);
	System.out.println("hardAssert Method was executed");
}
}
