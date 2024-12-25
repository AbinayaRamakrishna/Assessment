package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.Parent;
import pages.AddAddressPOM;

public class AddAddressSteps extends Parent {
    AddAddressPOM us3 = new AddAddressPOM();

    @Given("Click on the my Account")
    public void clickOnTheMyAccount() {
        myClick(us3.actionsMenu);
        myClick(us3.myAccountBtn);
    }

    @And("Click on the Address Book")
    public void clickOnTheAddressBook() {
        myClick(us3.adressBook);
        myClick(us3.addNewAdressBtn);
    }


    @Then("Add new Address as {string} as {string} as {string} as {string} as {string} as {string} as {string} as {string} as {string}")
    public void addNewAddressAsAsAsAsAsAsAsAsAs(String firstName, String lastName, String company, String telephone, String street_1, String street_2, String street_3, String city, String zip) {
        mySendKeys(us3.firstName, firstName);
        mySendKeys(us3.lastName, lastName);
        mySendKeys(us3.company, company);
        mySendKeys(us3.telephone, telephone);
        mySendKeys(us3.street_1, street_1);
        mySendKeys(us3.street_2, street_2);
        mySendKeys(us3.street_3, street_3);
        mySendKeys(us3.city, city);
        Select countrySelect = new Select(us3.country);
        countrySelect.selectByVisibleText("India");
        Select stateSelect = new Select(us3.state);
        stateSelect.selectByVisibleText("Tamil Nadu");
        mySendKeys(us3.zip, zip);
        myClick(us3.saveAdressBtn);
    }

    @And("The user should receive the message that the address has been successfully added")
    public void theUserShouldReceiveTheMessageThatTheAddressHasBeenSuccessfullyAdded() {

        verifyContainsText(us3.verification, "You saved the address.");
    }
}
