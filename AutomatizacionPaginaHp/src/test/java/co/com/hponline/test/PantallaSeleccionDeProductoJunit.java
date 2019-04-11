package co.com.hponline.test;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import co.com.hponline.main.CapturaDePantalla;
import co.com.hponline.main.InicializarDriver;
import co.com.hponline.main.PantallaDeInicio;
import co.com.hponline.main.PantallaSeleccionDeProducto;


public class PantallaSeleccionDeProductoJunit {
	//private InicializarDriver driver = new InicializarDriver();
	private WebDriver driver = PantallaDeInicioJunit.getDriver();
	private PantallaSeleccionDeProducto pantallaSeleccionDeProducto;
	private CapturaDePantalla capturaPantalla = new CapturaDePantalla(driver);
	//private PantallaDeInicio pantallaDeInicio = new PantallaDeInicio();
	private By pop = By.xpath("//*[@id=\"cookies-privacy-advice\"]/div");

	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		pantallaSeleccionDeProducto = new PantallaSeleccionDeProducto(driver);
		
	}
	
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void test2() throws IOException {
		driver.get("https://www.hponline.com.co/search?q=multifuncional");
		driver.manage().window().maximize();
		capturaPantalla.Captura("PantallaSeleccionDeProducto");
		//pantallaDeInicio.escribirEnCajaDeTexto();
		pantallaSeleccionDeProducto.seleccionObjeto();
		capturaPantalla.Captura("PantallaProductoSeleccionado");
	}

}
