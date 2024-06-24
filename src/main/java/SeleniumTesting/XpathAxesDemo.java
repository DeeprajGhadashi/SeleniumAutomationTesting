package SeleniumTesting;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class XpathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	    driver.manage().window().maximize();
	    
	    //Self - Selects the current node
	   // String text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")).getText();
	    //System.out.println("Self : " + text);  // L&T
	    
	    //Parent - Selector the parent of the current node (always One)
	    //String text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/parent::td")).getText();
	    //System.out.println("Self : " + text);  // L&T
	    
	    //Child - Selector al  children of the current node (One or many)
	    List <WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/child::td"));
	    System.out.println("Number of Child elements : " + childs.size()); //6
	}

}
