package co.com.hponline.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PantallaDeInicio {
	private WebDriver driver;
	private By cajaTexto = By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//input[@placeholder='Busca productos']");
	private By btnBuscar = By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//button[@type='submit']");
	private By pop = By.xpath("//*[@id=\"cookies-privacy-advice\"]/div");
	
	public PantallaDeInicio(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void escribirEnCajaDeTexto() {
		
		driver.findElement(cajaTexto).sendKeys("multifuncional");
	}
	
	public void clickBtnBuscar() {
		
		driver.findElement(btnBuscar).click();
	}
	
public void cerP() {
		
		driver.findElement(pop).click();
	}
	
}
