package co.com.hponline.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PantallaSeleccionDeProducto {
	
	private static WebDriver driver;
	private By linkObjeto = By.xpath("//div[@class='catalogue-container']//div[1]//a[1]//div[2]//p[1]//span[1]");
	private static By nombreProducto = By.xpath("//div[@class='catalogue-container']//div[1]//a[1]//div[2]//p[1]//span[1]");
	private static String nombreProductoSeleccionado;
	public PantallaSeleccionDeProducto(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void seleccionObjeto() {
		nombreProductoSeleccionado = driver.findElement(nombreProducto).getText();
		driver.findElement(linkObjeto).click();
	}
	
	public static String getNombreProductoSeleccionado() {
		
		return nombreProductoSeleccionado;
		
	}

}
