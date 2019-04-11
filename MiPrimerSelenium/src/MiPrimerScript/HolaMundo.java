//package MiPrimerScript;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//public class HolaMundo {

	//public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver" ,"C:\\selenium\\chromedriver.exe ");
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.com.uy");
 
//driver.findElement(By.name("q")).sendKeys("selenium get Screen");
//driver.findElement(By.name("btnK")).submit();

	//}

//}

// color es que son palabras reservadas
package MiPrimerScript;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
// voy a utilizar la clase webDriver de selenium que fue creada para org.openqa  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HolaMundo {

	public static void main(String[] args) {
		// expecifica donde esta
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		// lo inicializa
		WebDriver driver = new ChromeDriver();
		// va a la url que se indique
		driver.get("https://www.google.com.co/");
		driver.findElement(By.name("q")).sendKeys("Selenium get screenshot java");
		driver.findElement(By.name("btnK")).submit();
		
		//toma un pantallaso  de la pagina en la q se encuentra  y lo envia a una variable
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try{
	    	// se envia el pantallazo a la hubicacion asignada
	        FileUtils.copyFile(src, new File("C:\\selenium\\Capturas\\image.png"));
	    }//envia un mensaje de error si no se da la condicion
	    catch(IOException e){
	        System.out.println(e.getMessage());
	    }       
		
	   
		//FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(“C\\Selenium\\Screenshot.png”));
		
		// sirve para finalizar o cerrar el proceso 
		driver.close();
	}//es un metodo que indica un tiempo de espera para lanzarce  
	 public static void explicitWait(WebDriver driver,String text ){
         
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(text)));
	         
	    }
	 

}