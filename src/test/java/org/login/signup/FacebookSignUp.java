package org.login.signup;
import org.pom.*;

import java.io.IOException;

import org.junit.*;

public class FacebookSignUp extends FaceBookSingup{
	FaceBookSingup f;
	@BeforeClass
	public static void beforeMethod() {
		browserLanuch("chrome");
		time(10);
	}
	
	@Before
	public void before() {
		System.out.println("Start");
	}
	
	@Test
	public void testByPhoneNumberMale() throws IOException {		
		urlLaunch("https://www.facebook.com/");
		f=new FaceBookSingup();
		clicks(f.getBtnCreateNew());
		sendKeys(f.getTxtFirstName(), readExcel("LogIn_TC", "Facebook", 5, 4));
		sendKeys(f.getTxtSurname(), readExcel("LogIn_TC", "Facebook", 6, 4));
		sendKeys(f.getTxtEmail(), readExcel("LogIn_TC", "Facebook", 7, 4));
		sendKeys(f.getTxtPassword(), readExcel("LogIn_TC", "Facebook", 10, 4));
		selectByIndex(f.getSltDay(), 6);
		selectByText(f.getSltMonth(), "Apr");
		selectByText(f.getSltYear(), "2000");
		clicks(f.getBtnMale());
		clicks(f.getBtnSignUps());
		clicks(f.getImgIphoneNumber());
		getPageSources("Please enter a valid mobile number or email address.");
	}
	
	@Test
	public void testByEmailFemale() throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		f=new FaceBookSingup();
		clicks(f.getBtnCreateNew());
		sendKeys(f.getTxtFirstName(), readExcel("LogIn_TC", "Facebook", 5, 4));
		sendKeys(f.getTxtSurname(), readExcel("LogIn_TC", "Facebook", 6, 4));
		sendKeys(f.getTxtEmail(), readExcel("LogIn_TC", "Facebook", 8, 4));
		sendKeys(f.getReEnterEmail(), readExcel("LogIn_TC", "Facebook", 9, 4));
		sendKeys(f.getTxtPassword(), readExcel("LogIn_TC", "Facebook", 10, 4));
		selectByText(f.getSltMonth(), "May");
		selectByIndex(f.getSltDay(), 30);
		selectByText(f.getSltYear(), "1965");
		clicks(f.getBtnFemale());
		clicks(f.getBtnSignUps());
		linkEnable("Learn more");
		linkClick("Learn more");
		switchToUrl();
		swithToNewUrl();
		Assert.assertEquals(urlCurrrent(), "https://www.facebook.com/help/637205020878504");
	}
	
	@Test
	public void testByEmailCustoms() throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		f=new FaceBookSingup();
		clicks(f.getBtnCreateNew());
		sendKeys(f.getTxtFirstName(), readExcel("LogIn_TC", "Facebook", 5, 4));
		sendKeys(f.getTxtSurname(), readExcel("LogIn_TC", "Facebook", 6, 4));
		sendKeys(f.getTxtEmail(), readExcel("LogIn_TC", "Facebook", 8, 4));
		sendKeys(f.getReEnterEmail(), readExcel("LogIn_TC", "Facebook", 9, 4));
		sendKeys(f.getTxtPassword(), readExcel("LogIn_TC", "Facebook", 10, 4));
		selectByText(f.getSltMonth(), "Jan");
		selectByText(f.getSltDay(), "30");
		selectByText(f.getSltYear(), "1905");
		clicks(f.getBtnCustom());
		selectByIndex(f.getSelectPronoun(), 2);
		sendKeys(getTxtCustomGender(), "Transgender");
		clicks(f.getBtnSignUps());
		linkEnable("Learn more");
		linkClick("Learn more");
		switchToUrl();
		swithToNewUrl();
		Assert.assertEquals(urlCurrrent(), "https://www.facebook.com/help/637205020878504");
	
	}

	@After
	public void after() {
		System.out.println("End");
	}
	
	@AfterClass
	public static void afterMethod() {
		quit();
		
	}

}
