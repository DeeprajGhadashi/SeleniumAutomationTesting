package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);  //passed frame as a webelement //switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome Deepraj");
		
		driver.switchTo().defaultContent(); //got back to page		
        
		//Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);  //passed frame as a webelement //switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent(); //got back to page		
		
		//Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);  //passed frame as a webelement //switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Testing with Java");
		
	    //inner iframe - part of frame 3
		 driver.switchTo().frame(0);  //switching to frame using index
		
		 //Approach1
		//driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
		
		 //Approach2
		WebElement rdbutton = driver.findElement(By.xpath("//span[normalize-space()='I am a human']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdbutton);
		
		driver.switchTo().defaultContent(); //got back to page		
	}

}
