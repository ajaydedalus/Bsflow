package lims.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lims.baseclass.BaseClass;

public class HomePage extends BaseClass{
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//i[text()='menu']")
	private WebElement btnMenu;
	@FindBy(xpath="//div[text()=' Order management ']")
	private WebElement menuOrderManagement;
	@FindBy(xpath="//div[text()=' Order entry ']//parent::mat-toolbar-row")
	private WebElement menuOrderentry;
	public WebElement getBtnMenu() {
		return btnMenu;
	}
	public WebElement getMenuOrderManagement() {
		return menuOrderManagement;
	}
	public WebElement getMenuOrderentry() {
		return menuOrderentry;
	}
	

}
