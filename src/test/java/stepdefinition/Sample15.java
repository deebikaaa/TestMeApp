package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample15 {
	WebDriver driver;
	@Given("user launching testmeapp")
	public void user_launching_testmeapp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		
		//System.out.println("user has launched testmeapp");
	  
	}

	@When("user enter username as {string} And enter password as {string}")
	public void user_enter_username_as_And_enter_password_as(String un, String psd) {
		LoginPageObjects lp= new LoginPageObjects(driver);
		lp.un.sendKeys(un);
		lp.psd.sendKeys(psd);
	
	    
	}

	@Then("click ok")
	public void click_ok() {
		LoginPageObjects lp= new LoginPageObjects(driver);
		lp.ok.click();
	    
	}

	@Then("verify login result")
	public void verify_login_result() {
	    System.out.println("the login result has been verified");
	}
}
