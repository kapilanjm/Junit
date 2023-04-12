package org.login.signup;

import java.io.IOException;

import org.junit.*;
import org.pom.*;
public class AmazonLogIN extends AmazonLogin {
	AmazonLogin a;
	@BeforeClass
	public static void beforeClass() {
		browserLaunch2("chrome");
		time(10);
	}
	@Before
	public void beforeMethod() {
		
	}
	
	@Test
	public void testCase1() throws IOException, InterruptedException {
		urlLaunch("https://www.amazon.in");
		a=new AmazonLogin();
		clicks(a.getAccountBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getEmailTB(), readExcel("Amazon TC_LogIn", "Amazon", 4, 4));
		Assert.assertEquals("Verify Gmail", "user@gmail.com", valueAttribute(a.getEmailTB()));		
		clicks(a.getContinueBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getPasswordTB(), readExcel("Amazon TC_LogIn", "Amazon", 5, 4));
		Assert.assertEquals("Verify password", "User@1234", valueAttribute(a.getPasswordTB()));
		clicks(a.getSignBtn2());
		Thread.sleep(3000);
	
	}
	
	@Test
	public void testCase2() throws IOException, InterruptedException {
		urlLaunch("https://www.amazon.in");
		a=new AmazonLogin();
		clicks(a.getAccountBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getEmailTB(), readExcel("Amazon TC_LogIn", "Amazon", 6, 4));
		Assert.assertEquals("Verify Gmail", "user@xxx.com", valueAttribute(a.getEmailTB()));		
		clicks(a.getContinueBtn());
		Thread.sleep(3000);
		
	}
	
	@Test
	public void testCase3() throws IOException, InterruptedException {
		urlLaunch("https://www.amazon.in");
		a=new AmazonLogin();
		clicks(a.getAccountBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getEmailTB(), readExcel("Amazon TC_LogIn", "Amazon", 7, 4));
		Assert.assertEquals("Verify phone number", "+91 98989 11111", valueAttribute(a.getEmailTB()));		
		clicks(a.getContinueBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getPasswordTB(), readExcel("Amazon TC_LogIn", "Amazon", 8, 4));
		Assert.assertEquals("Verify password", "User", valueAttribute(a.getPasswordTB()));
		clicks(a.getSignBtn2());
		Thread.sleep(3000);
	}
	
	@Test
	public void testCase4() throws IOException, InterruptedException {
		urlLaunch("https://www.amazon.in");
		a=new AmazonLogin();
		clicks(a.getAccountBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getEmailTB(), readExcel("Amazon TC_LogIn", "Amazon", 9, 4));
		Assert.assertEquals("Verify 5 digits phone number", "+91 98989", valueAttribute(a.getEmailTB()));		
		clicks(a.getContinueBtn());
		Thread.sleep(3000);
	}
	
	@Test
	public void testCase5() throws IOException, InterruptedException {
		urlLaunch("https://www.amazon.in");
		a=new AmazonLogin();
		clicks(a.getAccountBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getEmailTB(), readExcel("Amazon TC_LogIn", "Amazon", 10, 4));
		Assert.assertEquals("Verify 11 digits phone number", "+91 98989 111111", valueAttribute(a.getEmailTB()));		
		clicks(a.getContinueBtn());
		Thread.sleep(3000);
		
	}
	
	@Test
	public void testCase6() throws IOException, InterruptedException {
		urlLaunch("https://www.amazon.in");
		a=new AmazonLogin();
		clicks(a.getAccountBtn());
		switchToUrl();
		swithToNewUrl();
		sendKeys(a.getEmailTB(), readExcel("Amazon TC_LogIn", "Amazon", 11, 4));
		Assert.assertEquals("Verify 0 digits phone number", "+91", valueAttribute(a.getEmailTB()));		
		clicks(a.getContinueBtn());
		Thread.sleep(3000);
		
	}
	
	@After
	public void afterMethod() {
		
	}
	
	@AfterClass
	public static void afterClass() {
		quit();
	}
	
	
	
	
	
	
	
	
}
