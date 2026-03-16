package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents  {
	
	public WebDriver driver;

	public LandingPage (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Loginbtn;
	
	public AdminPage login(String username,String password)
	{
	waitForElementToBeClickable(Username);
	Username.sendKeys(username);
	Password.sendKeys(password);
	waitForElementToBeClickable(Loginbtn);
	Loginbtn.click();
	return new AdminPage(driver);
	}
	
	public void goTo() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
}
	
	
	
	

