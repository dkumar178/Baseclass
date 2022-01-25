package org.testingmvn;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomadac.PomAdactin;

public class AdactinLogin extends BaseClass {
	@BeforeClass
	private void before() {
		System.out.println("<<<<<<<<<<<<started chrome>>>>>>>>>>>>>");
		launchchrome();
		launchurl("https://adactinhotelapp.com/index.php");
		maxwindow();
		
		
	}
	@Parameters({"emaill","pass"	})
	@Test
	private void testadactin(String username, String password) {
		PomAdactin pa=new PomAdactin();
		WebElement name = pa.getUsername();
		filltextbox(name, username);
		WebElement passvalue = pa.getPassword();
		filltextbox(passvalue, password);
		
	}
	@AfterMethod
	private void aftertest() {
	System.out.println("test adactin ended.....");
	}
	@AfterClass
	private void after() {
	System.out.println(">>>>>>>>>>adactin ended>>>>>>>>>>");
	}

}
