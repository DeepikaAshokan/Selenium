package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("Deepika");
		driver.findElement(By.xpath("//input[@type='password'][@id='password']")).sendKeys("12345");
		driver.findElement(By.className("radius")).click();
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
