package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.HomePage;
import Reusablecomponents.WebdriverHelper;
import Utilities.ExtentReport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopProductsSteps extends WebdriverHelper {
	
	WebDriver driver;
	private static Logger log = LogManager.getLogger(ShopProductsSteps.class.getName());

	 	@Given("^user loads home website$")
	    public void user_loads_home_website() throws IOException{
	 		
	 		driver=intializeDriver();
	 		HomePage hp=new HomePage(driver);
	 		hp.Close().sendKeys(Keys.ENTER);
	        ExtentReport er=new ExtentReport(driver);
	        er.setUp("browser intialization");
	        log.info("browser intialized");
	        System.out.println("website loaded");
	        
	    }

	    @When("^user hover on shop products from navigation bar$")
	    public void user_hover_on_shop_products_from_navigation_bar(){
	    	HomePage hp=new HomePage(driver);
	    	Actions a=new Actions(driver);
			//WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	    	WebElement move=hp.Shopproducts();
			a.moveToElement(move).build().perform();
			hp.Powder().click();
	    	
	       
	    }

	    @Then("^user chooses powder from dropdown$")
	    public void user_chooses_powder_from_dropdown() {
	    	
	       
	    }

	    @And("^verifies Tide Free and Gentle powder there in the list or not$")
	    public void verifies_tide_free_and_gentle_powder_there_in_the_list_or_not(){
	    	driver.getPageSource().contains("Tide Free and Gentle powder");
	        
	    }

}