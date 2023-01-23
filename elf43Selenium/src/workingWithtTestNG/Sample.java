package workingWithtTestNG;

import org.testng.annotations.Test;

public class Sample {

	@Test(priority = 1)
	public void createAccount() {
		System.out.println("Create Account");
	}

	@Test
	public void readAccount() {
		System.out.println("Read Account");
	}

	@Test
	public void updateAccount() {
		System.out.println("update Account");
	}

	@Test(priority = 2)
	public void deleteAccount() {
		System.out.println("delete Account");
	}
}
