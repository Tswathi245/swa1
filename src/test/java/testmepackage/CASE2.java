package testmepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CASE2 {
	WebDriver driver;
	@When("i click on the Signin button")
	public void i_click_on_the_Signin_button() {System.setProperty("webdriver.chrome.driver","C:\\swathi\\drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    
	}

	@When("the user enter {string} in the user field")
	public void the_user_enter_in_the_user_field(String name) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(name);
	    
	}

	@Then("enters the {string} in the password field")
	public void enters_the_in_the_password_field(String password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	}

	@Then("clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

}
