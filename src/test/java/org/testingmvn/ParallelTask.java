package org.testingmvn;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomadac.PomAdactin;

public class ParallelTask extends BaseClass {
	@BeforeClass
	private void testingclass() {
		System.out.println(">>>>>>started parallel task >>>>>>>>");
		launchchrome();
		launchurl("https://adactinhotelapp.com/index.php");
	}
	@BeforeMethod
	private void beforetest() {
		String url = currenturl();
		System.out.println(url);
	}
	@Test
	private void testingstarted() throws IOException {
	PomAdactin pa=new PomAdactin();
	pa.getUsername().sendKeys(readexcel("reg", 1, 1));
	print("testing passed:"+Thread.currentThread().getId());
	
	}
	@AfterMethod
	private void testpasssed() {
		print("testing 2 passed :");
	}
	@AfterClass
	private void closing() throws InterruptedException {
		holdtime(5000);
	closebrowser();
	}
	

}
