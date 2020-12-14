package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
driver.findElement(By.linkText("Basic Auth")).click();

	}

}
