import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autotest {
	
	public static void main  (String[] args){
		
		
	
	WebDriver driver = new ChromeDriver();
	
	System.getProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	
	driver.close();
	}
	
}
