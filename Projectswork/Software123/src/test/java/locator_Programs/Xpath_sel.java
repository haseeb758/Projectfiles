package locator_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_sel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//By Full XPath
		/*driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("hase");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("abc");
		//By XPath
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("john");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("smith");
		//XPath Options
		// or & and operators
		driver.findElement(By.xpath("//input[@id='txtUsername' or @class='formhint']")).sendKeys("Gold");
		driver.findElement(By.xpath("//*[@name='txtPassword' and @id='txtPassword']")).sendKeys("stain");
		//contains()
		driver.findElement(By.xpath("//*[contains(@name,'txtUser')]")).sendKeys("hold");
		driver.findElement(By.xpath("//*[contains(@id,'txtPass')]")).sendKeys("good");
		//starts-with()
		driver.findElement(By.xpath("//*[starts-with(@name,'txtU')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[starts-with(@name,'txtP')]")).sendKeys("admin");*/
		//text()
		//driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		//chained XPath
		driver.findElement(By.xpath("//form[@id='frmLogin']//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//form[@id='frmLogin']//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//form[@id='frmLogin']//input[@class='button']")).click();
		
		
		

	}

}
