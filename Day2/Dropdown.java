package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		//Select Tool
		WebElement tools = driver.findElement(By.className("ui-selectonemenu"));
		Select drop1 = new Select(tools);
		drop1.selectByVisibleText("Selenium");
		
		//Choose Country
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_4")).click();
		Thread.sleep(2000);
		//Confirm City
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		Thread.sleep(2000);
		
		//Choose Course
		
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Appium']")).click();
		driver.findElement(By.xpath("//li[text()='PostMan']")).click();
		//driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-autocomplete-token-icon ui-icon ui-icon-close']")).click();		
		
		//Choose Language
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.id("j_idt87:lang_1")).click();
		Thread.sleep(2000);
		//Select 'Two' 
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.id("j_idt87:value_3")).click();
		
		
		
	}

}
