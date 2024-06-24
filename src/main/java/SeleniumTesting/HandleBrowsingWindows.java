package SeleniumTesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowsingWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// this implicit wait is applicable for every statement in your automation script and automatically solve the synchronization problem
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //Implicit Wait //Standard 10 Sec 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        
        Set<String> windowIDs = driver.getWindowHandles();
        
        //Approach 1
       /* List <String> windowList = new ArrayList(windowIDs);
        
        String parentID = windowList.get(0);
        String childID = windowList.get(1);
        
        //System.out.println(driver.getTitle());  //still returning the parent window title
        
        //switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());
        
        //switch to parent window
        driver.switchTo().window(parentID);
        System.out.println(driver.getTitle());
        */
        
        //Approach 2  //looping to handle multiple url on title

        for(String winID: windowIDs) {
        	String title = driver.switchTo().window(winID).getTitle();
        	
        	if(title.equals("OrangeHRM")) {
        		System.out.println(driver.getCurrentUrl());
        		//some validation on the parent window
        	}
        }
	}

}
