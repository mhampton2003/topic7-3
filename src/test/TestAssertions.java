package test;

import org.junit.Test;

import junit.framework.Assert;

public class TestAssertions {
	
	/**
	 * runs different methods of testing
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAssertions() {
		//test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };
		
		Integer[] test = {1, 2, 3};
		Integer[] test2 = {1, 2, 3};
		
		//check that two objects are equal
		Assert.assertEquals(str1, str2);
		
		//check that a condition is true
		Assert.assertTrue(val1 < val2);
		
		//check that a condition is false
		Assert.assertFalse(val1 > val2);
		
		//check that an object isn't null
		Assert.assertNotNull(str1);
		
		//check that an object is null
		Assert.assertNull(str3);
		
		//check if two object references point to the same object
		Assert.assertSame(str4, str5);
		
		//check if two object references do not point to the same object
		Assert.assertNotSame(str1, str3);
		
		//check whether two arrays are equal to each other
		Assert.assertEquals(expectedArray, resultArray);
	}

}
