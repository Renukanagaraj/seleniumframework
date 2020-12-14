package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.findElement(By.id("email")).sendKeys("da");
driver.findElement(By.id("pass")).sendKeys("dsa");
	}

}
