package com.aussibum.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aussibum.actiondriver.Action;
import com.aussibum.base.BaseClass;

import io.qameta.allure.Step;
import io.qameta.allure.Stories;

/**
 * @author Nasar
 *
 */
public class HomePage extends BaseClass {
	Action action= new Action();

	@FindBy(xpath = "//*[@id=\"ab_body\"]/header/div[3]/nav/div/div[1]/a[3]/div[2]/span")
	private WebElement Clickonunderwear;
	
	@FindBy(xpath="//*[@id=\"productList\"]/div[1]/div/div/div[2]/div/div[2]/div[6]/div/div[3]/div/span")
	private WebElement Clickonsize;
	
	@FindBy(xpath="//*[@id=\"productList\"]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/button/span[1]")
	private WebElement Clickonaddtocart;
	
	public HomePage(){
		PageFactory.initElements(getDriver(), this);
	}
	@Step("Click on the Underwear button: {0} step...")
	public void Click_on_underwear() throws Exception {
        action.implicitWait(getDriver(), 120);
		action.click(getDriver(), Clickonunderwear);
	}
	
	public void click_on_size() {
		action.implicitWait(getDriver(), 60);
		action.scrollBYAxises(getDriver());
		action.JSClick(getDriver(), Clickonsize);
	}
	
	public CartPage click_on_Addtocart() {
		action.JSClick(getDriver(), Clickonaddtocart); 
		return new CartPage();
	}	
}
