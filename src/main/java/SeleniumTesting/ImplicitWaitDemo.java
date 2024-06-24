package SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// this implicit wait is applicable for every statement in your automation script and automatically solve the synchronization problem
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //Implicit Wait //Standard 10 Sec 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        
        driver.close();

	}

}
