package SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// this implicit wait is applicable for every statement in your automation script and automatically solve the synchronization problem
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Implicit Wait //Standard 10 Sec 
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //opens dropdown options
        
        //1) Select single option
        driver.findElement(By.xpath("//input[@value='Java']")).click();
        
        
        
	}

}
