package org.trainingtest;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojofb.PomFb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomadac.PomAdactin;

public class trainingtest extends BaseClass {
	@BeforeClass
	private void testingclass() {
		System.out.println(">>>>>>started>>>>>>>>");
		launchchrome();
		launchurl("https://www.instagram.com/");
		waitfor(5);
	}
	@BeforeMethod
	private void beforetest() {
		String url = currenturl();
		System.out.println(url);
	}
	@Test
	private void testingstarted() throws IOException {
		print("Testing Started");
	WebElement username = findbyxpath("//input[@name=\"username\"]");
	username.sendKeys("dkumar178");
	findbyname("password").sendKeys("Saibaba@123");
	findbyxpath("//button[@class=\"sqdOP  L3NKy   y3zKF     \"]").click();
	}
	@AfterMethod
	private void testpasssed() {
		print("testing 2 passed");
	}
	@AfterClass
	private void closing() {
	String url = currenturl();
	print(url);
	}
	
	
}
