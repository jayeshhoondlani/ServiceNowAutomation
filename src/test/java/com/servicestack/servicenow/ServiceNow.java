package com.servicestack.servicenow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ServiceNow {
	//static String driverPath = "‪C:\\Users\\Niraj\\Downloads\\chromedriver_win32";
	public WebDriver driver;
	@BeforeClass
	public void testSetup()
	{
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://dev12506.service-now.com/");
		
		
	}
	
/*	@Test
	public void testLogin() throws Exception{
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("QtqASxV4aJys");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("gsft_nav");
		driver.findElement(By.linkText("Incidents")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_new")).click();
		driver.findElement(By.id("incident.short_description")).sendKeys("JDBC Exception");
		driver.findElement(By.id("sysverb_insert")).click();
		String Incident = driver.findElement(By.xpath(".//html/body/div[1]/div/span/div/div[5]/table[1]/tbody/tr/td/div/table/tbody/tr[1]/td[3]/a")).getText();
		System.out.println(Incident);
		System.out.println("2");
	}
	*/
	
	@Test
	public void testKnowledge() throws Exception
	{
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("QtqASxV4aJys");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("gsft_nav");
		driver.findElement(By.id("filter")).sendKeys("knowledge");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create New")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sys_display.kb_knowledge.kb_knowledge_base")).sendKeys("IT");
		driver.findElement(By.id("kb_knowledge.short_description")).sendKeys("Exception");
		Thread.sleep(10000);
		driver.findElement(By.id("sysverb_insert")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("KB0010005")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("publish_knowledge")).click();
		driver.findElement(By.linkText("KB0010005")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Requested")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("approve")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("retire")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("KB0010005")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Requested")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("approve")).click();
		
	}
	
}
