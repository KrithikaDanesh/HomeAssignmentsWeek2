package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harshita");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Danesh");
		WebElement tools = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 = new Select(tools);
		drop1.selectByVisibleText("Employee");
		WebElement tools1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select(tools1);
		drop2.selectByValue("9001");
		WebElement tools2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3 = new Select(tools2);
		drop3.selectByIndex(5);
		WebElement tools3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4 = new Select(tools3);
		drop4.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String createLead = driver.getTitle();
		System.out.println(createLead);
	



	}

}
