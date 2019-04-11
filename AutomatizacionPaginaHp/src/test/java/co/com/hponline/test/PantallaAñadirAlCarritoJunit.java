package co.com.hponline.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import co.com.hponline.main.PantallaAgregarAlCarrito;
import co.com.hponline.main.PantallaSeleccionDeProducto;

public class PantallaAñadirAlCarritoJunit {
	private WebDriver driver = PantallaDeInicioJunit.getDriver();
	
	private PantallaAgregarAlCarrito pantallaAgregarAlCarrito;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		pantallaAgregarAlCarrito = new PantallaAgregarAlCarrito(driver);
		pantallaAgregarAlCarrito.seleccionBtnAñadirAlCarrito();
		pantallaAgregarAlCarrito.seleccionBtnIrAlCarrito();
		
		String nombreProductoSeleccionado = PantallaSeleccionDeProducto.getNombreProductoSeleccionado();
		String nombreProductoFinal = PantallaAgregarAlCarrito.getNombreProductoFinal();
		System.out.println(nombreProductoFinal);
		
		assertEquals("Verificar nombre del producto", nombreProductoSeleccionado, nombreProductoFinal);
	}

}
