package com.aussibum.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aussibum.base.BaseClass;
import com.aussibum.dataprovider.DataProviders;
import com.aussibum.pageobject.CartPage;
import com.aussibum.pageobject.CheckoutPage;

public class CheckoutTest extends BaseClass {
	private CheckoutPage checkoutpage;
	@Test(priority = 2,groups= {"Smoke","Sanity","Regression"},dataProvider="Checkout_data",dataProviderClass = DataProviders.class,description = "Verifying order placement")
	public void Verify_Order_Place_Tc03(String eamil_id,String Confirm_email,String country,String First_name,String Last_name,String countrycode,String mobilenumber,String Company_name,String Unit_no,String Address_1,String Address_2,String Town,String State,String postcode,String delinst,String Card_number,String expire_date,String cvv_number,String card_name) throws Exception {
		checkoutpage=new CheckoutPage(); 
		checkoutpage.click_on_email(eamil_id);
		checkoutpage.click_on_confirm_email(Confirm_email);
		checkoutpage.select_delivery_country(country);
		checkoutpage.first_name_enter(First_name);
		checkoutpage.last_name_enter(Last_name);
		checkoutpage.select_Countrycode_mobilenumber(countrycode);
		checkoutpage.enter_mobile_number(mobilenumber);
		checkoutpage.enter_company_name(Company_name);
		checkoutpage.enter_unit_no(Unit_no);
		checkoutpage.enter_addressline1(Address_1);
		checkoutpage.enter_addressline2(Address_2);
		checkoutpage.enter_Town(Town);
		checkoutpage.select_sate(State);
		checkoutpage.enter_postalcode(postcode);
		checkoutpage.enter_delivery_instruction(delinst);
		checkoutpage.click_shipping_method_continue();
		checkoutpage.click_card_option();
		checkoutpage.enter_card_number(Card_number);
		checkoutpage.enter_expire_date(expire_date);
		checkoutpage.enter_cvv_number(cvv_number);
		checkoutpage.enter_card_Name(card_name);
	}
}
