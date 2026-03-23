package hrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AdminPage extends AbstractComponents {

	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement Admin;
	
	//@FindBy(xpath="")
	//WebElement Performance;
	
	By userRole=By.xpath("//label[@class='oxd-label oxd-input-field-required']");
	
	By dropdownIcon=By.xpath("//div[@class='oxd-select-text--after']");
	
	public void goToAdmin() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		waitForElementToAppear(Admin);
		Admin.click();
	
	}

	@FindBy(xpath="(//button[contains(@class,'oxd-button--medium oxd-button--secondary')])[2]")
	WebElement addBtn;
	
	public void addEmployee() {
		waitForElementToAppear(addBtn);
		addBtn.click();
		waitForElementToAppear(userRole);
		driver.findElement(RelativeLocator.with(dropdownIcon).below(userRole)).click();
		//driver.findElement(RelativeLocator.with(By.tagName("label")).above(name)).getText());
	}
	
		
}
