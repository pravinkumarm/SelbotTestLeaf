package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selbot.testng.api.base.Annotations;

public class DuplicateLead extends Annotations {

	public DuplicateLead() {
		PageFactory.initElements(driver, this);
	}
	 
	
	@FindBy(how=How.NAME, using="submitButton") WebElement eleClickCreateLeadButton;
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId") WebElement eleSelectSource;
	
	public DuplicateLead selectSource() {
		Select dropdown= new Select(eleSelectSource);
		dropdown.selectByVisibleText("Cold Call");
		return this;
	}
	
	public ViewLead clickSubmitButton() {
		click(eleClickCreateLeadButton);
		return new ViewLead();
	}
	
	
	
	
	/*
	 * @Test(dataProvider = "fetchData") public void dupLead(String phoneNumber)
	 * throws InterruptedException { driver.findElementByLinkText("Leads").click();
	 * driver.findElementByLinkText("Find Leads").click();
	 * driver.findElementByXPath("//span[text()='Phone']").click();
	 * driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(
	 * phoneNumber);
	 * driver.findElementByXPath("//button[text()='Find Leads']").click();
	 * Thread.sleep(2000); driver.
	 * findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"
	 * ).click(); driver.findElementByLinkText("Duplicate Lead").click();
	 * driver.findElementByName("submitButton").click(); }
	 */
}
