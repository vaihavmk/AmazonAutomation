package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:format"},

features = "C:\\\\Users\\\\Vaibhav\\\\eclipse-workspace\\\\Amazon order\\\\src\\\\Feature\\\\order.feature",glue={"Step_Definition"})
public class YourClass {

}