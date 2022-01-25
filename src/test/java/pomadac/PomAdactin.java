package pomadac;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAdactin extends BaseClass{

	public PomAdactin() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
		
		@FindBy(name="username"),
		@FindBy(id="username"),
		@FindBy(xpath="//input[@type=\"text\"]")
	})
	private WebElement username;
	@FindAll({
		@FindBy(id="password"),
		@FindBy(name="password"),
		@FindBy(xpath="//input[@type=\"password\"]")
	})
	private WebElement password;
	@FindAll({
		@FindBy(id="login"),
		@FindBy(name="login"),
		@FindBy(xpath="//input[@type=\"Submit\"]")
		
	})
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
