package com.aussibum.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aussibum.base.BaseClass;
import com.aussibum.pageobject.CartPage;
import com.aussibum.pageobject.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CartTest extends BaseClass {
	private CartPage cartpage;
	@Test(priority = 1,groups= {"Smoke","Sanity","Regression"},description = "Verifying product add to the checkout page")
	public void Verify_Product_movedtocheckout_Tc02() throws Exception {
		cartpage=new CartPage(); 
		cartpage.click_on_checkout();
	}
}

