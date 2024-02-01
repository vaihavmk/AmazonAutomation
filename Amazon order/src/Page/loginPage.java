package Page;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Resources.Xpath;

public class loginPage extends BaseClass{
		Xpath xpath1 = new Xpath();
   
    
public void f() {
   	   System.setProperty("webdriver.edge.driver", "C:\\Users\\Vaibhav\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
	   driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	  
}

public void Derived() {
	   driver.findElement(By.xpath(xpath1.new1)).click();
}

public void email(){
	   driver.findElement(By.xpath(xpath1.email)).sendKeys("****");
	   driver.findElement(By.xpath(xpath1.continue1)).click();
}
public void pass() {
	   driver.findElement(By.xpath(xpath1.pass)).sendKeys("***");
	   driver.findElement(By.xpath(xpath1.submit)).click();
  }
}
