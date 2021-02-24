package org.hotel.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MavenNew.BaseClass;

public class PomAdactinp2 extends BaseClass {
	public PomAdactinp2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	WebElement room_type;
	
	@FindBy(xpath="//select[@name='room_nos']")
	WebElement room_nos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	WebElement datepick_in;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	WebElement datepick_out;
	
	@FindBy(xpath="//select[@name='adult_room']")
	WebElement adult_room;
	
	@FindBy(xpath="//select[@name='child_room']")
	WebElement child_room;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public void setRoom_nos(WebElement room_nos) {
		this.room_nos = room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public void setDatepick_in(WebElement datepick_in) {
		this.datepick_in = datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public void setDatepick_out(WebElement datepick_out) {
		this.datepick_out = datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public void setAdult_room(WebElement adult_room) {
		this.adult_room = adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public void setChild_room(WebElement child_room) {
		this.child_room = child_room;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

}
	
	