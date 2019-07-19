package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sainora {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\GitBranch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtU = driver.findElement(By.id("email"));
		txtU.sendKeys("keerthana@gmail.com");
		
		
		WebElement txtP = driver.findElement(By.id("pass"));
		txtP.sendKeys("Welcome123");
		
		String name = txtU.getAttribute("value");
		System.out.println(name);
		
		String pass = txtP.getAttribute("value");
		System.out.println(pass);

	}

}
