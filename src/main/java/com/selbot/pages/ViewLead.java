package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class ViewLead extends Annotations {

	public ViewLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	WebElement eleClickDuplicateLead;

	@FindBy(how = How.ID, using = "viewLead_dataSources_sp")
	WebElement eleVerifySource;

	public DuplicateLead clickDuplicateLeads() {
		click(eleClickDuplicateLead);
		return new DuplicateLead();
	}
	
	public ViewLead verifySource() {
		String Source = getElementText(eleVerifySource);
		if (Source.contains("Cold Call")){
			System.out.println("The Source Name is Matching Successfully ");
		} else {
			System.out.println("The Source Name is not Matching ");
		}
		return this;
	}

}
