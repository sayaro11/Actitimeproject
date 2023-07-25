package com.Actitime.ObjectRepostory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Deceleration
		@FindBy(id="username")
		private WebElement untbx;
		
		
		@FindBy(name="pwd")
		private WebElement pwtbx;
		
		@FindBy(xpath=".///div[.='Login ']")
		private WebElement lgbtn;
		
		
		//initilaztion
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		//utilization
		
	public void setUntbx(WebElement untbx) {
		this.untbx = untbx;
	}


	public void setPwtbx(WebElement pwtbx) {
		this.pwtbx = pwtbx;
	}


	public void setLgbtn(WebElement lgbtn) {
		this.lgbtn = lgbtn;
	}

	public Object getPasswordfield() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getUsernamefield() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object geLoginbutton() {
		// TODO Auto-generated method stub
		return null;
	}


}
	
	
	

	
