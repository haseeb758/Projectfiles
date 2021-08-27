package locator_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Axes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		// self
		String ele1=driver.findElement(By.xpath("//a[contains(text(),'Indo Count Inds.')]/self::a")).getText();
		System.out.println(ele1);
		// parent
		String ele2=driver.findElement(By.xpath("//a[contains(text(),'Indo Count Inds.')]/parent::td")).getText();
		System.out.println(ele2);
		// child
		List <WebElement> ele3=driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/child::td"));
		System.out.println(ele3.size());
		// ancestor
		String ele4=driver.findElement(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr")).getText();
		System.out.println(ele4);
		// Descendant
		List <WebElement> ele5=driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/descendant::*"));
		System.out.println(ele5.size());
		// Following
		List <WebElement> ele6=driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/following::tr"));
		System.out.println(ele6.size());
		// Following-sibling
		List <WebElement> ele7=driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/following-sibling::*"));
		System.out.println(ele7.size());
		// Preceding 
		List <WebElement> ele8=driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/preceding::tr"));
		System.out.println(ele8.size());
		// Preceding-sibling
		List <WebElement> ele9=driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println(ele9.size());
		
		// Facebook registration form 
		//     1. //div[@id='reg_form_box']/child::div[10]/button  
		//     2. //button[@id='u_0_13_40']/parent::*/parent::*/child::div[1]/div/div[1] 
		//     3. //input[@id='u_0_r_M3']/following::input[2]
		//     4. //input[@id='password_step_input']/preceding::input[2]
		//     5. //input[@id='u_0_7_BJ']/ancestor::div[2]/div[1]/div/div[2]
		
		// Google Page
		//    1.  //div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/parent::*/parent::*/parent::*/div[1]
		// Amazon
		//    1.  //input[@id='twotabsearchtextbox']/following::a[normalize-space()='Amazon Basics']
		//    2.  //input[@id='twotabsearchtextbox']/following::span[@id='nav-link-accountList-nav-line-1']
		//    3.
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
