package seleniumLocatorsTask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblaze {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d2 = new ChromeDriver();
		d2.manage().window().maximize();
		d2.get("https://www.demoblaze.com/");
		System.out.println("The Title of the web page : "+d2.getTitle());
		String T = d2.getTitle();
		if(d2.getTitle().equalsIgnoreCase(T)) {
			System.out.println("Page landed on correct website");
		}else {
			System.out.println("Page not landed on correct website");
		}
		
		d2.close();
	}

}
