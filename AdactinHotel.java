package org.hotel.test;

import org.openqa.selenium.WebElement;

import MavenNew.BaseClass;

public class AdactinHotel extends BaseClass {
public static void main(String[] args) {
	LaunchBrowser();
	launchUrl("https://www.adactinhotelapp.com/");
	driver.manage().window().maximize();
	PomAdactinp1 p1 = new PomAdactinp1();
	fillTextBox(p1.getUsername(),"gopinathsri");
	fillTextBox(p1.getPassword(),"Gopi@2020");
	btnClick(p1.getLogin());
	PomAdactinp2 p2 = new PomAdactinp2();
	selectByIndex(p2.getLocation(), 6);
	selectByIndex(p2.getHotels(),2);
	selectByIndex(p2.getRoom_type(),3);
	selectByIndex(p2.getRoom_nos(),2);
	filltextBox(p2.getDatepick_in(), 10/02/2021);
    filltextBox(p2.getDatepick_out(), 11/02/2021);
    selectByIndex(p2.getAdult_room(), 1);
	selectByIndex(p2.getChild_room(),1 );
	btnClick(p2.getSubmit());
	PomAdactinp3 p3 = new PomAdactinp3();
	btnClick(p3.getRadiobutton_1());
	btnClick(p3.getContnue());
	PomAdactinp4 p4 =new PomAdactinp4();
	fillTextBox(p4.getFirst_name(), "Gopinath");
	fillTextBox(p4.getLast_name(), "r");
	fillTextBox(p4.getAddress(), "Chennai");
	fillTextBox(p4.getCc_num(), "1234567891234568");
	selectByIndex(p4.getCc_type(), 2);
	selectByIndex(p4.getCc_exp_month(), 6);
	selectByIndex(p4.getCc_exp_year(), 12);
	fillTextBox(p4.getCc_cvv(), "222");
	btnClick(p4.getBook_now());
	//table[@width='100%']
	}
}
