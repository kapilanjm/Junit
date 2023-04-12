package org.pom;

import org.baseclass.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class FaceBookSingup extends BaseClas{
	public FaceBookSingup(){
		PageFactory.initElements(driver,this);
		}
	
	public WebElement getTextUsername() {
		return textUsername;
	}

	public WebElement getTextPassword() {
		return textPassword;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

	public WebElement getClkForget() {
		return clkForget;
	}

	public WebElement getClkCreatePage() {
		return clkCreatePage;
	}

	public WebElement getBtnCreateNew() {
		return btnCreateNew;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtSurname() {
		return txtSurname;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getSltDay() {
		return sltDay;
	}

	public WebElement getSltMonth() {
		return sltMonth;
	}

	public WebElement getSltYear() {
		return sltYear;
	}

	public WebElement getBtnFemale() {
		return btnFemale;
	}

	public WebElement getBtnMale() {
		return btnMale;
	}

	public WebElement getBtnCustom() {
		return btnCustom;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

	public WebElement getBtnSignUps() {
		return btnSignUps;
	}
	public WebElement getEntervalidPhoneNumber() {
		return EntervalidPhoneNumber;
	}

	public WebElement getImgIphoneNumber() {
		return imgIphoneNumber;
	}
	
	public WebElement getSelectPronoun() {
		return selectPronoun;
	}

	public WebElement getTxtCustomGender() {
		return txtCustomGender;
	}

		@FindAll({@FindBy(xpath="//input[@name='email' or @id='email' or placeholder='Email address or phone number' or @aria-label='Email address or phone number']")})
		private WebElement textUsername;
	
		@FindAll({@FindBy(xpath="//input[@name='pass' or @id='pass' or placeholder='Password' or @aria-label='Password']")})
		private WebElement textPassword;
	
		@FindAll({@FindBy(xpath="//button[@name='login' or @id='loginbutton' or @type='submit' or contains(text(),'Log in') or @data-testid='royal_login_button']")})
		private WebElement btnLogIn;
	
		@FindAll({@FindBy(xpath="//a[@href='https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcxMjg2NTgwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login'  or contains(text(),'Forgotten password?') ]")})
		private WebElement clkForget;
	
		@FindAll({@FindBy(xpath="//a[@href='/pages/create/?ref_type=registration_form' or @class='_8esh' or contains(text(),'Create a Page')]")})
		private WebElement clkCreatePage;
		
		@FindAll({@FindBy(xpath="//a[@role='button' and @id='u_0_0_/O' or contains(text(),'Create new account')]")})
		private WebElement btnCreateNew;

		@FindAll({@FindBy(xpath="//input[@name='firstname' or @id='u_2_b_Yj']")})
		private WebElement txtFirstName;

		@FindAll({@FindBy(xpath="//input[@placeholderaria-label='Surname' or @name='lastname']")})
		private WebElement txtSurname;

		@FindAll({@FindBy(xpath="//input[@placeholderaria-label='Mobile number or email address' or @name='reg_email__']")})
		private WebElement txtEmail;
		
//		@FindBy(xpath="//div[contains(text(),'Re-enter email address')]")
//		private WebElement reEnterEmail;
		
		@FindBy(xpath="//input[@name='reg_email_confirmation__']")
		private WebElement reEnterEmail;

		public WebElement getReEnterEmail() {
			return reEnterEmail;
		}

		@FindAll({@FindBy(xpath="//input[@data-typel='password' or @autocomplete='new-password' or @name='reg_passwd__']")})
		private WebElement txtPassword;

		@FindAll({@FindBy(xpath="//select[@aria-label='Day' or @id='day' or @name='birthday_day' or @title='Day']")})
		private WebElement sltDay;

		@FindAll({@FindBy(xpath="//select[@aria-label='Month' or @id='month' or @name='birthday_month' or @title='Month']")})
		private WebElement sltMonth;

		@FindAll({@FindBy(xpath="//select[@aria-label='Year' or @id='year' or @name='birthday_year' or @title='Year']")})
		private WebElement sltYear;

		@FindAll({@FindBy(xpath="//label[@for='u_x_4_a9' or contains(text(),'Female')]")})
		private WebElement btnFemale;

		@FindAll({@FindBy(xpath="//label[@for='u_x_5_xh' or contains(text(),'Male')]")})
		private WebElement btnMale;

		@FindAll({@FindBy(xpath="//label[@for='u_x_6_Ys' or contains(text(),'Custom')]")})
		private WebElement btnCustom;
		
		@FindBy(xpath="//select[@name='preferred_pronoun']")
		private WebElement selectPronoun;
		
		@FindBy(xpath="//input[@name='custom_gender']")
		private WebElement txtCustomGender;
		
		@FindBy(xpath="//button[name='websubmit' or id='u_x_s_EY' or contains(text(),'Sign Up')]")
		private WebElement btnSignUp;

		@FindBy(xpath="(//button[name='websubmit' or id='u_x_s_EY' or contains(text(),'Sign Up')])[1]")
		private WebElement btnSignUps;
		
		@FindBy(xpath="(//i[@class='_5dbc img sp_98fCI7IVTTz sx_54513f'])[3]")
		private WebElement imgIphoneNumber;
		
		@FindBy(xpath="//div[@id='js_4y' or contains(text(),'Please enter a valid mobile number or email address.')]")
		private WebElement EntervalidPhoneNumber;
		
		public void setEntervalidPhoneNumber(WebElement entervalidPhoneNumber) {
			EntervalidPhoneNumber = entervalidPhoneNumber;
		}

		public void setImgIphoneNumber(WebElement imgIphoneNumber) {
			this.imgIphoneNumber = imgIphoneNumber;
		}

		public void setBtnSignUps(WebElement btnSignUps) {
			this.btnSignUps = btnSignUps;
		}
		
		public void setReEnterEmail(WebElement reEnterEmail) {
			this.reEnterEmail = reEnterEmail;
		}

		
		
		
		

}
	

