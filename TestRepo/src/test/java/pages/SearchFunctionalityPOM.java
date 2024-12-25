package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class SearchFunctionalityPOM extends Parent {
    public SearchFunctionalityPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "div[class='value'][itemprop='sku']")
    public WebElement productCodeText;

    @FindBy(id = "search")
    public WebElement searchBoxPlc;

    @FindBy(css = "[class='action search']")
    public WebElement searchBoxCl;

    @FindBy(css = "[class='product-item-link']")
    public WebElement productText;

    @FindBy(css = "[class='message notice']")
    public WebElement noResultText;
}
