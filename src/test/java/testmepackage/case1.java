package testmepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver;
	@Given("user opens the TestMeapp")
	public void user_opens_the_TestMeapp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\swathi\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
	   
	}

	@And("click on signUp")
	public void click_on_signUp() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters the user name {string}in the usename field")
	public void user_enters_the_user_name_in_the_usename_field(String uname) {
		 driver.findElement(By.xpath("//*[@id='userName']")).click();
		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(uname);
	   
	}

	@And("user enters the firstName {string}")
	public void user_enters_the_firstName(String fname) {
		driver.findElement(By.xpath("//*[@id='firstName']")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(fname);
	}

	@And("user enters the lastName {string}")
	public void user_enters_the_lastName(String lname) {
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lname);
	}

	@And("user enters the password {string}")
	public void user_enters_the_password(String password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	}

	@And("user enters the confirmmpassword {string}")
	public void user_enters_the_confirmmpassword(String cpassword) {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(cpassword);
	    
	}

	@When("user selects the gender")
	public void user_selects_the_gender() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
	}

	@And("user enters the email {string}")
	public void user_enters_the_email(String email) {
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(email);
	}

	@And("user enters the mobno {string}")
	public void user_enters_the_mobno(String mno) {
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(mno);
	    
	}
	@When("user selects the DOB {string}")
	public void user_selects_the_DOB(String dob) {
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(dob);
	}

	@And("user enters the Address {string}")
	public void user_enters_the_Address(String add) {
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys(add);
	   
	}

	@When("user selects the security question")
	public void user_selects_the_security_question() {
		WebElement a=driver.findElement(By.xpath("//*[@id='securityQuestion']"));
	    Select b=new Select(a);
	    b.selectByIndex(0);
	}

	@And("user enters answer {string}")
	public void user_enters_answer(String ans) {
		driver.findElement(By.xpath("//*[@id='answer']")).sendKeys(ans);
	}

	@Then("user click the register button")
	public void user_click_the_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();   
	}


}
