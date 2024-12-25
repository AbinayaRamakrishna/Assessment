package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class OrderingPOM extends Parent {
    public OrderingPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "(//input[@id='pass'])[1]")
    public WebElement password;
    @FindBy(xpath = "((//div[@class='actions-toolbar'])[1]//span)[1]")
    public WebElement signInBtn;
    @FindBy(xpath = "(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]")
    public WebElement women;
    @FindBy(xpath = "(//*[text()='Tops'])[1]")
    public WebElement womenTops;
    @FindBy(xpath = "(//*[text()='Jackets'])[1]")
    public WebElement jacketsWm;
    @FindBy(xpath = "(//*[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement hoodiesWm;
    @FindBy(xpath = "(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[7]")
    public WebElement gear;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[4]/ul/li)[1]")
    public WebElement bagsGr;
    @FindBy(xpath = "(//div[@class='swatch-attribute-options clearfix'])[1]/div")
    public List<WebElement> productSize;
    @FindBy(xpath = "(//div[@class='swatch-attribute-options clearfix'])[2]/div")
    public List<WebElement> productColor;
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "(//a[@class='product-item-link'])[1]")
    public WebElement hoodie1;
    @FindBy(xpath = "(//a[@class='product-item-link'])[3]")
    public WebElement hoodie2;
    @FindBy(xpath = "(//a[@class='product-item-link'])[4]")
    public WebElement hoodie3;
    @FindBy(xpath = "//input[@id='qty']")
    public WebElement quantity;
    @FindBy(css = "[class='input-text qty']")
    public WebElement quantity2;
    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement shoppingCart;
    @FindBy(xpath = "//a[@class='action viewcart']")
    public WebElement viewCart;
    @FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
    public WebElement proceedToCheckoutBtn;
    @FindBy(xpath = "//div[@class='shipping-address-item selected-item']")
    public WebElement defaultShippingAddress;
    @FindBy(xpath = "(//input[@name='ko_unique_5'])")
    public WebElement radioBtn;
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    public WebElement nextBtn;
    @FindBy(id = "billing-address-same-as-shipping-checkmo")
    public WebElement sameShippingAndBillingAdd;
    @FindBy(xpath = "//span[contains(text(),'Thank you for your purchase!')]")
    public WebElement confirmationMsg;
    @FindBy(xpath = "((//div[@class='checkout-success'])[1]/p)[1]")
    public WebElement orderNumMsg;
    @FindBy(xpath = "//button[@title='Place Order']")
    public WebElement placeOrderBtn;
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    public WebElement shoppingCartText;
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    public WebElement updateShoppingCart;
    @FindBy(xpath = "//span[contains(text(),'Ship Here')]")
    public WebElement shipHereBtn;

    public WebElement getWebElement(String strWebElement) {

        switch (strWebElement) {
            case "gear":
                return this.gear;
            case "women":
                return this.women;
            case "bagsGr":
                return this.bagsGr;
            case "hoodie1":
                return this.hoodie1;
            case "hoodie2":
                return this.hoodie2;
            case "hoodie3":
                return this.hoodie3;
            case "nextBtn":
                return this.nextBtn;
            case "radioBtn":
                return this.radioBtn;
            case "quantity":
                return this.quantity;
            case "viewCart":
                return this.viewCart;
            case "quantity2":
                return this.quantity2;
            case "jacketsWm":
                return this.jacketsWm;
            case "hoodiesWm":
                return this.hoodiesWm;
            case "womenTops":
                return this.womenTops;
            case "shipHereBtn":
                return this.shipHereBtn;
            case "addToCartBtn":
                return this.addToCartBtn;
            case "shoppingCart":
                return this.shoppingCart;
            case "placeOrderBtn":
                return this.placeOrderBtn;
            case "shoppingCartText":
                return this.shoppingCartText;
            case "updateShoppingCart":
                return this.updateShoppingCart;
            case "proceedToCheckoutBtn":
                return this.proceedToCheckoutBtn;
            case "defaultShippingAddress":
                return this.defaultShippingAddress;
        }
        return null;
    }
}
