package locator_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shad_DOM1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shop.polymer-project.org/");
		WebElement root=driver.findElement(By.tagName("shop-app"));
		WebElement shadowdom1=getShadowDOM(root,driver);
		WebElement ironpages=shadowdom1.findElement(By.tagName("iron-pages"));
		WebElement shopname=ironpages.findElement(By.name("home"));
		WebElement shadowdom2=getShadowDOM(shopname,driver);
		shadowdom2.findElement(By.cssSelector("div:nth-child(2) > shop-button >a")).click();
		

	}
static WebElement getShadowDOM(WebElement element, WebDriver driver)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement shadowdom1=(WebElement)js.executeScript("return arguments[0].shadowRoot", element);
	return shadowdom1;
}
		
}
