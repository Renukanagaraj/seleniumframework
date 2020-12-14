package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromepath\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.co.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	//System.out.println(driver.getPageSource());
	driver.navigate().to("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAKy_UJmh0InLc4yX5ZkZc7-QeYAxlJz8HpPeF94BpDyjQODEb6IaUTWo3pUmuuEl1_ShGr0uCpNP0z-E9AAENptLg83UH1wVeW03MEoH6eXtjhIWXLn-Jxti_8CaDtXmtoqtyxiVdD8syyj26gxfZZ4V9DIiVwqzQumbpBNZueYA");
	driver.navigate().back();
	driver.close();
	}

}
