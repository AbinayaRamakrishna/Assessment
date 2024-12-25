package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class AddAddressPOM extends Parent {
    public AddAddressPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@title='Password']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='customer-name']")
    public WebElement actionsMenu;

    @FindBy(linkText = "My Account")
    public WebElement myAccountBtn;

    @FindBy(linkText = "Address Book")
    public WebElement adressBook;

    @FindBy(xpath = "//div[@class='control']/input[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//div[@class='control']/input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//div[@class='control']/input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//div[@class='control']/input[@id='telephone']")
    public WebElement telephone;

    @FindBy(xpath = "//div[@class='control']/input[@id='street_1']")
    public WebElement street_1;

    @FindBy(xpath = "//div[@class='control']/input[@id='street_2']")
    public WebElement street_2;

    @FindBy(xpath = "//div[@class='control']/input[@id='street_3']")
    public WebElement street_3;

    @FindBy(xpath = "//div[@class='control']/input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//div[@class='control']/input[@id='zip']")
    public WebElement zip;

    @FindBy(xpath = "//div[@class='control']/select[@id='region_id']")
    public WebElement state;

    @FindBy(xpath = "//div[@class='control']/select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//div[@class='primary']/button[@class='action save primary']")
    public WebElement saveAdressBtn;

    @FindBy(xpath = "//span[normalize-space()='Add New Address']")
    public WebElement addNewAdressBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    public WebElement verification;

}
