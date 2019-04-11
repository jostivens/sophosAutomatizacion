package co.com.hponline.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.hponline.main.CapturaDePantalla;
import co.com.hponline.main.CerrrarPopUps;
import co.com.hponline.main.InicializarDriver;
import co.com.hponline.main.PantallaDeInicio;

public class PantallaDeInicioJunit {
	
	//private InicializarDriver driver = new InicializarDriver();
	private static WebDriver driver;
	private PantallaDeInicio pantallaDeInicio;
	private CapturaDePantalla capturaPantalla;
	//private CerrarPopUps cerrrarPopUps = new CerrarPopUps();
	
	public static WebDriver getDriver() {
		return driver;// devolver driver para otros junit
	}
			
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//pantallaDeInicio = new PantallaDeInicio(driver);
	}
	
	@After
	public void tearDown() throws Exception {
	
	}
			
	@Test
	public void test() throws IOException {
		pantallaDeInicio = new PantallaDeInicio(driver);
		capturaPantalla = new CapturaDePantalla(driver);
		driver.manage().window().maximize();
		driver.get("https://www.hponline.com.co");
		pantallaDeInicio.cerP();
		//cerrrarPopUps ();
		capturaPantalla.Captura("PantallaInicial");
		pantallaDeInicio.escribirEnCajaDeTexto();
		capturaPantalla.Captura("CapturaCajaDeTexto");
		pantallaDeInicio.clickBtnBuscar();
		
	}

}
