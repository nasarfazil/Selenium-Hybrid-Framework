package com.aussibum.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aussibum.actiondriver.Action;
import com.aussibum.base.BaseClass;

public class CheckoutPage extends BaseClass {
	Action action= new Action();

	@FindBy(xpath="//*[contains(@placeholder,'Enter your email address')]")
	private WebElement Clickonemail;
	@FindBy(xpath="//*[@id=\"checkout-existing-form\"]/div/div[3]/button")
	private WebElement ClickonEmailContinue; 
	@FindBy(xpath="//*[@id=\"email_confirm\"]")
	private WebElement ClickonConfirmEmail;
	@FindBy(xpath="//*[@id=\"checkout-existing-form\"]/div/div[4]/button")
	private WebElement ClickContinue1;
	@FindBy(xpath="//*[@id=\"countrySelect\"]")
	private WebElement select_country_dropdown;
	@FindBy(xpath="//*[@id=\"countryModuleWrapper\"]/div[3]/form/div[2]/button")
	private WebElement ClickContinue2;
	@FindBy(xpath="//*[@id=\"first_name\"]")
	private WebElement Click_on_Firstname;
	@FindBy(xpath="//*[@id=\"last_name\"]")
	private WebElement Click_on_lastname;
	@FindBy(xpath="//*[@id=\"dialing-code-select\"]")
	private WebElement select_countrycode;
	@FindBy(xpath="//*[@id=\"phone\"]")
	private WebElement enter_mobilenumber;
	@FindBy(xpath="//*[@id=\"companyname\"]")
	private WebElement enter_companyname;
	@FindBy(xpath="//*[@id=\"unit_number\"]")
	private WebElement enter_unitno;
	@FindBy(xpath="//*[@id=\"street_number\"]")
	private WebElement enter_address1;
	@FindBy(xpath="//*[@id=\"route\"]")
	private WebElement enter_address2;
	@FindBy(xpath="//*[@id=\"locality\"]")
	private WebElement enter_town;
	@FindBy(xpath="//*[@id=\"administrative_area_level_1\"]")
	private WebElement select_state;
	@FindBy(xpath="//*[@id=\"postal_code\"]")
	private WebElement enter_postcode;
	@FindBy(xpath="//*[@id=\"delivery_instructions\"]")
	private WebElement enter_deliveryinstruction;
	@FindBy(xpath="//*[@id=\"addressModuleWrapper\"]/div[3]/form/button")
	private WebElement Click_Continue3;
	@FindBy(xpath="//*[@id=\"shippingModuleWrapper\"]/div[3]/form/div[2]/button")
	private WebElement select_shipping_method_continue;
	@FindBy(xpath="(//div[contains(text(),'Cards')])[1]")
	private WebElement clickon_cards;
	@FindBy(xpath="//*[@id=\"adyen-cc-payment-container\"]/div/div/div[2]/div[1]/div[1]/label/div/span/iframe")
	private WebElement payment_card_number_frame;
	@FindBy(xpath="//input[@aria-label='Card number']")
	private WebElement enter_card_number;
	@FindBy(xpath="//*[@id=\"adyen-cc-payment-container\"]/div/div/div[2]/div[1]/div[2]/div[1]/label/div/span/iframe")
	private WebElement expire_date_frame;
	@FindBy(xpath="//input[@aria-label='Expiry date']")
	private WebElement enter_expire_date;
	@FindBy(xpath="//*[@id=\"adyen-cc-payment-container\"]/div/div/div[2]/div[1]/div[2]/div[2]/label/div/span/iframe")
	private WebElement cvv_number_frame;
	@FindBy(xpath="//input[@aria-label='Security code']")
	private WebElement enter_cvv_number;
	@FindBy(xpath="//input[@ name ='holderName']")
	private WebElement enter_card_holder_name;
	@FindBy(xpath="//*[@id=\"confirm\"]")
	private WebElement click_accept_TandC;


	public CheckoutPage(){
		PageFactory.initElements(getDriver(), this);
	}

