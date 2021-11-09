package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Uistore.HomePageUI;

public class HomePage extends HomePageUI {
	
	WebDriver driver;
	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement Search() {
		return driver.findElement(search);
	}
	public WebElement Shopproducts() {
		return driver.findElement(shopproducts);
	}
	public WebElement Powder() {
		return driver.findElement(powder);
	}
	public WebElement Close() {
		return driver.findElement(close);
	}
	public WebElement Submit() {
		return driver.findElement(submit);
	}

}
