package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import Reusablecomponents.WebdriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AntibacterialSteps extends WebdriverHelper {
	WebDriver driver;
	private static Logger log = LogManager.getLogger(AntibacterialSteps.class.getName());

	
	@Given("^user loads website$")
    public void user_loads_website() throws IOException{
		driver=intializeDriver();
		
		
        
    }
	 @And("^click on search$")
	    public void click_on_search(){
		 HomePage hp=new HomePage(driver);
		 hp.Search().sendKeys(Keys.ENTER);
	       
	    }

    @When("^User enters (.+)$")
    public void user_enters(String searchtext) {
    	HomePage hp=new HomePage(driver);
		 hp.Search().sendKeys(searchtext);
		 hp.Submit().sendKeys(Keys.ENTER);
    	
        
    }

   

   
    @Then("^close the driver$")
    public void close_the_driver(){
        
    }

}
