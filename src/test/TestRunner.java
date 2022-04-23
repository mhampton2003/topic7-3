package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Maya
 */
public class TestRunner {

	/**
	 * prints if tests pass or fail
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestAssertions.class);
		
		//if test failed:
		for (Failure failure : result.getFailures()) {
			System.out.println("A JUnit test failed: " + failure.toString());
		}
		//if test passed
		System.out.println("The JUnit Tests " + (result.wasSuccessful() ? "Passed" : "Failed"));
	}

}
