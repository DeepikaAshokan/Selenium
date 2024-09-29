package seleniumLocatorsTask9;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d3 = new ChromeDriver();
		d3.manage().window().maximize();
		d3.get("https://www.wikipedia.org/");
		d3.findElement(By.id("searchInput")).sendKeys("AI");
		d3.findElement(By.xpath("//button[@type='submit']")).click();
		d3.findElement(By.linkText("View history")).click();
		System.out.println("The title of the current page is: "+d3.getTitle());
		d3.close();
	}

}
