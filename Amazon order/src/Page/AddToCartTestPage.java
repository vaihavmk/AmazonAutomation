package Page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import BaseClass.BaseClass;
import Resources.Xpath;

public class AddToCartTestPage extends BaseClass {
	Xpath xpath1 = new Xpath();
   
	public void search() {
		driver.findElement(By.id(xpath1.ID_Search)).sendKeys("Nike Bags");
	}
	
	public void Result() {
		driver.findElement(By.id(xpath1.ID_Search)).sendKeys("Nike Bags");
	}
	public void Enter() {
		driver.findElement(By.id(xpath1.ID_Enter)).click();
	}
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    driver.findElement(By.xpath(xpath1.item)).click();

	}
	public void AddtoKartClick() {
		String currentTab = driver.getWindowHandle();
	    Set<String> tabs = driver.getWindowHandles();

	    for (String tab : tabs) {
	        if (!currentTab.equals(tab)) {
	            driver.switchTo().window(tab);
	        }
	    }

	    driver.findElement(By.xpath(xpath1.addtoKart)).click();
		
	}
	public void AddtoKart() {
		
	}

}
