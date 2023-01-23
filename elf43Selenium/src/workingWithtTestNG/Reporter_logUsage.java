package workingWithtTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_logUsage {

	@Test
	public void manual() {
		Reporter.log("manual mock done", true);
	}

	@Test(priority = 1)
	public void java() {
		Reporter.log("java mock pending", true);
	}

	@Test
	public void selenium() {
		Reporter.log("selenium training undergoing ", true);
	}

	@Test(priority = 'A')
	public void api() {
		Reporter.log("API mock pending ", true);
	}
}
