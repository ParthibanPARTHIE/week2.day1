package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement DropDown = driver.findElement(By.id("dropdown1"));
		Select s1  = new Select(DropDown);
		s1.selectByIndex(2);
		WebElement DropDown1 = driver.findElement(By.name("dropdown2"));
		Select s2  = new Select(DropDown1);
		s2.selectByVisibleText("Loadrunner");
		WebElement DropDown2= driver.findElement(By.id("dropdown3"));
		Select s3  = new Select(DropDown2);
		s3.selectByValue("2");
		WebElement DropDown3= driver.findElement(By.className("dropdown"));
		Select s4  = new Select(DropDown3);
		s4.selectByValue("2");
	
				
				
		
		
		
		
		
		
		

}
	}