	public void click_on_email(String email_id) {
		action.implicitWait(getDriver(), 10);
		action.JSClick(getDriver(), Clickonemail);
		action.type(Clickonemail, email_id);
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(), ClickonEmailContinue);

	}
	public void click_on_confirm_email(String Confirm_email)
	{    
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(), ClickonConfirmEmail);
		action.type(ClickonConfirmEmail,Confirm_email);
		action.implicitWait(getDriver(), 5);  
		action.JSClick(getDriver(), ClickContinue1);
	}
	public void select_delivery_country(String country) {
		action.implicitWait(getDriver(), 10);
		action.JSClick(getDriver(), select_country_dropdown);
		action.selectByVisibleText(country, select_country_dropdown);
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(), ClickContinue2);

	}
	public void first_name_enter(String First_name) {
		action.implicitWait(getDriver(), 10);
		action.type(Click_on_Firstname, First_name);
	}
	public void last_name_enter(String Last_name) {
		action.type(Click_on_lastname, Last_name);
		action.implicitWait(getDriver(), 5);
		action.scrollBYAxises1(getDriver());	
	}
	public void select_Countrycode_mobilenumber(String countrycode) {
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(), select_countrycode);
		action.implicitWait(getDriver(), 5);
		action.selectByValue(select_countrycode, countrycode);	
	}
	public void enter_mobile_number(String mobilenumber) {
		action.type(enter_mobilenumber, mobilenumber);
	}
	public void enter_company_name(String Company_name) {
		action.type(enter_companyname, Company_name);
	}
	public void enter_unit_no(String Unit_no) {
		action.type(enter_unitno, Unit_no);
	}
	public void enter_addressline1(String Address_1) {
		action.type(enter_address1, Address_1);
	}
	public void enter_addressline2(String Address_2) {
		action.type(enter_address2, Address_2);
	}
	public void enter_Town(String Town) {
		action.type(enter_town, Town);
		action.implicitWait(getDriver(), 5);
		action.scrollBYAxises1(getDriver());	
	}
	public void select_sate(String State) {
		action.JSClick(getDriver(), select_state);
		action.implicitWait(getDriver(), 5);
		action.selectByVisibleText(State, select_state);
	}
	public void enter_postalcode(String postcode) {
		action.enter(getDriver(), enter_postcode, postcode);
	}
	public void enter_delivery_instruction(String delinst) {
		action.type(enter_deliveryinstruction, delinst);
		action.JSClick(getDriver(), Click_Continue3);
	}
	public void click_shipping_method_continue() {
		action.implicitWait(getDriver(), 5);
		action.scrollBYAxises1(getDriver());
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(),select_shipping_method_continue);
	}
	public void click_card_option() {
		action.implicitWait(getDriver(), 10);
		action.scrollBYAxises(getDriver());
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(), clickon_cards);
	}
	public void enter_card_number(String Card_number) {
		action.implicitWait(getDriver(), 5);
		action.switchToFrameByXpath(getDriver(), payment_card_number_frame);
		action.implicitWait(getDriver(), 5);
		action.type(enter_card_number, Card_number);
		action.switchToDefaultFrame(getDriver());
	}

	public void enter_expire_date(String expire_date) {
		action.implicitWait(getDriver(), 5);	
		action.switchToFrameByXpath(getDriver(), expire_date_frame);
		action.implicitWait(getDriver(), 5);	
		action.type(enter_expire_date, expire_date);
		action.switchToDefaultFrame(getDriver());
	}

	public void enter_cvv_number(String cvv_number) {
		action.implicitWait(getDriver(), 5);	
		action.switchToFrameByXpath(getDriver(), cvv_number_frame);
		action.implicitWait(getDriver(), 5);	
		action.type(enter_cvv_number, cvv_number);
		action.switchToDefaultFrame(getDriver());
	}
	public void enter_card_Name(String card_name) {
		action.implicitWait(getDriver(), 5);	
		action.scrollBYAxises1(getDriver());
		action.type(enter_card_holder_name, card_name);
		action.scrollBYAxises1(getDriver());
		action.implicitWait(getDriver(), 5);
		action.JSClick(getDriver(), click_accept_TandC);
		action.Alert(getDriver());
	}


}

