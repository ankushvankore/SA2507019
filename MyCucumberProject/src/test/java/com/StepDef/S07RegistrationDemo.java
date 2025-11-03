package com.StepDef;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07RegistrationDemo {
	@Given("Launch the registration page")
	public void launch_the_registration_page() {
		System.out.println("Launching Registration Page");
	}

	@When("Enter following data")
	public void enter_following_data(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(dataTable);

		List<List<String>> data = dataTable.asLists();
		System.out.println(data);

		System.out.println(data.get(0).get(0));

		for (List<String> d : data) {
			System.out.println(d);
		}

		for (List<String> d : data) {
			for (String d1 : d)
				System.out.println(d1);
		}
	}

	@Then("Registration should successfull")
	public void registration_should_successfull() {
		System.out.println("Thank you for registration!!!");
	}

}
