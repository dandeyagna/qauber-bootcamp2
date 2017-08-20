package vlad;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddReportsChrome {
	private WebDriver fox;
	@BeforeTest
	
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/QA/Eclipse/Drivers/chromedriver_win32/chromedriver.exe");
		fox = new ChromeDriver();
		fox.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		fox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fox.get("http://fits.qauber.com");
//		fox.manage().window().maximize();
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("email", "dryrun4@mailinator.com");
		map.put("password", "password");
		map.put("caseID", "123456789");
		map.put("firstname", "Krokodil");
		map.put("lastname", "Gena");
		map.put("location", "1234 Mockingbird Lane");
		
		
		
		fox.findElement(By.xpath(".//*[@id='exampleInputEmail1']")).sendKeys(map.get("email"));
		fox.findElement(By.xpath(".//*[@id='exampleInputPassword1']")).sendKeys(map.get("password"));
		fox.findElement(By.xpath(".//*[@type='submit']")).sendKeys(Keys.RETURN);
		fox.findElement(By.xpath(".//*[text() = 'Add Report']")).click();
		fox.findElement(By.xpath("//div[@class='fa fa-user size']")).click();
		fox.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']")).sendKeys(map.get("caseID"));
		fox.findElement(By.xpath("//input[@name='lastName']")).sendKeys(map.get("lastname"));
		fox.findElement(By.xpath("//input[@name='firstName']")).sendKeys(map.get("firstname"));
		fox.findElement(By.xpath("//h4/div[@title='Gang Membership']")).click();
		fox.findElement(By.xpath("//input[@ng-model='wizard.report.locationOfStop']")).sendKeys(map.get("location"));
		fox.findElement(By.xpath("//h4/div[@title='Preview']")).click();
		fox.findElement(By.xpath("//button[@ng-click='wizard.commitReport()']")).click();
		fox.findElement(By.xpath("//div[5]/a[1]")).click();		
	}
	
	@Test
	public void testCaseID(){
		WebElement IdLabel = fox.findElement(By.xpath(".//*[text()='Case ID']/../div"));
		String Id = IdLabel.getText();
		Assert.assertEquals(Id, "123456789");
	}
	
	@Test
	public void firstName(){
		WebElement firstNameLabel = fox.findElement(By.xpath(".//*[text()='First Name']/../div"));
		String firstName = firstNameLabel.getText();
		Assert.assertEquals(firstName, "Krokodil");
	}
	
	@Test
	public void lastName(){
		WebElement lastNameLabel = fox.findElement(By.xpath(".//*[text()='Last Name']/../div"));
		String lastName = lastNameLabel.getText();
		Assert.assertEquals(lastName, "Gena");
	}
	
	@Test
	public void location(){
		WebElement locationLabel = fox.findElement(By.xpath(".//*[text()='Location of Stop']/../div"));
		String locationName = locationLabel.getText();
		Assert.assertEquals(locationName, "1234 Mockingbird Lane");
	}

	@AfterTest
	public void close(){
		fox.quit();
	}
}