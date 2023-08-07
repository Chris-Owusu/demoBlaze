package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.BaseTest;

public class Login extends BaseTest {
	
	@Test
	public void LoginCancelTest() throws InterruptedException {
		driver.findElement(By.id(loc.getProperty("loginBtn"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc.getProperty("username"))));
		driver.findElement(By.id(loc.getProperty("username"))).sendKeys("Evansadmin22");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("admin1");
		driver.findElement(By.xpath(loc.getProperty("loginCancelBtn"))).click();
	}
	
	@Test
	public void negativetiveLoginTest() {
		driver.findElement(By.id(loc.getProperty("loginBtn"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc.getProperty("username"))));
		driver.findElement(By.id(loc.getProperty("username"))).sendKeys("Evansadmin22");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("admin1");
		driver.findElement(By.xpath(loc.getProperty("loginCloseBtn"))).click();
	}
	
	@Test
	public void positiveLoginTest() {
		driver.findElement(By.id(loc.getProperty("loginBtn"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc.getProperty("username"))));
		driver.findElement(By.id(loc.getProperty("username"))).sendKeys("Evansadmin22");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("admin1");
		driver.findElement(By.xpath(loc.getProperty("loginConfirmBtn"))).click();
		System.out.println("Login Successfull...........");
	}
}
