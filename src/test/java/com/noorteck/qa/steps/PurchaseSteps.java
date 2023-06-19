package com.noorteck.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.Constants;
import com.noorteck.qa.pages.PurchaseTicketPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseSteps {
	
		PurchaseTicketPage purchase;
	
	@Given("User navigates to Register Page {string}")
	public void navigateToRegisterPage(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);	
		Thread.sleep(2000);
		
		
		purchase = new PurchaseTicketPage();
	
		
	}

	@When("User enters First Name and Last Name {string}")
	public void userEntersFirstNameLastName(String firstLastName) {
		purchase.enterFirstLastName(firstLastName);
 
	}

	@When("User enters Address {string}")
	public void enterUserAddress(String address) {
		
		purchase.enterAddress(address);
	    
	}

	@When("User enters City {string}")
	public void enterUserCity(String city) {
		purchase.enterCity(city);
		
	}

	@When("User enters State {string}")
	public void enterUserState(String state) {
		purchase.enterState(state);
	
	}

	@When("User enters Zip Code {string}")
	public void enterUserZipCode(String zipCode) {
		purchase.enterZipCode(zipCode);
	}

	@When("User selects Card Type {string}")
	public void userSelectsCardType(String cardType) {
		purchase.selectCardType(cardType);
	
	}

	@When("User enters Credit Card Number {string}")
	public void userEntersCreditCardNumber(String creditCardNumber) {
		purchase.enterCreditCardNumber(creditCardNumber);
	    
	}

	@When("User enters Card Expiration Month {string}")
	public void enterCardExpMonth(String expMonth) {
		purchase.enterCardExpMonth(expMonth);
		
	}

	@When("enters Card Expiration Year {string}")
	public void entersCardExpirationYear(String expYear) {
		purchase.enterCardExpYear(expYear);
	    
	}

	@When("User enters Name on Card {string}")
	public void userEntersNameOnCard(String nameOnCard) {
		purchase.enterNameOnCard(nameOnCard);
	 
	}

	@When("User selects Remember Me Checkbox {string}")
	public void userSelectsRememberMeCheckbox(String selectCheckbox) {
	    purchase.selectRememberMe(selectCheckbox);
	}

	@When("User clicks Purchase Flight button")
	public void userClicksPurchaseFlightButton() throws InterruptedException {
	    purchase.PurchaseFlightButton();
	   
	}
	@Then("User Verifies Success Message {string}")
	public void userVerifyMessage(String message) throws InterruptedException {
		System.out.println(message);
		
		Thread.sleep(3000);
		Constants.driver.quit();
	
	}

}
