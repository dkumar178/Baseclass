package seleniumdemo;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class DemoSelenium extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchchrome();
		maxwindow();
		launchurl("https://www.irctc.co.in/nget/train-search");
		waitfor(5);
		findbyxpath("(//button[@type=\"submit\"])[1]").click();
		
		
		
		
	}

}
