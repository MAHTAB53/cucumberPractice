package StepDefinitions;

import java.util.Scanner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddTwoNumsStepsDefs {
	int x=0;
	int y=0;
	int z=0;
	@Given("^User enters two numbers$")
	public void user_enters_two_numbers() throws Throwable {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter first num: ");
	    x =sc.nextInt();
	    System.out.println("enter first num: ");
	    y =sc.nextInt();
	}

	@Given("^add two numbers$")
	public void add_two_numbers() throws Throwable {
	   z=x+y;
	}

	@Then("^Result is displayed$")
	public void result_is_displayed() throws Throwable {
		System.out.println("result is "+z);
	}
	
	//======
	
	@Given("^User enters two numbers(\\d+) (\\d+)$")
	public void user_enters_two_numbers(int arg1, int arg2) throws Throwable {
	    x=arg1;
	    y=arg2;
	}

	@Then("^add two numbers and Result is displayed$")
	public void add_two_numbers_and_Result_is_displayed() throws Throwable {
	    z=x+y;
	    System.out.println("Result is"+z);
	}
}
