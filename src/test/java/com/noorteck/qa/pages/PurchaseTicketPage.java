package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class PurchaseTicketPage {
	
	@FindBy(id="inputName")
	WebElement firstLastNameField;
	
	@FindBy(id="address")
	WebElement addressField;
	
	@FindBy(id="city")
	WebElement cityField;
	
	@FindBy(id="state")
	WebElement stateField;
	
	@FindBy(id="zipCode")
	WebElement zipCodeField;
	
	@FindBy(id="cardType")
	WebElement cardTypeDropdown;
	
	@FindBy(id="creditCardNumber")
	WebElement creditCardNumberField;
	
	@FindBy(id="creditCardMonth")
	WebElement creditCardMonthField;
	
	@FindBy(id="creditCardYear")
	WebElement creditCardYearField;
	
	@FindBy(id="nameOnCard")
	WebElement nameOnCardField;
	
	@FindBy(id="rememberMe")
	WebElement rememberCheckboxClick;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement purchaseButton;
	
	@FindBy(partialLinkText="Thank")
	WebElement sucessMessage;
	
	
	//Class Constructor
	public PurchaseTicketPage(){
		PageFactory.initElements(Constants.driver, this);

	}
	
	//methods
	 public void enterFirstLastName(String firstLastName) {
		 firstLastNameField.sendKeys(firstLastName);
		
	 }
	 
	 public void enterAddress(String address) {
		 addressField.sendKeys(address);
	 }
	 
	 public void enterCity(String city) {
		 cityField.sendKeys(city);
	 }
	 
	 public void enterState(String state) {
		 stateField.sendKeys(state);
	 }
		 
	 public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
		
		Actions actions = new Actions(Constants.driver);
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	 }
	 
	 public void selectCardType(String cardType) {
		 
		 Select select = new Select(cardTypeDropdown);
		 List<WebElement> optionList = select.getOptions();
		 
		 for (WebElement el : optionList) {
			 String elText = el.getText();
			 if (elText.equals(cardType)) {
				 el.click();
				 break;
			 }
		 }
		  
	 }

	 public void enterCreditCardNumber(String creditCardNumber) {
		 
		 creditCardNumberField.sendKeys(creditCardNumber);
	 }
	 
	 public void enterCardExpMonth(String expMonth) {
		 creditCardMonthField.sendKeys(expMonth); 
	 }
	
	 public void enterCardExpYear(String expYear) {
		 creditCardYearField.sendKeys(expYear);
	 }
	 
	 public void enterNameOnCard(String nameOnCard) {
		 nameOnCardField.sendKeys(nameOnCard);
	 }
	 public void selectRememberMe(String rememberCheckBox){
		 rememberCheckboxClick.click();
	
	 }
	 
	 public void PurchaseFlightButton() throws InterruptedException{
		 Thread.sleep(1000);
		 purchaseButton.click();
		
	 }
	 public void retrieveConfirmationMessage(String message) {
		String confirmationMessage = sucessMessage.getText();
		System.out.println("Sucess message: " + confirmationMessage);
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}	
