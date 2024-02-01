package Step_Definition;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import BaseClass.BaseClass; 
import Page.AddToCartTestPage;
import cucumber.api.java.en.Then;

public class AddToCartTest {
	AddToCartTestPage cart = new AddToCartTestPage();
  
		    @Then("^user click on search$")
		    public void user_click_on_search() throws Throwable {
		    	cart.search();
		        
		    }

		    @Then("^user searches for \"(.*?)\"$")
		    public void user_searches_for(String arg1) throws Throwable {
		        cart.Result();
		       
		    }

		    @Then("^User clicks on Enter$")
		    public void user_clicks_on_Enter() throws Throwable {
		        cart.Enter();
		        
		    }

		    @Then("^User scrolls down and clicks on the item$")
		    public void user_scrolls_down_and_clicks_on_the_item() throws Throwable {
		        cart.Scroll();
		        
		    }

		    @Then("^User clicks on Add to Kart$")
		    public void user_clicks_on_Add_to_Kart() throws Throwable {
		        cart.AddtoKartClick();
		        
		    }

		    @Then("^Item is added to Kart$")
		    public void item_is_added_to_Kart() throws Throwable {
		        cart.AddtoKart();
		        
		    }


}
