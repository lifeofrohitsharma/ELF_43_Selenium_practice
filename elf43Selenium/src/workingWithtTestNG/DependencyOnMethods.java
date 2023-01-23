package workingWithtTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyOnMethods {

	@Test(dependsOnMethods = "register")
	public void create() {
		Reporter.log("create method");
	}

	@Test
	public void register() {
		Reporter.log("register method");
	}

	@Test(dependsOnMethods = { "create", "register" })
	public void update() {
		Reporter.log("update method");
	}

	@Test(dependsOnMethods = { "create", "register" })
	public void modify() {
		Reporter.log("modify method");
	}

	@Test(dependsOnMethods = { "create" })
	public void delete() {
		int i = 1 / 0;
		Reporter.log("delete method");
	}
}