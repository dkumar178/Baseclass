package pomadac;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomflipkart extends BaseClass {
	public Pomflipkart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement close;
	@FindAll({
		
		@FindBy(name="q"),
		@FindBy(xpath="//input[@type=\"text\"]")
	})
	private WebElement findbox;
	@FindAll({
		@FindBy(xpath="//button[@class=\"L0Z3Pu\"]"),
		@FindBy(xpath="//button[@type=\"submit\"]")
		
	})
	private WebElement search;
	public WebElement getClose() {
		return close;
	}
	public WebElement getFindbox() {
		return findbox;
	}
	public WebElement getSearch() {
		return search;
	}  
	
	
	
	
	
	

}
