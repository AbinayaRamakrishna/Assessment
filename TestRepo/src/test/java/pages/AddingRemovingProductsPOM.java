package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class AddingRemovingProductsPOM extends Parent {

    public AddingRemovingProductsPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]")
    public WebElement tableMen;

    @FindBy(xpath = "(//*[text()='Tops'])[2]")
    public WebElement subMenuTops;

    @FindBy(xpath = "(//*[text()='Jackets'])[2]")
    public WebElement subMenuJackets;

    @FindBy(css = "[class='product name product-item-name']")
    public List<WebElement> productItemName;

    @FindBy(xpath = "(//span[@class='price'])[1]")
    public WebElement subTotal;

    @FindBy(css = "[class='minicart-price'] span")
    public List<WebElement> productPrice;

    @FindBy(css = "[class='action showcart']")
    public WebElement orderBox;

    @FindBy(css = "[class='action delete']")
    public List<WebElement> deleteBtn;

    @FindBy(css = "[class='action-primary action-accept']")
    public WebElement okBtn;

    @FindBy(css = "[class='subtitle empty']")
    public WebElement successMessage;

    @FindBy(xpath = "(//div[@class='swatch-attribute-options clearfix'])[1]/div")
    public List<WebElement> productSize;

    @FindBy(xpath = "(//div[@class='swatch-attribute-options clearfix'])[2]/div")
    public List<WebElement> productColor;

    @FindBy(id = "product-addtocart-button")
    public WebElement addToCartBtn;
    @FindBy(css = "[class='product-item-link']")
    public List<WebElement> productNameLink;

    @FindBy(xpath = "(//*[text()='Jackets'])[3]")
    public WebElement jacketsLink;

    @FindBy(css = "[class='message-success success message'] div")
    public WebElement addedProductShoppingCartText;


    public WebElement getWebElement(String elements) {
        switch (elements) {
            case "tableMen":
                return this.tableMen;
            case "subMenuTops":
                return this.subMenuTops;
            case "subMenuJackets":
                return this.subMenuJackets;
        }
        return null;
    }

}
