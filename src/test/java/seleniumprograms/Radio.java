package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//TYPE1
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//TYPE2
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The number radio buttons are: " + radio.size());
		System.out.println(radio.get(0).isDisplayed());
		System.out.println(radio.get(1).isEnabled());
		System.out.println(radio.get(2).isSelected());
		
		//TYPE3
		List<WebElement> radio1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		String ActualResult = "Female";
		for (int i = 0; i < radio1.size(); i++) {
			if (radio1.get(i).getText().equalsIgnoreCase(ActualResult)) {
				radio1.get(i).click();
				System.out.println(ActualResult + " clicked");
			}
		}
		driver.close();
	}

}
