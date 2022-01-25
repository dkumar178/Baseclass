package org.testingmvn;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbParallel extends BaseClass {
	WebDriver driver;
	@BeforeClass
	private void TestingBefore() {
		System.out.println("Testing before started with Facebook parallel");
		launchfirefox();
		maxwindow();
		}
	@Test
	private void test1() {
		launchurl("http://www.greenstechnologys.com/");
		Thread ct= Thread.currentThread();
		long id = ct.getId();
		
	System.out.println(">>>>>started test1>>>>>----->"+id);
	}
	@AfterClass
	private void testingended() {
	System.out.println("ended testing Facebook");
	
	}
	

}
