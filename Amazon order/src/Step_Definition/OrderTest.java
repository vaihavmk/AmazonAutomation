package Step_Definition;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import BaseClass.BaseClass; 
import Page.OrderTestPage;
import cucumber.api.java.en.Then;

public class OrderTest {
	OrderTestPage neworder = new OrderTestPage();
	
	@Then("^User clicks on Kart button$")
	public void user_clicks_on_Kart_button() throws Throwable {
	    neworder.cartclick();
	}

	@Then("^User clicks on Orders$")
	public void user_clicks_on_Orders() throws Throwable {
	    neworder.orderclick();
	}


}
