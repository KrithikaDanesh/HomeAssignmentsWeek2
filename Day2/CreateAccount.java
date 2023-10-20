package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.id("ext-gen604")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Acc");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testing Local Name");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("testingxpath.com");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5000");
		
		WebElement tools = driver.findElement(By.name("industryEnumId"));
		Select drop1 = new Select(tools);
		drop1.selectByValue("IND_SOFTWARE");
		WebElement tools1 = driver.findElement(By.name("ownershipEnumId"));
		Select drop2= new Select(tools1);
		drop2.selectByVisibleText("S-Corporation");
		WebElement tools2 = driver.findElement(By.id("dataSourceId"));
		Select drop3 = new Select(tools2);
		drop3.selectByVisibleText("Employee");
		WebElement tools3 = driver.findElement(By.id("marketingCampaignId"));
		Select drop4 = new Select(tools3);
		drop4.selectByIndex(6);
		WebElement tools4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select drop5 = new Select(tools4);
		drop5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();


	}

}
