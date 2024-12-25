package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.Parent;
import pages.WishListPOM;

import java.util.List;

public class DataTableSteps extends Parent {
    WishListPOM us8 = new WishListPOM();

    @Then("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> list = dt.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            // GET THE ELEMENT AND CLICK
            myClick(us8.getWebElement(list.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dt) {
        List<List<String>> list = dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {
            // GET THE NECESSARY WEB ELEMENT
            WebElement txtBox = us8.getWebElement(list.get(i).get(0));
            // SEND KEYS TO THAT ELEMENT
            mySendKeys(txtBox, list.get(i).get(1));
        }
    }
}
