package org.hotel.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MavenNew.BaseClass;

public class PomAdactinp3 extends BaseClass{
	public PomAdactinp3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	WebElement radiobutton_1;
	
	@FindBy(xpath="//input[@name='continue']")
	WebElement contnue;

	public WebElement getRadiobutton_1() {
		return radiobutton_1;
	}

	public void setRadiobutton_1(WebElement radiobutton_1) {
		this.radiobutton_1 = radiobutton_1;
	}

	public WebElement getContnue() {
		return contnue;
	}

	public void setContnue(WebElement contnue) {
		this.contnue = contnue;
	}
}
