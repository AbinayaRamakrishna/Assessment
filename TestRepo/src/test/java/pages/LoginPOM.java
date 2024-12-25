package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class LoginPOM extends Parent{
    public LoginPOM() {PageFactory.initElements(GWD.getDriver(),this);}


    @FindBy(id="email")
    public WebElement email;

    @FindBy(css="[name='login[password]']")
    public WebElement password;

    @FindBy(css="button[class='action login primary']")
    public WebElement signInBtn;


    @FindBy(xpath="//*[@id='email-error']")
    public WebElement nullEmailErrorMessage;

    @FindBy(xpath = "(//*[@class='logged-in'])[1]")
    public WebElement successLogin;

    @FindBy(xpath = " //*[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement invalidInformation;

    @FindBy(xpath="//*[@id='pass-error']")
    public WebElement nullPassword;

    @FindBy(css = "[class='action remind']>span")
    public WebElement forgotPasswordBtn;

    @FindBy(css = "[class='field note']\n")
    public WebElement passwordPage;

}
