package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	//contacts
	
	@Before(value="@RegressionTest", order=1)
		public void readfrompropWIN()
		{
			System.out.println("read from property WIN");
		}
	
	@Before(value="@RegressionTest", order=2)
		public void initializeDBWIN()
		{
			System.out.println("DataBase WIN");
		}
	
	@Before(value="@SmokeTest", order=1)
	public void readfrompropMAC()
	{
		System.out.println("read from property MAC");
	}

@Before(value="@SmokeTest", order=2)
	public void initializeDBMAC()
	{
		System.out.println("DataBase MAC");
	}
		
	
	//@Before(order=1)
	public void readfromprop()
	{
		System.out.println("read from property file");
	}

	//@Before(order=2)
	public void initializeChrome()
	{
		System.out.println("chrome browser");
	}
	
	//@Before(order=3)
	public void initializeDB()
	{
		System.out.println("DatBase");
	}
	
	
	//@After
	//public void teardown()
	//{
	//	System.out.println("After each scenario");
	//}
	@Given("user must have logged in")
	public void user_must_have_logged_in() {
		
	System.out.println("User must have looged in");
	   
	}
	@When("user create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User must have created new contact");
	}


	
	@When("user view contact details")
	public void user_view_contact_details() {
		System.out.println("User must have viewed new contact");
	}

	
	@When("user edit contact details")
	public void user_edit_contact_details() {
		System.out.println("User must have edited contact");
	}

	
	@When("user delete contact")
	public void user_delete_contact() {
		System.out.println("User must have deleted contact");
	}


//Deals

	

	
	@When("user create a new Deals")
	public void user_create_a_new_deals() {
		System.out.println("User must have created new deal");
	}


	
	@When("user view Deals details")
	public void user_view_deals_details() {
		System.out.println("User must have viewed new deal");
	}


	
	@When("user edit Deals details")
	public void user_edit_deals_details() {
		System.out.println("User must have edited deal");
	}

	
	@When("user delete Deals")
	public void user_delete_deals() {
		System.out.println("User must have deleted deal");
	}

//Tasks
	
	
	@When("user create a new Tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User must have created new Task");
	}


	
	@When("user view Tasks details")
	public void user_view_Tasks_details() {
		System.out.println("User must have viewed Task");
	}

	
	@When("user edit Tasks details")
	public void user_edit_tasks_details() {
		System.out.println("User must have edited Task");
	}

	
	@When("user delete Tasks")
	public void user_delete_tasks() {
		System.out.println("User must have deleted Task");
	}








}
