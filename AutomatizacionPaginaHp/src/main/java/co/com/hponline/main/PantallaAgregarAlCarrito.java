package co.com.hponline.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PantallaAgregarAlCarrito {

	private WebDriver driver;
	private By BtnAgregarAlCarrito = By.xpath("//div[@class='product-detail row']//button[1]");
	private By BtnIrAlCarrito = By.xpath("//a[@class='btn btn-sm btn-go-to-cart']");
	private By nombreProductoFinal = By.xpath("//a[contains(text(),'Impresora Multifuncional HP DeskJet Ink Advantage ')]");
	private static String nombreProductoCarrito ;

	public PantallaAgregarAlCarrito(WebDriver driver) {

		this.driver = driver;
	}

	public void seleccionBtnAñadirAlCarrito() {

		driver.findElement(BtnAgregarAlCarrito).click();
	}

	public void seleccionBtnIrAlCarrito() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(BtnIrAlCarrito)));
		driver.findElement(BtnIrAlCarrito).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(nombreProductoFinal)));
		nombreProductoCarrito = driver.findElement(nombreProductoFinal).getText();
	}
	
	public static String getNombreProductoFinal() {
		
		return nombreProductoCarrito;
		
	}

}
