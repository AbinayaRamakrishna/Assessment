package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class TabMenuPOM extends Parent {
    public TabMenuPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@id='store.menu']//ul)[1]/li")
    public List<WebElement> tabMenuVerification;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[1]")
    public WebElement whatsNew;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[2]")
    public WebElement women;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[3]")
    public WebElement men;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[4]")
    public WebElement gear;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[5]")
    public WebElement training;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[6]")
    public WebElement sale;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li)[1]/a")
    public WebElement womenTops;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li)[2]/a")
    public WebElement womenBottoms;
    @FindBy(xpath = "//*[@id=\"ui-id-17\"]")
    public WebElement menTops;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li)[2]/a")
    public WebElement menBottoms;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[5]/ul/li")
    public WebElement trainingSubCat;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li")
    public List<WebElement> womenTopsAndBottoms;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li")
    public List<WebElement> menTopsAndBottoms;
    @FindBy(xpath = "((//div[@id='store.menu']//ul)[1]/li)[4]/ul/li")
    public List<WebElement> gearSubCategory;
    @FindBy(css = "[id='ui-id-2']>li>a")
    public List<WebElement> tabMenu;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[1]/li")
    public List<WebElement> womenTopsSubCat;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[2]/li")
    public List<WebElement> womenBottomsSubCat;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[1]/li")
    public List<WebElement> menTopsSubCat;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[2]/li")
    public List<WebElement> menBottomsSubCat;
    @FindBy(xpath = "(//*[text()='Jackets'])[1]")
    public WebElement jacketsWm;
    @FindBy(xpath = "(//*[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement hoodiesWm;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[1]/li)[3]")
    public WebElement teesWm;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[1]/li)[4]")
    public WebElement brasAndTanksWm;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[2]/li)[1]")
    public WebElement pantsWm;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[2]/li)[2]")
    public WebElement shortsWm;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[1]/li)[1]")
    public WebElement jacketsMn;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[1]/li)[2]")
    public WebElement hoodiesMn;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[1]/li)[3]")
    public WebElement teesMn;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[1]/li)[4]")
    public WebElement tanksMn;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[2]/li)[1]")
    public WebElement pantsMn;
    @FindBy(xpath = "((((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[2]/li)[2]")
    public WebElement shortsMn;
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    public WebElement bagsGr;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[4]/ul/li)[2]")
    public WebElement fitnessGr;
    @FindBy(xpath = "(((//div[@id='store.menu']//ul)[1]/li)[4]/ul/li)[3]")
    public WebElement watchesGr;

    public WebElement getWebElement(String strWebElement) {

        switch (strWebElement) {
            case "whatsNew":
                return this.whatsNew;
            case "women":
                return this.women;
            case "men":
                return this.men;
            case "gear":
                return this.gear;
            case "training":
                return this.training;
            case "sale":
                return this.sale;
            case "trainingSubCat":
                return this.trainingSubCat;
            case "womenTops":
                return this.womenTops;
            case "womenBottoms":
                return this.womenBottoms;
            case "menTops":
                return this.menTops;
            case "menBottoms":
                return this.menBottoms;
            case "jacketsWm ":
                return this.jacketsWm;
            case "hoodiesWm ":
                return this.hoodiesWm;
            case "teesWm    ":
                return this.teesWm;
            case "brasAndTanksWm":
                return this.brasAndTanksWm;
            case "pantsWm  ":
                return this.pantsWm;
            case "shortsWm ":
                return this.shortsWm;
            case "jacketsMn":
                return this.jacketsMn;
            case "hoodiesMn":
                return this.hoodiesMn;
            case "teesMn   ":
                return this.teesMn;
            case "tanksMn  ":
                return this.tanksMn;
            case "pantsMn  ":
                return this.pantsMn;
            case "shortsMn ":
                return this.shortsMn;
            case "bagsGr   ":
                return this.bagsGr;
            case "fitnessGr":
                return this.fitnessGr;
            case "watchesGr":
                return this.watchesGr;

        }
        return null;
    }

    public List<WebElement> getListElement(String strListElement) {

        switch (strListElement) {
            case "tabMenuVerification":
                return this.tabMenuVerification;
            case "womenTopsAndBottoms":
                return this.womenTopsAndBottoms;
            case "menTopsAndBottoms":
                return this.menTopsAndBottoms;
            case "gearSubCategory":
                return this.gearSubCategory;
            case "womenTopsSubCat":
                return this.womenTopsSubCat;
            case "womenBottomsSubCat":
                return this.womenBottomsSubCat;
            case "menTopsSubCat":
                return this.menTopsSubCat;
            case "menBottomsSubCat":
                return this.menBottomsSubCat;
            case "tabMenu":
                return this.tabMenu;
        }
        return null;
    }
}
