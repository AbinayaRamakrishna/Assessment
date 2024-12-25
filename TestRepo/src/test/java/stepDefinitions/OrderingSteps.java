package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Parent;
import pages.OrderingPOM;
import utilities.ConfigReader;

import java.util.List;
import java.util.NoSuchElementException;

public class OrderingSteps extends Parent {
    OrderingPOM cnt = new OrderingPOM();

    @And("Enter the valid credentials in the placeholders provided")
    public void enterTheValidCredentials() {
        cnt.mySendKeys(cnt.email, ConfigReader.getProperty("email"));
        cnt.mySendKeys(cnt.password, ConfigReader.getProperty("password"));
        cnt.myClick(cnt.signInBtn);
    }

    @When("Hover over the tab menu categories")
    public void hoverOverTheTabMenuCategories(DataTable links) {
        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            cnt.waitUntilVisibilityOf(cnt.getWebElement(linkList.get(i)));
            cnt.hoverOver(cnt.getWebElement(linkList.get(i)));
            cnt.wait(2);
        }
    }

    @And("Click on the element in content")
    public void clickOnTheProduct(DataTable links) {
        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            cnt.wait(2);
            cnt.waitUntilElementToBeClickable(cnt.getWebElement(linkList.get(i)));
            cnt.myJsClick(cnt.getWebElement(linkList.get(i)));
            cnt.wait(2);
        }
        
    }

    @And("Add the product to the cart by selecting size and color.")
    public void addTheProductToTheCartBySelectingSizeAndColor() {

        if (cnt.productSize.size() <= 5) {
            List<WebElement> listElements = cnt.productSize.subList(0, cnt.productSize.size());
            int range = Parent.randomGenerator(cnt.productColor.size());
            WebElement randomSize = listElements.get(range);
            cnt.waitUntilElementToBeClickable(randomSize);
            cnt.myJsClick(randomSize);
        }
        if (cnt.productColor.size() <= 3) {
            List<WebElement> listElements = cnt.productColor.subList(0, cnt.productColor.size());
            int range = Parent.randomGenerator(cnt.productColor.size());
            WebElement randomColor = listElements.get(range);
            cnt.waitUntilElementToBeClickable(randomColor);
            cnt.myJsClick(randomColor);
        }
        cnt.myJsClick(cnt.addToCartBtn);
        cnt.waitUntilVisibilityOf(cnt.shoppingCartText);
        Assert.assertTrue(cnt.shoppingCartText.isDisplayed(), "No message is present !");
    }

    @And("View the shopping cart and update the quantifies or remove a product if necessary")
    public void viewTheShoppingCartAndUpdate() {
        cnt.myClick(cnt.shoppingCart);
        cnt.myClick(cnt.viewCart);
        cnt.waitUntilVisibilityOf(cnt.quantity2);
        WebElement clearInput = cnt.quantity2;
        clearInput.clear();
        cnt.mySendKeys(cnt.quantity2, "3");
        cnt.waitUntilElementToBeClickable(cnt.updateShoppingCart);
        cnt.myClick(cnt.updateShoppingCart);
    }

    @SuppressWarnings("null")
	@And("Select the default address or enter a new one")
    public void selectTheDefaultAddress() {
    	try {
    	    // Wait until the 'Next' button is clickable
    	    cnt.waitUntilElementToBeClickable(cnt.nextBtn);
    	    cnt.myClick(cnt.nextBtn);

    	    // Wait until the 'Place Order' button is clickable
    	    cnt.waitUntilElementToBeClickable(cnt.placeOrderBtn);

    	    JavascriptExecutor driver = null;
			// Use JavaScriptExecutor to click the 'Place Order' button
    	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    	    jsExecutor.executeScript("arguments[0].click();", cnt.placeOrderBtn);
    	} catch (NoSuchElementException e) {
    	    System.err.println("Element not found: " + e.getMessage());
    	}

}
}
