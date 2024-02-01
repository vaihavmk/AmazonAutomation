package Step_Definition;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Page.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class login{
	loginPage logtest = new loginPage();

		@Given("^user opens the Amazon$")
		public void user_opens_the_Amazon() throws Throwable {
			logtest.f();
		}

		@Given("^user clicks on Login button$")
		public void user_clicks_on_Login_button() throws Throwable {
		    logtest.Derived();
		}

		@Then("^user enters \"(.*?)\" and clicks on next$")
		public void user_enters_and_clicks_on_next(String arg1) throws Throwable {
			logtest.email();
		    
		}

		@Then("^user verfies that he/she has logged in$")
		public void user_verfies_that_he_she_has_logged_in() throws Throwable {
		    logtest.pass();
		}


}