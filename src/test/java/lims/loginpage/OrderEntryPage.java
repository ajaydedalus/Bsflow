package lims.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lims.baseclass.BaseClass;

public class OrderEntryPage extends BaseClass {
	public OrderEntryPage() {
		PageFactory.initElements(driver,this);
	
	}

	@FindBy(id="Givenname")
	private WebElement txtGivenname;
	@FindBy(id="Familyname")
	private WebElement txtFamilyname;
	@FindBy(xpath="//span[text()=' SEARCH ']")
	private WebElement btnSearch;
	public WebElement getTxtGivenname() {
		return txtGivenname;
	}
	public WebElement getTxtFamilyname() {
		return txtFamilyname;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
}
