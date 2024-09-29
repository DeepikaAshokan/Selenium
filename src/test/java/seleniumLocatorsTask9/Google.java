package seleniumLocatorsTask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver d1 = new FirefoxDriver();
		d1.manage().window().maximize();
		d1.get("http://google.com");
		System.out.println("The URL of the web page : " + d1.getCurrentUrl());
		Thread.sleep(2000);

		d1.navigate().refresh();
		d1.close();

	}

}
