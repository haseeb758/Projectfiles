package locator_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_check {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.selenium.dev/");
		driver.findElement(By.id("___gcse_0")).click();*/
		
		
		/*driver.get("https://www.facebook.com/");
		
		String expecttitle=driver.getTitle();
		System.out.println(expecttitle);
		
        String actualtitle="https://ar-ar.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2Flogin%2F%3Fnext%3Dhttps%253A%252F%252Fwww.facebook.com%252Flogin%252F%253Fnext%253Dhttps%25253A%25252F%25252Fwww.facebook.com%25252Fpolicies%25252Fcookies%25252F";
	if(expecttitle.equals(actualtitle)==true)
	{
		System.out.println("Test Pass");
	}
	else
	{
		System.out.println("Test Pass");
	}
	//driver.close();*/
	
	}

}
