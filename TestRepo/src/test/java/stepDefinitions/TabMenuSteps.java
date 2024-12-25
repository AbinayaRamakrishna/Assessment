package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Parent;
import pages.TabMenuPOM;

import java.util.Arrays;
import java.util.List;

public class TabMenuSteps extends Parent {
    TabMenuPOM cnt = new TabMenuPOM();

    @And("Click the Main categories in the TAB Menu")
    public void clickTheMainCategories(DataTable links) {

        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = cnt.getWebElement(linkList.get(i));
            cnt.myClick(linkWebElement);
        }
    }

    @Then("User should be able to see the all main and sub categories")
    public void userShouldBeAbleToSeeTheAllMainAndSubCategories() {
        List<String> expectedCategory = Arrays.asList("whatsNew", "women", "womenTops", "womenBottoms",
                "men", "menTops", "menBottoms", "gear", "training", "sale"
        );
        for (String ct : expectedCategory) {
            WebElement categoryItems = cnt.getWebElement(ct);
            waitUntilVisibilityOf(categoryItems);
            scrollToElement(categoryItems);
            cnt.hoverOver(categoryItems);
            cnt.wait(1);

            Assert.assertTrue(categoryItems.isDisplayed(), "Sub category " + categoryItems + " is not displayed.");
        }
    }
}
