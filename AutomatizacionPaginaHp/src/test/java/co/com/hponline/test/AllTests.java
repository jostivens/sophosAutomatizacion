package co.com.hponline.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	PantallaDeInicioJunit.class, 
	PantallaSeleccionDeProductoJunit.class,
	PantallaA�adirAlCarritoJunit.class})
public class AllTests {

}
