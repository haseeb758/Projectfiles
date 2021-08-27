package locator_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Method {

	public static void main(String[] args) {
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getCurrentUrl());*/
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getCurrentUrl());
		

	}

}
