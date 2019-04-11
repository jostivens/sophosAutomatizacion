package co.com.hponline.main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicializarDriver {
	
	private static WebDriver driver;
	private static int i =0;
	
	public WebDriver getDriver() {
		if(i==0) {
			driver = new ChromeDriver();
			i=1;
		}
		return driver;
	}
}
