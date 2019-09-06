package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {
	WebDriver driver;
	@When("i click on the Signinbutton")
		public void i_click_on_the_Signin_button() {
		System.setProperty("webdriver.chrome.driver","C:\\swathi\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		    
	}

	@When("the user enter {string} in the user fields")
	public void the_user_enter_in_the_user_fields(String name) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(name);

	}

	@Then("enter the {string} in the password field")
	public void enter_the_in_the_password_field(String password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	   
	}

	@And("click on the login button")
	public void click_on_the_login_button() {driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("user click on the {string} in the search field")
	public void user_click_on_the_in_the_search_field(String search) {
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(search);

	}

	@Then("page  goes to product page")
	public void page_goes_to_product_page() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}


}
