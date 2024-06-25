package SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
	    
		WebDriver driver = new ChromeDriver();
		// this implicit wait is applicable for every statement in your automation script and automatically solve the synchronization problem
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //Implicit Wait //Standard 10 Sec 
		
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);
        
        //select option from the drop down
        
        drpCountry.selectByVisibleText("India");
        //drpCountry.selectByValue("Japan");
        //drpCountry.selectByIndex(2);

	}

}
