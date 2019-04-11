import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.*;
import jxl.read.biff.BiffException;
public class leeryescribirExcel {

	public static void main(String[] args)throws IOException, BiffException 
	
{

      {
Workbook workbook = Workbook.getWorkbook(new File("C:\\selenium\\nombrsdif.xlt")); //Pasamos el excel que vamos a leer
Sheet sheet = workbook.getSheet(0); //Seleccionamos la hoja que vamos a leer



String nombre;

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); //expecifica donde esta
		WebDriver driver = new ChromeDriver(); // lo inicializa

for (int fila = 1; fila < sheet.getRows(); fila++)
    { 	
	//recorremos las filas
for (int columna = 0; columna < sheet.getColumns(); columna++)
    { 
	// va a la url que se indique
	nombre =sheet.getCell(columna,fila).getContents();
	driver.get("https://www.google.com.co/");
	driver.findElement(By.name("q")).sendKeys(nombre);
	driver.findElement(By.name("btnK")).submit();
	
	//recorremos las columnas
nombre = sheet.getCell(columna, fila).getContents(); 
      
    //setear la celda leida a nombre
System.out.print(nombre + ""); // imprimir nombre

     }
	
System.out.println("\n");
System.out.println("————————————-");

     }
driver.close();
       }
      
}

	
}
	
