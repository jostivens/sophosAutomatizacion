package SeleniumExcel;

import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
// voy a utilizar la clase webDriver de selenium que fue creada para org.openqa  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//librerias  necesarias para leer excel
import java.io.FileInputStream;
//import java.util.Iterator;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
 
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;



public class SeleniumExcel {

	static String check;
	static ArrayList<String> Lista;
	
	public static void fbuscar(String dato)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try
		{
			driver.get("http://www.youtube.com");
			driver.findElement(By.id("search")).sendKeys(dato);
			driver.findElement(By.id("search-icon-legacy")).submit();;
			WebElement Resul = driver.findElement(By.partialLinkText("Documental"));
			
			boolean status = Resul.isDisplayed();
			
			if(status)
			{
				check = "Encontrado";
				driver.close();
			}
		}
		catch(Exception e)
		{
			check = "No encontrado";			
			driver.close();
		}
	}
	

	public static void main(String[] args) throws Exception {

		File archivoExcel = new File("C:\\selenium\\nombres2.xlsx");
		FileInputStream fis = new FileInputStream(archivoExcel);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);		
	
		int numeroCeldas = sheet1.getLastRowNum() + 1;
		System.out.println("Numero de celdas es igual a " + numeroCeldas);
		for(int i=0; i < numeroCeldas; i++)
		{
			String dato = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("El dato leido de excel es: " + dato);
			
			fbuscar(dato);
			
			sheet1.getRow(i).createCell(2).setCellValue(check);
			FileOutputStream fout = new FileOutputStream(archivoExcel);
			wb.write(fout);
		}
		
		wb.close();
	}
}
