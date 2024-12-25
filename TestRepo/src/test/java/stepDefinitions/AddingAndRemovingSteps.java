package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Parent;
import pages.AddingRemovingProductsPOM;

import java.util.List;

public class AddingAndRemovingSteps extends Parent {

    AddingRemovingProductsPOM us5 = new AddingRemovingProductsPOM();

    @Given("Hover over on the Element")
    public void hoverOverOnTheElement(DataTable dt) {
        List<String> list = dt.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            hoverOver(us5.getWebElement(list.get(i)));

        }
    }

    @And("Click on the Element")
    public void clickOnTheElement(DataTable dt) {
        List<String> list = dt.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            myJsClick(us5.getWebElement(list.get(i)));
        }
    }

    @And("Select Product Size, Color and Add to Cart")
    public void selectProductSizeColorAndAddToCart() {
        for (int i = 0; i < 3; i++) {
            switch (us5.productItemName.get(randomGenerator(11)).getText()) {
                case "Proteus Fitness Jackshirt":

                    myClick(us5.productNameLink.get(0));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Montana Wind Jacket":
                    myClick(us5.productNameLink.get(1));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Jupiter All-Weather Trainer":
                    myClick(us5.productNameLink.get(2));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Typhon Performance Fleece-lined Jacket":
                    myClick(us5.productNameLink.get(3));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Mars HeatTech™ Pullover":
                    myClick(us5.productNameLink.get(4));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Taurus Elements Shell":
                    myClick(us5.productNameLink.get(5));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Lando Gym Jacket":
                    myClick(us5.productNameLink.get(6));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Orion Two-Tone Fitted Jacket":
                    myClick(us5.productNameLink.get(7));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Kenobi Trail Jacket":
                    myClick(us5.productNameLink.get(8));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Hyperion Elements Jacket":
                    myClick(us5.productNameLink.get(9));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
                case "Beaumont Summit Kit":
                    myClick(us5.productNameLink.get(10));
                    waitUntilElementToBeClickable(us5.addToCartBtn);
                    myClick(us5.productSize.get(randomGenerator(5)));
                    myClick(us5.productColor.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn);
                    waitUntilVisibilityOf(us5.addedProductShoppingCartText);
                    myClick(us5.jacketsLink);
                    break;
            }
        }
    }

    @And("Control of Product Price and Total Price")
    public void controlOfProductPriceAndTotalPrice() {

        myClick(us5.orderBox);
        double total = 0;

        for (int i = 0; i < us5.productPrice.size(); i++) {
            String price = us5.productPrice.get(i).getText().replaceAll("[^0-9,.]", "");
            double dbPrice = Double.parseDouble(price);
            total = total + dbPrice;

        }

        String subTotal = us5.subTotal.getText().replaceAll("[^0-9,.]", "");
        double dbSubTotal = Double.parseDouble(subTotal);

        Assert.assertTrue(total == dbSubTotal,
                "The price of the products is not equal to the total price");

        System.out.println("Total Price=" + dbSubTotal);
        System.out.println("Product Price=" + total);
    }


    @Then("The user should see There are no items in your shopping cart.")
    public void theUserShouldSeeThereAreNoItemsInYourShoppingCart() {

        verifyContainsText(us5.successMessage, "You have no items in your shopping cart.");
    }

    @And("Emptying the Products From the Order box")
    public void emptyingTheProductsFromTheOrderBox() {

        for (int i = 0; i <= us5.deleteBtn.size() + 1; i++) {

            myJsClick(us5.deleteBtn.get(0));
            myJsClick(us5.okBtn);
            wait.until(ExpectedConditions.invisibilityOf(us5.deleteBtn.get(0)));
        }

    }
}
