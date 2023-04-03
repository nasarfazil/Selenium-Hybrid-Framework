package com.aussibum.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aussibum.base.BaseClass;
import com.aussibum.dataprovider.DataProviders;
import com.aussibum.pageobject.CartPage;
import com.aussibum.pageobject.HomePage;
import com.aussibum.utility.AllureListener;
import com.aussibum.utility.Log;
import com.aussibum.utility.VideoRecorder;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
@Listeners(AllureListener.class)
public class HomeTest extends BaseClass{

	private HomePage homepage;

	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) throws Exception {
		launchApp(browser); 
	}

//	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
//	public void tearDown() throws Exception {
//		getDriver().quit();
//	}
	@Test(priority = 0,groups= {"Smoke","Sanity","Regression"},description = "Verifying product add to the cart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verifying product add to the cart session")
	@Story("Story Name: To Check product added to cart or not")
	public void Verify_Product_addedtocart_Tc01() throws Exception {
		homepage=new HomePage(); 
		homepage.Click_on_underwear();
		homepage.click_on_size();
		homepage.click_on_Addtocart();
	}
}
//testds

//hdhhdfhdfhh rathesh
