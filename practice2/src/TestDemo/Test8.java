package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[8]/a")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']")).click();
	
	}

}
