package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Desktop\\chromepath\\chromedrive");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedrive.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
WebElement	staticDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticDropdown);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		

		
		
	}

}
