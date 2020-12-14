package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
WebElement staticDropDown=driver.findElement(By.id("dropdown-class-example"));
	Select dropdown=new Select(staticDropDown);
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("Option2");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("option1");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
