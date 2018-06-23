package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\eclipse\\chromedriver.exe");

		// Initialize browser
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		d.findElement(By.id("identifierId")).sendKeys("balajipusuluri26@GMAIL.COM");
		;
		d.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		d.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("googlegoogle");
		d.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();

	}
}
