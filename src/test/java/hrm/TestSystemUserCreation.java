package hrm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestSystemUserCreation extends BaseTest {
	 WebDriver driver;
	
		
	@Test
	public void userCreation() {
	//LandingPage landingPage = new LandingPage(driver);
	AdminPage adminPage=landingPage.login("Admin","admin123");
	adminPage.goToAdmin();
	adminPage.addEmployee();
	
	}

}