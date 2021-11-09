package Uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageUI {
	public static WebDriver driver;
	public static By close=By.xpath("//*[@id=\"global-sticker\"]/button");
	
	public static By search=By.xpath("//input[@name='q']");
	//public static By powder=By.xpath("//*[@id=\"site-header\"]/div[3]/div/div/div/div[1]/div/div[1]/div[3]");
	public static By shopproducts=By.cssSelector("a[data-action-detail*='Shop Products']");
	public static By submit=By.xpath("//*[@id=\"site-header\"]/div[2]/div/div/div/form/div/button");
	//public static By shop = By
			//.xpath("//div[contains(@tabindex,'0')] //a[contains(@data-action-detail,'Shop Products')]");
	public static By powder = By
			.xpath("//div[contains(@role,'menuitem')] //a[contains(@data-action-detail,'Powder')] //span");
	public static By verifyText = By.xpath("//a[contains(@class,'product-preview-title')] //p");
	

}
