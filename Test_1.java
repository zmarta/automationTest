import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_1 {

	public static void main(String[] args) {
		// 1. Set path of the chrome driver
//		System.setProperty("webdriver.chrome.driver", "C:\\Marta's Docs\\Interviu\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		// 2. invoke ChromeDriver to open the browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.practicalzenliving.com");
		System.out.println("Website Title: " + driver.getTitle());
		
		driver.findElement(By.id("input_comp-lb6vkxik")).sendKeys("Marta Test");
//		driver.quit();
		
	}

}
