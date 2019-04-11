package co.com.hponline.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CapturaDePantalla {
	
	 //private InicializarDriver driver = new InicializarDriver(); 
	private static WebDriver driver;
	public CapturaDePantalla(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void Captura(String dato) throws IOException {
		
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
    try{
    	// se envia el pantallazo a la ubicacion asignada
    	
        FileUtils.copyFile(src, new File("C:\\Users\\SEMILLERO16\\Desktop\\Capturas\\" +dato+ ".png"));
    }//envia un mensaje de error si no se da la condicion
    
    catch(IOException e){
        System.out.println(e.getMessage());
    }       
  }
}
