package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ajio_PLPSort 
{
	public WebDriver driver;
	@Given("user open AJioUrl1")
	public void user_open_a_jio_url1() {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedrivernew.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
	}

	@When("user clicks on Beauty category")
	public void user_clicks_on_beauty_category() {
		WebElement s1=driver.findElement(By.xpath("//span[@aria-label='BEAUTY']"));
		s1.click();
	}

	@And("filters by Eyes category")
	public void filters_by_eyes_category() throws InterruptedException {
		WebElement s2=driver.findElement(By.xpath("//label[contains(text(),'Eyes')]"));
		s2.click();
		Thread.sleep(2000);
	}

	@And("sort by Dicount")
	public void sort_by_dicount() throws InterruptedException {
		WebElement s3=driver.findElement(By.xpath("//select[@id='sortBy']"));
		Select s=new Select(s3);
		s.selectByVisibleText("Discount");
		Thread.sleep(2000);
	}

	@Then("respective products are displayed in PLP")
	public void respective_products_are_displayed_in_plp() {
	    System.out.println("The discounted products are displayed in PLP");
	    driver.quit();
	}
}
