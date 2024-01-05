package testNg_params;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asst117_priority {

	
	@BeforeMethod
	public void before() {
  System.out.println("beforemethod");
    }
	
	@AfterMethod
	public void after() {
		 System.out.println("aftermethod");
	}
	
	@Test(priority=-9)
	public void add1(){
		 System.out.println("add");
	}
	@Test(priority=-34)
	public void bookl(){
		 System.out.println("book");
	}
	@Test(priority=0)
	public void notebook(){
		 System.out.println("nb");
	}
}
