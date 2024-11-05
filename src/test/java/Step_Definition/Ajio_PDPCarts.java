package Step_Definition;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ajio_PDPCarts 
{
	public WebDriver driver;
	@Given("when user oppens AjioUrl")
	public void when_user_oppens_ajio_url() {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedrivernew.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
	}

	@When("user searches for product")
	public void user_searches_for_product() {
		WebElement s1=driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		s1.sendKeys("Dresses");
		WebElement s2=driver.findElement(By.xpath("//button[@type='submit']"));
		s2.click();
	}

	@When("clicks on product from PLP")
	public void clicks_on_product_from_plp() {
		WebElement s3=driver.findElement(By.xpath("//img[@alt='Product image of Tior Girls Checked A-Line Dress']"));
		s3.click();
		
		Set<String> all = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList(all);
		String pointing = a.get(1);
		driver.switchTo().window(pointing);
	}

	@When("clicks on Add To Bag button from PDP")
	public void clicks_on_add_to_bag_button_from_pdp() {
		WebElement s4 = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		s4.click();
	}

	@Then("product is successfully added to cart")
	public void product_is_successfully_added_to_cart() {
		System.out.println("Product is added to Cart");
		driver.quit();
	}
}
