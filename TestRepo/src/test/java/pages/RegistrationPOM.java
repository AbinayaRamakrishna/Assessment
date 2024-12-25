package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class RegistrationPOM {

    public RegistrationPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(linkText = "Create an Account")
    public WebElement createAccountBtn;

    @FindBy(css = "button[title=\"Create an Account\"]")
    public WebElement submitRegistrationBtn;

    @FindBy(css = "form[id=\"form-validate\"] div input")
    public List<WebElement> registrationForm;

    @FindBy(xpath = "//div[contains(text(),\"Thank you\")]")
    public WebElement accCreatedSuccessMessage;

}
