package XpathAssmts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assmt76_relxpath {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/a")).click();

	}

}
