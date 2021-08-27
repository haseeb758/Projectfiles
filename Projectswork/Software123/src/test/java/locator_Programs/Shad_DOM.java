package locator_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shad_DOM {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		WebElement root=driver.findElement(By.tagName("book-app"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement shadowdom1=(WebElement)js.executeScript("return arguments[0].shadowRoot", root);
		
		WebElement appheader=shadowdom1.findElement(By.tagName("app-header"));
		
		WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement bookinputdecorator =apptoolbar.findElement(By.tagName("book-input-decorator"));
		bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");

	}


}
