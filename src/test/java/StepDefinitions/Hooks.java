package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setup() {
		System.out.println("Before block of code");
		
	}
	@After
	public void teardown() {
		System.out.println("After block of code");
	}
}
