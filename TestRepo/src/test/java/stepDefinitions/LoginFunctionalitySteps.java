package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Parent;
import pages.LoginPOM;

public class LoginFunctionalitySteps extends Parent {
    LoginPOM us2=new LoginPOM();

    @Given("Enter the valid email and password then click the login button")
    public void enterTheValidEmailAndPasswordThenClickTheLoginButton() {
        us2.mySendKeys(us2.email, "abinaya2@gmail.com");
        us2.mySendKeys(us2.password, "Test@123");
        us2.myClick(us2.signInBtn);
        verifyContainsText(us2.successLogin,"Welcome" );    }

    @Given("Enter the null email and password then click the login button")
    public void enterTheNullEmailAndPasswordThenClickTheLoginButton() {
        us2.mySendKeys(us2.email, "");
        us2.mySendKeys(us2.password, "test123.");
        us2.myClick(us2.signInBtn);
        verifyContainsText(us2.nullEmailErrorMessage,"field");
    }

    @And("Enter the invalid email and password then click the login button")
    public void enterTheInvalidEmailAndPasswordThenClickTheLoginButton() {
        us2.mySendKeys(us2.email, "tete@uy.com");
        us2.mySendKeys(us2.password, "test123.");
        us2.myClick(us2.signInBtn);
        verifyContainsText(us2.invalidInformation,"disabled");
    }

    @And("Enter the email and null password then click the login button")
    public void enterTheEmailAndNullPasswordThenClickTheLoginButton() {
        us2.mySendKeys(us2.email, "gafol82072@agaseo.com");
        us2.mySendKeys(us2.password, "");
        us2.myClick(us2.signInBtn);
        verifyContainsText(us2.nullPassword,"field" );
    }

    @Then("Enter the email and invalid password then click the login button")
    public void enterTheEmailAndInvalidPasswordThenClickTheLoginButton() {
        us2.mySendKeys(us2.email, "gafol82072@agaseo.com");
        us2.mySendKeys(us2.password, "test1");
        us2.myClick(us2.signInBtn);
        verifyContainsText(us2.invalidInformation,"disable" );
    }

    @Given("Click on the Forgot your password")
    public void clickOnTheForgotYourPassword() {
        us2.myClick(us2.forgotPasswordBtn);
        verifyContainsText(us2.passwordPage,"receive");
    }
}
