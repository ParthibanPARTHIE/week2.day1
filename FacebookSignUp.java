package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement (By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("leaf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Testleaf@123");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("24");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("5");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1997");
		driver.findElement (By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
