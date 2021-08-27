package locator_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_sel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//driver.get("https://www.zalando-lounge.de/#/");
		//driver.get("https://www.zalando-lounge.de/#/login");
		driver.manage().window().maximize();
		//Id locator
		//driver.findElement(By.id("contact-link")).click();
		//Name locator
		/*WebElement ele=driver.findElement(By.name("search_query"));
		ele.sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		//By linkText
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		//By partiallinkText
		driver.findElement(By.partialLinkText("Faded Short")).click();
		//By class 
		int slider=driver.findElements(By.className("homeslider-container")).size();
		System.out.println(slider);
		//By Tag
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		//By Tag#id
		  driver.findElement(By.cssSelector("input#form-email")).sendKeys("john");
		  driver.findElement(By.cssSelector("#form-email")).sendKeys("smith");
		//By Tag.class
		driver.findElement(By.cssSelector("input.InputWrapper-sc-z44axa")).sendKeys("abc");
		driver.findElement(By.cssSelector(".InputWrapper-sc-z44axa")).sendKeys("cdf");
		//By Tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("df342");
		//By Tag.class[attribute=value]
		driver.findElement(By.cssSelector("input.InputWrapper-sc-z44axa[name=email]")).sendKeys("hase");
		driver.findElement(By.cssSelector("input.InputWrapper-sc-z44axa[name=password]")).sendKeys("tim");*/	

	}

}
