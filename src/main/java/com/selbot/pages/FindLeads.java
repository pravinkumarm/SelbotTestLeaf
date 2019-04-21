package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLeads extends Annotations {

	public FindLeads()  {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="Find Leads") WebElement eleClickFindLeads;
	@FindBy(how=How.XPATH, using="//input[@name='id']") WebElement eleEnterMyLeads;
	@FindBy(how=How.XPATH,using="//Button[text()='Find Leads']") WebElement eleClickFindLeadButton;
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") WebElement eleSelectGrid;
								  
	public FindLeads clickFindLeads() throws InterruptedException{
		click (eleClickFindLeads);
		Thread.sleep(3000);
		return this;
	}
	public FindLeads enterLeadID(String LeadID) throws InterruptedException {
		clearAndType(eleEnterMyLeads,LeadID);
		Thread.sleep(3000);
		return this;
	}
	public FindLeads clickFindButton() throws InterruptedException {
		click(eleClickFindLeadButton);
		Thread.sleep(3000);
		return this;
	}
	
	
	public ViewLead selectLeadList() throws InterruptedException {
		click (eleSelectGrid);
		Thread.sleep(3000);
		return new ViewLead();
		
	}
}
