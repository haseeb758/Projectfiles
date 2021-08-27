package Dockerpack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Dockerclass {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of page : "+ driver.getTitle());
		driver.quit();
	}

}
