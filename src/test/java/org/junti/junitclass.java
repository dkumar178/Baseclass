package org.junti;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class junitclass extends BaseClass {
@BeforeClass
public static void before() {
	System.out.println("Chrome Started");
	launchchrome();
	maxwindow();
	driver.get("https://www.google.co.in/");
	 	
}
@Before
public void beforeneed() {
	currenturl();
	
}
@Test
public void test1() {
		WebElement name = findbyname("q");
		filltextbox(name, "facebooklogin");
	}
@AfterClass
public static void close() {
	closebrowser();
}

}

