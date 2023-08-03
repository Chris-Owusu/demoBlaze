package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class first extends BaseTest {
	
	@Test
	public void first() {
		 driver.findElement(By.xpath(loc.getProperty("laptops"))).click();
	}
}
