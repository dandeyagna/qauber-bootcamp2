package maxruban;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class HomeWorkLevel2Class8ChromeDriver {
	private WebDriver driver;
		
		
		
		@BeforeTest
		public void createReport() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/maxruban/Desktop/chromedriver2");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			String emailLogin = "zzzmmm@mailinator.com";
			String password = "zzzzzz";
			driver.get("http://qabidder.net/testwave/#/page/login");
			HashMap<String, String> suspect = new HashMap<String, String>(0);
			suspect.put("Last Name", "Jameson");
			suspect.put("First Name", "John");
			suspect.put("Middle Name", "Peter");
			suspect.put("Nick Name", "");
			suspect.put("DOB", "05051977");
			suspect.put("Age", "40");
			suspect.put("Height", "6.00");
			suspect.put("Weight", "120.00");
			suspect.put("Language", "English");
			suspect.put("Street Address", "123 Main str");
			suspect.put("City", "Santa Clara");
			suspect.put("Zip", "95051");
			suspect.put("Phone", "123456789");
			suspect.put("Email", "zzzmmm@mailinator.com");
			suspect.put("Social Security", "123345678");
			suspect.put("Tatoos", "Dragon");
			suspect.put("Driver License", "R-0987654321");
			suspect.put("Other ID", "AA 123456");
			suspect.put("Other State", "Alberta");
			suspect.put("Other Type ID", "passport");
			suspect.put("School Name", "John Sutter School");
			suspect.put("School Address", "12 Forbes St");
			suspect.put("School City", "Santa Clara");
			suspect.put("School Address", "12 Forbes St");
			suspect.put("School Zip", "95051");
			suspect.put("Parent Name", "Peter Jameson");
			suspect.put("Parent Address", "23 Olive Dr");
			suspect.put("Parent City", "Mountain View");
			suspect.put("School Telephone", "1122334455");
			suspect.put("Occupation", "Engineer");
			suspect.put("Employer Name", "Super Electronics");
			suspect.put("Employer Address", "12 Selenium Ave");
			suspect.put("Employer City", "Mountain View");
			suspect.put("Employer Zip", "94041");
			suspect.put("Employer Telephone", "1029384756");
			suspect.put("Reason for Stop", "Accident");
			suspect.put("Location of Stop", "Mountain View Downtown");
			suspect.put("Disposition of Stop", "Main square");
			suspect.put("Gang Name", "Kids");
			suspect.put("How Long", "2 years");
			suspect.put("Officer ID", "ABC 12345");
			suspect.put("Vehicle License", "ABC11223D");
			suspect.put("Vehicle Make", "Toyota");
			suspect.put("Vehicle Model", "Camry");
			suspect.put("Vehicle Style", "Sedan");
			suspect.put("Vehicle Year", "2013");
			suspect.put("Vehicle Color", "Black");
			suspect.put("Vehicle Oddities", "N/A");
			Thread.sleep(3000);
			WebElement loginField = driver.findElement(By.xpath("//*[@id='exampleInputEmail1']"));
			loginField.sendKeys(emailLogin);
			WebElement passwordField = driver.findElement(By.xpath("//*[@id='exampleInputPassword1']"));
			passwordField.sendKeys(password);
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			loginButton.click();
			Thread.sleep(5000);
			WebElement addReport = driver.findElement(By.xpath("//span[text()='Add Report']"));
			addReport.click();
			Thread.sleep(4000);
			WebElement nextButton1 = driver.findElement(By.xpath("//div[@ng-show='wizard.active(1)']/ul/li/a/span"));
			nextButton1.click();
			WebElement caseID = driver.findElement(By.xpath("//input[@name='caseNumber']"));
			caseID.sendKeys("12345");
			WebElement selectType = driver.findElement(By.xpath("//select[@ng-model='wizard.report.suspectType']"));
			selectType.findElement(By.xpath("//option[@value='Victim']")).click();
			WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
			String a = suspect.get("Last Name");
			lastName.sendKeys(a);
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
			String b = suspect.get("First Name");
			firstName.sendKeys(b);
			WebElement midName = driver.findElement(By.xpath("//input[@name='middleName']"));
			String c = suspect.get("Middle Name");
			midName.sendKeys(c);
			WebElement nickName = driver.findElement(By.xpath("//input[@name='Nickname']"));
			String d = suspect.get("Nickname");
			nickName.sendKeys("Doctor");
			WebElement dOB = driver.findElement(By.xpath("//input[@ng-model='wizard.report.dob']"));
			dOB.clear();
			String e = suspect.get("DOB");
			dOB.sendKeys(e);
			WebElement age = driver.findElement(By.xpath("//input[@name='Age']"));
			String f = suspect.get("Age");
			age.sendKeys(f);
			WebElement selectSex = driver.findElement(By.xpath("//select[@ng-model='wizard.report.sex']"));
			selectSex.findElement(By.xpath("option[@value='M']")).click();
			WebElement selectRace = driver.findElement(By.xpath("//select[@ng-model='wizard.report.race']"));
			selectRace.findElement(By.xpath("option[@value='African American']")).click();
			WebElement height = driver.findElement(By.xpath("//input[@name='Height']"));
			height.clear();
			String g = suspect.get("Height");
			height.sendKeys(g);
			WebElement weight = driver.findElement(By.xpath("//input[@name='Weight']"));
			weight.clear();
			String h = suspect.get("Weight");
			weight.sendKeys(h);
			WebElement selectBuild = driver.findElement(By.xpath("//select[@ng-model='wizard.report.build']"));
			selectBuild.findElement(By.xpath("option[@value='A']")).click();
			WebElement selectHairCol = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairColor']"));
			selectHairCol.findElement(By.xpath("option[@value='BRO']")).click();
			WebElement selectHairLen = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairLength']"));
			selectHairLen.findElement(By.xpath("option[@value='Short']")).click();
			WebElement selectHairStyle = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairStyle']"));
			selectHairStyle.findElement(By.xpath("option[@value='Afro']")).click();
			WebElement selectEye = driver.findElement(By.xpath("//select[@ng-model='wizard.report.eyeColor']"));
			selectEye.findElement(By.xpath("option[@value='BRO']")).click();
			WebElement selectCompl = driver.findElement(By.xpath("//select[@ng-model='wizard.report.complexion']"));
			selectCompl.findElement(By.xpath("option[@value='Freckled']")).click();
			WebElement selectTeeth = driver.findElement(By.xpath("//select[@ng-model='wizard.report.teeth']"));
			selectTeeth.findElement(By.xpath("option[@value='Rotten']")).click();
			WebElement selectHand = driver.findElement(By.xpath("//select[@ng-model='wizard.report.handPreference']"));
			selectHand.findElement(By.xpath("option[@value='Left']")).click();
			WebElement language = driver.findElement(By.xpath("//input[@name='primary-language']"));
			String i = suspect.get("Language");
			language.sendKeys(i);
			WebElement street = driver.findElement(By.xpath("//input[@name='street-address']"));
			String j = suspect.get("Street Address");
			street.sendKeys(j);
			WebElement selectCountry = driver.findElement(By.xpath("//select[@ng-model='wizard.report.country']"));
			selectCountry.findElement(By.xpath("option[@value='US']")).click();
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			String k = suspect.get("City");
			city.sendKeys(k);
			WebElement selectState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.state']"));
			selectState.findElement(By.xpath("option[@value='CA']")).click();
			WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
			String l = suspect.get("Zip");
			zip.sendKeys(l);
			WebElement telephone = driver.findElement(By.xpath("//input[@name='phone']"));
			String m = suspect.get("Phone");
			telephone.sendKeys(l);
			WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
			String n = suspect.get("Email");
			email.sendKeys(n);
			WebElement drvr = driver.findElement(By.xpath("//label/input[@value='passenger']"));
			drvr.click();
			WebElement next1 = driver.findElement(By.xpath("//li/a[@ng-click='wizard.go(3)'][text()='Next']"));
			next1.click();
			Thread.sleep(1000);
			WebElement tatoos = driver.findElement(By.xpath("//label/input[@ng-model='wizard.report.tattoos']"));
			tatoos.click();
			WebElement tatoosText = driver.findElement(By.xpath("//input[@name='Tattoos']"));
			String o = suspect.get("Tatoos");
			tatoosText.sendKeys(o);
			WebElement next2 = driver.findElement(By.xpath("//li/a[@ng-click='wizard.go(4)'][text()='Next']"));
			next2.click();
			WebElement ssn = driver.findElement(By.xpath("//input[@name='socialSecurity']"));
			String p = suspect.get("Social Security");
			ssn.sendKeys(p);
			WebElement drLicense = driver.findElement(By.xpath("//input[@name='driverLicense']"));
			String q = suspect.get("Driver License");
			drLicense.sendKeys(q);
			WebElement selectIdState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.dlState']"));
			selectIdState.findElement(By.xpath("option[@value='CA']")).click();
			WebElement otherIdNumber = driver.findElement(By.xpath("//input[@name='other-id']"));
			String r = suspect.get("Other ID");
			otherIdNumber.sendKeys(r);
			WebElement selectOtherCountry = driver.findElement(By.xpath("//select[@name='otherIdCountry']"));
			selectOtherCountry.findElement(By.xpath("option[@value='CA']")).click();
			WebElement otherState = driver.findElement(By.xpath("//input[@name='otherIdState']"));
			String s = suspect.get("Other State");
			otherState.sendKeys(s);
			WebElement otherTypeId = driver.findElement(By.xpath("//input[@name='other-id-type']"));
			String t = suspect.get("Other Type ID");
			otherTypeId.sendKeys(t);
			WebElement schoolName = driver.findElement(By.xpath("//input[@name='school-name']"));
			String u = suspect.get("School Name");
			schoolName.sendKeys(u);
			WebElement schoolAddress = driver.findElement(By.xpath("//input[@name='school-address']"));
			String v = suspect.get("School Address");
			schoolAddress.sendKeys(v);
			WebElement schoolCity = driver.findElement(By.xpath("//input[@name='school-city']"));
			String w = suspect.get("School City");
			schoolCity.sendKeys(w);
			WebElement selectSchoolState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.schoolState']"));
			selectSchoolState.findElement(By.xpath("option[@value='CA']")).click();
			WebElement schoolZip = driver.findElement(By.xpath("//input[@name='school-zip']"));
			String x = suspect.get("School Zip");
			schoolZip.sendKeys(x);
			WebElement parentName = driver.findElement(By.xpath("//input[@name='parent-name']"));
			String y = suspect.get("Parent Name");
			parentName.sendKeys(y);
			WebElement parentAddress = driver.findElement(By.xpath("//input[@name='parent-address']"));
			String z = suspect.get("Parent Address");
			parentAddress.sendKeys(z);
			WebElement parentCity = driver.findElement(By.xpath("//input[@name='parent-city']"));
			String aa = suspect.get("Parent City");
			parentCity.sendKeys(aa);
			WebElement selectParentState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.parentState']"));
			selectParentState.findElement(By.xpath("option[@value='CA']")).click();
			WebElement schoolTelephone = driver.findElement(By.xpath("//input[@name='schoolTelephone']"));
			String bb = suspect.get("School Telephone");
			schoolTelephone.sendKeys(bb);
			WebElement occupation = driver.findElement(By.xpath("//input[@name='occupation']"));
			String cc = suspect.get("Occupation");
			occupation.sendKeys(cc);
			WebElement employersName = driver.findElement(By.xpath("//input[@name='employer-name']"));
			String dd = suspect.get("Employer Name");
			employersName.sendKeys(dd);
			WebElement employersAddress = driver.findElement(By.xpath("//input[@name='employer-address']"));
			String ee = suspect.get("Employer Address");
			employersAddress.sendKeys(ee);
			WebElement employersCity = driver.findElement(By.xpath("//input[@name='employer-city']"));
			String ff = suspect.get("Employer City");
			employersCity.sendKeys(ff);
			WebElement selectEmployersState = driver
					.findElement(By.xpath("//select[@ng-model='wizard.report.employerState']"));
			selectEmployersState.findElement(By.xpath("option[@value='CA']")).click();
			WebElement employersZip = driver.findElement(By.xpath("//input[@name='employer-zip']"));
			String gg = suspect.get("Employer Zip");
			employersZip.sendKeys(gg);
			WebElement employersTelephone = driver.findElement(By.xpath("//input[@name='employerTelephone']"));
			String hh = suspect.get("Employer Telephone");
			employersTelephone.sendKeys(hh);
			WebElement next3 = driver.findElement(By.xpath("//li/a[@ng-click='wizard.go(5)'][text()='Next']"));
			next3.click();
			Thread.sleep(1000);
			WebElement gangUnit = driver.findElement(By.xpath("//label[text()='Robbery']"));
			gangUnit.click();
			WebElement stopReason = driver.findElement(By.xpath("//input[@name='reasonForStop']"));
			String ii = suspect.get("Reason for Stop");
			stopReason.sendKeys(ii);
			WebElement locationOfStop = driver.findElement(By.xpath("//input[@name='locationOfStop']"));
			String jj = suspect.get("Location of Stop");
			locationOfStop.sendKeys(jj);
			WebElement dispositionOfStop = driver.findElement(By.xpath("//input[@name='dispositionOfStop']"));
			String kk = suspect.get("Disposition of Stop");
			dispositionOfStop.sendKeys(kk);
			WebElement gangName = driver.findElement(By.xpath("//input[@name='gang-name']"));
			String ll = suspect.get("Gang Name");
			gangName.sendKeys(ll);
			WebElement howLong = driver.findElement(By.xpath("//input[@name='howLong']"));
			String mm = suspect.get("How Long");
			howLong.sendKeys(mm);
			WebElement officerId = driver.findElement(By.xpath("//input[@name='officerID']"));
			String nn = suspect.get("Officer ID");
			officerId.sendKeys(nn);
			WebElement next4 = driver.findElement(By.xpath("//li/a[@ng-click='wizard.go(6)'][text()='Next']"));
			next4.click();
			WebElement vehicleLicense = driver.findElement(By.xpath("//input[@name='vehicleLicense']"));
			String oo = suspect.get("Vehicle License");
			vehicleLicense.sendKeys(oo);
			WebElement vehicleMake = driver.findElement(By.xpath("//input[@name='vehicleMake']"));
			String pp = suspect.get("Vehicle Make");
			vehicleMake.sendKeys(pp);
			WebElement vehicleModel = driver.findElement(By.xpath("//input[@name='vehicleModel']"));
			String qq = suspect.get("Vehicle Model");
			vehicleModel.sendKeys(qq);
			WebElement vehicleBody = driver.findElement(By.xpath("//input[@name='vehicleBodystyle']"));
			String rr = suspect.get("Vehicle Style");
			vehicleBody.sendKeys(rr);
			WebElement vehicleYear = driver.findElement(By.xpath("//input[@name='vehicleYear']"));
			String ss = suspect.get("Vehicle Year");
			vehicleYear.sendKeys(ss);
			WebElement vehicleColor = driver.findElement(By.xpath("//input[@name='vehicleColor']"));
			String tt = suspect.get("Vehicle Color");
			vehicleColor.sendKeys(tt);
			WebElement selectvehicleState = driver
					.findElement(By.xpath("//select[@ng-model='wizard.report.vehicleState']"));
			selectvehicleState.findElement(By.xpath("option[@value='CA']")).click();
			WebElement vehicleOdd = driver.findElement(By.xpath("//input[@name='vehicleOddities']"));
			String uu = suspect.get("Vehicle Oddities");
			vehicleOdd.sendKeys(uu);
			WebElement next5 = driver.findElement(By.xpath("//li/a[@ng-click='wizard.go(7)'][text()='Next']"));
			next5.click();
			Thread.sleep(1000);
			WebElement next6 = driver.findElement(By.xpath("//li/a[@ng-click='wizard.go(8)'][text()='Next']"));
			next6.click();
			Thread.sleep(1000);
			WebElement publishReport = driver.findElement(By.xpath("//button[@ng-click='wizard.commitReport()']"));
			publishReport.click();
			WebElement publishConfirm = driver.findElement(By.xpath("//button[@ng-click='confirm()']"));
			publishConfirm.click();
			Thread.sleep(4000);

		}

		@Test
		public void test1() throws InterruptedException {
			WebElement reports = driver.findElement(By.xpath("//span[text()='Reports']"));
			reports.click();
			Thread.sleep(2000);
			WebElement lastReport = driver.findElement(By.xpath("//tbody/tr[1]/td/div/a/img"));
			lastReport.click();
			Thread.sleep(2000);
			WebElement subjectInfo = driver.findElement(By.xpath("//*[@id='reportBody']/div[1]/div/p"));
			String reportTitle = subjectInfo.getText();
			Assert.assertEquals(reportTitle, "Subject Information");

		}

		@Test
		public void test2() throws InterruptedException {
			WebElement reports = driver.findElement(By.xpath("//span[text()='Reports']"));
			reports.click();
			Thread.sleep(2000);
			WebElement lastReport = driver.findElement(By.xpath("//tbody/tr[1]/td/div/a/img"));
			lastReport.click();
			Thread.sleep(2000);
			WebElement lastName = driver.findElement(By.xpath("//*[@id='reportBody']/div[1]/div/div[2]/div[1]/div"));
			String ln = lastName.getText();
			Assert.assertEquals(ln, "Jameson");

		}

		@Test
		public void test3() throws InterruptedException {
			WebElement reports = driver.findElement(By.xpath("//span[text()='Reports']"));
			reports.click();
			Thread.sleep(2000);
			WebElement lastReport = driver.findElement(By.xpath("//tbody/tr[1]/td/div/a/img"));
			lastReport.click();
			Thread.sleep(2000);
			WebElement firstName = driver.findElement(By.xpath("//*[@id='reportBody']/div[1]/div/div[2]/div[2]/div"));
			String fn = firstName.getText();
			Assert.assertEquals(fn, "John");

		}

		@Test
		public void test4() throws InterruptedException {
			WebElement reports = driver.findElement(By.xpath("//span[text()='Reports']"));
			reports.click();
			Thread.sleep(2000);
			WebElement lastReport = driver.findElement(By.xpath("//tbody/tr[1]/td/div/a/img"));
			lastReport.click();
			Thread.sleep(2000);
			WebElement socialSecurity = driver.findElement(By.xpath("//*[@id='reportBody']/div[3]/div/div[1]/div[1]/div"));
			String ss = socialSecurity.getText();
			Assert.assertEquals(ss, "123345678");

		}

		@AfterTest
		public void tearDown() {
			driver.quit();
		}
}


