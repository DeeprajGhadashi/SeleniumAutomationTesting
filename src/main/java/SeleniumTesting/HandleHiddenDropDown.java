package SeleniumTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// this implicit wait is applicable for every statement in your automation script and automatically solve the synchronization problem
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Implicit Wait //Standard 10 Sec 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        //Login steps
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        //clicking on PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();  //PIM
        
        //clicked on dropdown
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(5000);
      
       //Select single option
       // driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
        
        //count number of options
        List <WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Number of options:" + options.size());  //29
        
        //printing options
        for(WebElement op:options) {
        	System.out.println(op.getText());
        }
	}

}
