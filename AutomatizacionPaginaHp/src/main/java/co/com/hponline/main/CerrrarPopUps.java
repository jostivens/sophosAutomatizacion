package co.com.hponline.main;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CerrrarPopUps {
	WebDriver driver;
	private By pop = By.xpath("//*[@id=\"cookies-privacy-advice\"]/div");
	/*public void CerramdoPopUps() {
	 
		WebElement closebtn = Driver.findElement(By.xpath("//*[@id=\\\"cookies-privacy-advice\\\"]/div"));
		closebtn.click();
	}*/
	
public void cerP() {
		
		driver.findElement(pop).click();
	}
	

}
