
package lims.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lims.baseclass.BaseClass;

public class LimsLoginPage  extends BaseClass{
	public LimsLoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUserName")
	private WebElement txtUserName;
	@FindBy(id="txtPassword")
	private WebElement txtPassword;
	@FindBy (id="btnLogin")
	private WebElement btnLogin;
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public void page(String txtUserName, String txtPassword) {
	sendKey(getTxtUserName(), txtUserName);
	sendKey(getTxtPassword(), txtPassword);
	click(getBtnLogin());

	}
}
	
	


