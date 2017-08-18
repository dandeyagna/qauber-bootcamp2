package vlad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AddReportsTestNgValidation {
	WebDriver fox = new FirefoxDriver();
		
		@BeforeTest
		
		public void setUp(){
			fox.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			fox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			fox.get("http://fits.qauber.com");
			fox.manage().window().maximize();
			fox.findElement(By.xpath(".//*[@id='exampleInputEmail1']")).sendKeys("dryrun4@mailinator.com");
			fox.findElement(By.xpath(".//*[@id='exampleInputPassword1']")).sendKeys("password");
			fox.findElement(By.xpath(".//*[@type='submit']")).sendKeys(Keys.RETURN);
			fox.findElement(By.xpath(".//*[text() = 'Add Report']")).click();
			fox.findElement(By.xpath("//div[@class='fa fa-user size']")).click();
			fox.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']")).sendKeys("123456789");
			fox.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gena");
			fox.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Krokodil");
			fox.findElement(By.xpath("//h4/div[@title='Gang Membership']")).click();
			fox.findElement(By.xpath("//input[@ng-model='wizard.report.locationOfStop']")).sendKeys("1234 Mockingbird Lane.");
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
			Assert.assertEquals(locationName, "1234 Mockingbird Lane.");
		}

		@AfterTest
		public void close(){
			fox.quit();
		}
}

