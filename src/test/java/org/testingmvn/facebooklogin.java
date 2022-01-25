package org.testingmvn;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pojofb.PomFb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebooklogin extends BaseClass{
	@BeforeClass
	private void testingbefore() {
		print("Testing Started.....");
		launchchrome();
		launchurl("https://www.facebook.com/");
		maxwindow();
	}
	
	PomFb pf;
	@Test
	private void test1() {
		pf=new PomFb();
		String t1 = returntitle();
		Assert.assertTrue(10>9);
		WebElement username = pf.getTxtusername();
  		filltextbox(username, "dinesh");
  		print(t1);
	
	}
	
	
	
}

