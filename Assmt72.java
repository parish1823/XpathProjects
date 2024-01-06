package XpathAssmts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assmt72 {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
	   

	}
	driver.close();

}
