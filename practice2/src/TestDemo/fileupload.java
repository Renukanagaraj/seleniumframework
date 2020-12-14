package TestDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("//span[contains(text(),'Choose File')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\welcome\\Documents\\Fileupload.exe");//this is completally  java things
		
		
	}

}
