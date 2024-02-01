package Page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import BaseClass.BaseClass;
import Resources.Xpath;

public class OrderTestPage extends BaseClass {
	Xpath xpath1 = new Xpath();
	
	public void cartclick() {
		driver.findElement(By.xpath(xpath1.cartbuttontop)).click();
	}
	public void orderclick() {
		driver.findElement(By.xpath(xpath1.order)).click();
		
	}

}
