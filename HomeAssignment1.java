package SeleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the size of the window
		driver.manage().window().maximize();
		
		//login the screen
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click the below link
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//Click the Accounts Tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click the Create Account in the below menu
		driver.findElement(By.linkText("Create Account")).click();
		
		//type the account name
		driver.findElement(By.id("accountName")).sendKeys("Sandhiya");
		
		//type the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//to select the specific industry by using SelectByIndex
		WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(4);
		
		// to select the specific ownership by using SelectByVisibleText
		WebElement sourceEE = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(sourceEE);
		sec1.selectByVisibleText("S-Corporation");
		
		//to select the specific source by usingSelectByValue
		WebElement sourceFF = driver.findElement(By.id("dataSourceId"));
		Select sec2=new Select(sourceFF);
		sec2.selectByValue("LEAD_EMPLOYEE");
		
		//to select the specific marketing campaign by using SelectByIndex
		WebElement sourceHH = driver.findElement(By.id("marketingCampaignId"));
		Select sec4=new Select(sourceHH);
		sec4.selectByIndex(6);
		
		//to select the specific state/province by using SelectByValue.
		WebElement sourceGG = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec3=new Select(sourceGG);
		sec3.selectByValue("TX");
		
		//to submit the account for validation if it is duplicate
		driver.findElement(By.className("smallSubmit")).click();
		
		//to submit the application
		driver.close();
		
	}

}
