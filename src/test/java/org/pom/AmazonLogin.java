package org.pom;
import org.baseclass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin extends BaseClass{
	
	public AmazonLogin() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement AccountBtn;
	
	@FindBy(xpath="(//span[contains(text(),'Sign in')])[1]")
	private WebElement SignBtn1;
	
	@FindBy(xpath="//input[contains(@id,'email')]")
	private WebElement EmailTB;
	
	@FindBy(xpath="//input[contains(@id,'continue')]")
	private WebElement ContinueBtn;
	
	@FindBy(xpath="//input[contains(@id,'ap_password')]")
	private WebElement PasswordTB;
	
	@FindBy(xpath="//input[contains(@id,'signInSubmit')]")
	private WebElement SignBtn2;

	public WebElement getAccountBtn() {
		return AccountBtn;
	}

	public void setAccountBtn(WebElement accountBtn) {
		AccountBtn = accountBtn;
	}

	public WebElement getSignBtn1() {
		return SignBtn1;
	}

	public void setSignBtn1(WebElement signBtn1) {
		SignBtn1 = signBtn1;
	}

	public WebElement getEmailTB() {
		return EmailTB;
	}

	public void setEmailTB(WebElement emailTB) {
		EmailTB = emailTB;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		ContinueBtn = continueBtn;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public void setPasswordTB(WebElement passwordTB) {
		PasswordTB = passwordTB;
	}

	public WebElement getSignBtn2() {
		return SignBtn2;
	}

	public void setSignBtn2(WebElement signBtn2) {
		SignBtn2 = signBtn2;
	}
	
	
	
	
	

}
