package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
Thread.sleep(5000);
int i=1;
while(i<5)
{driver.findElement(By.id("ctl00$mainContent$ddl_Adult")).click();
i++;
	
}
	}

}
