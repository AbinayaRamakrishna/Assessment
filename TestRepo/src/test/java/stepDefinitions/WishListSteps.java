package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Parent;
import pages.WishListPOM;
import utilities.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;


public class WishListSteps extends Parent {

    WishListPOM us8 = new WishListPOM();
	private JavascriptExecutor driver;

    @Then("Click on the Sign In button")
    public void clickOnTheSignInButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(us8.signInBtn));
    	myClick(us8.signInBtn);
    }

    @And("Enter the email and password then click the login button")
    public void enterTheEmailAndPasswordThenClickTheLoginButton() {
        mySendKeys(us8.emailPlc, ConfigReader.getProperty("email"));
        mySendKeys(us8.passwordPlc, ConfigReader.getProperty("password"));
        wait.until(ExpectedConditions.elementToBeClickable(us8.loginBtn));
        myClick(us8.loginBtn);
    }


    @Then("Hover over on the Product and click Wish List button")
    public void hoverOverOnTheProductAndClickWishListButton() {
        WebElement e = us8.getWebElement("products");
        hoverOver(e);
        wait.until(ExpectedConditions.
                visibilityOf(us8.addToWLButtons.get(WishListPOM.rand)));
        myJsClick(us8.addToWLButtons.get(WishListPOM.rand));
    }

    @Then("Check if the number of products in the Wish List is correct")
    public void checkIfTheNumberOfProductsInTheWishListIsCorrect() {
        wait.until(ExpectedConditions.visibilityOf(us8.wlCounter));
        String splitted = us8.wlCounter.getText().
                replaceAll("[^0-9]", "");

        int wlSize = Integer.parseInt(splitted);
        Assert.assertEquals(wlSize, us8.wishlistProducts.size());
    }

    @Then("Hover over on the Product and click remove from list button")
    public void hoverOverOnTheProductAndClickRemoveFromListButton() {
    	if (!us8.wishlistProducts.isEmpty() && !us8.removeItemButtons.isEmpty()) {
            WebElement e = us8.getWebElement("wishlistProducts");
            hoverOver(e);
            wait.until(ExpectedConditions.visibilityOf(us8.removeItemButtons.get(0)));
            myJsClick(us8.removeItemButtons.get(0));
        } else {
            System.out.println("Wishlist is empty or no remove buttons found!");
        }
    }

    @And("Check if the item removed message displayed")
    public void checkIfTheItemRemovedMessageDisplayed() {
        Assert.assertTrue(us8.removedMessage.getText().contains("removed"));
    }

    @Then("Hover over on the Product and update the quantity to {string}")
    public void hoverOverOnTheProductAndUpdateTheQuantity(String qt) {
        if (!us8.wishlistProducts.isEmpty() && !us8.quantityPlaceholders.isEmpty()) {
            WebElement e = us8.getWebElement("wishlistProducts");
            hoverOver(e);

            // Wait for the quantity placeholder to be visible and clickable
            WebElement quantityInput = us8.quantityPlaceholders.get(0);
            wait.until(ExpectedConditions.visibilityOf(quantityInput));
            wait.until(ExpectedConditions.elementToBeClickable(quantityInput));

            // Use the WebDriver instance directly
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

            // Scroll to the element if it's not in view
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", quantityInput);

            // Clear and update the quantity
            quantityInput.clear();  
            quantityInput.sendKeys(qt);
        } else {
            System.out.println("Wishlist is empty or quantity placeholders not found!");
        }
    }
    
    @Then("Check if the quantity of selected product changed")
    public void checkIfTheQuantityOfSelectedProductChanged() {
        WebElement e = us8.getWebElement("wishlistProducts");
        hoverOver(e);
        wait.until(ExpectedConditions.
                visibilityOf(us8.quantityPlaceholders.get(0)));
        Assert.assertEquals(us8.quantityPlaceholders.get(0).getAttribute("value"), "3");
    }
}
