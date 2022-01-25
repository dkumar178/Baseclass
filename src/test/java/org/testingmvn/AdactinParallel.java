package org.testingmvn;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomadac.Pomflipkart;

public class AdactinParallel extends BaseClass {
	Pomflipkart pf;
	@BeforeClass
	private void TestingBefore() throws IOException {
		System.out.println("Testing before started with Adactin parallel");
		launchchrome();
		maxwindow();
		launchurl("https://www.flipkart.com/");
		takescreenshot("1");
		waitfor(5);
		fetchtitle();
		
	}
	@Test
	private void test1() throws IOException, InterruptedException {
		 pf=new Pomflipkart();
		 pf.getClose().click();
		 takescreenshot("2");
	}
	@Test
	private void test2() throws IOException, InterruptedException {
		WebElement search = pf.getFindbox();
		filltextbox(search, "mobiles under 25000");
		takescreenshot("aftersendkeys");
		pf.getSearch().click();
		Thread.sleep(2000);
		takescreenshot("3");
		fetchtitle();
		
	}
	@AfterClass
	private void testingended() {
	System.out.println("4");
	
	}
	

}
