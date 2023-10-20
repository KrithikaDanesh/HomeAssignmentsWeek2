package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tom");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jerry");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Test@123");
	WebElement days = driver.findElement(By.name("birthday_day"));
	Select drop1 = new Select(days);
	drop1.selectByValue("24");
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select drop2= new Select(month);
	drop2.selectByValue("3");
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select drop3 = new Select(year);
	drop3.selectByValue("2010");
	
	driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
