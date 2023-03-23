package com.aussibum.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aussibum.actiondriver.Action;
import com.aussibum.base.BaseClass;

public class CartPage extends BaseClass{
	Action action= new Action();
	@FindBy(xpath="//*[@id=\"minicart_checkout\"]/div[2]/div/a[1]")
	private WebElement Clickoncheckout;
	@FindBy(xpath="//*[@id=\"minicart_checkout\"]/div[2]/div/a[1]")
	private WebElement scrollbycheckout;
	public CartPage(){
		PageFactory.initElements(getDriver(), this);
	}
	public void click_on_checkout() {
		action.implicitWait(getDriver(), 30);
		action.scrollByVisibilityOfElement(getDriver(), scrollbycheckout);
		action.implicitWait(getDriver(), 10);
		action.JSClick(getDriver(), Clickoncheckout);
}
}