package org.cts.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	@Parameters({ "userName", "password" })
	@Test
	private void test1(String s1, String s2) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Java\\Practice\\Workspace\\SeleniumTasks\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement name = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		name.sendKeys(s1);

		WebElement pass = driver.findElement(By.id("amt7"));
		pass.sendKeys(s2);
	}

}
