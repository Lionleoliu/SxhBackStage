package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//aside[@id = 'nav']//a[@class='auto']//span[text()='产品管理']")
    public WebElement productManagerMainMenu;

    @FindBy(xpath = "//aside[@id = 'nav']//a[@class='auto menu-li']//span[text()='产品管理']")
    public WebElement productManagerSubMenu;

    @FindBy(linkText = "新增")
    public WebElement createProprietaryProduct;

    @FindBy(name = "prod_name")
    public WebElement productName;

    @FindBy(id="catId")
    private WebElement productCategory;

    @FindBy(id="tagator_inputTagator")
    private WebElement productTag;

    @FindBy(className = "tagator_option active")
    private WebElement productTagInfo;

    @FindBy(id="unit")
    private WebElement sellingModel;

    @FindBy(id="salesModelValue1")
    private WebElement quota;

    @FindBy(id="supplyType")
    private WebElement supplyType;

    @FindBy(id="select2-supplyId-container")
    private WebElement sellByProxy;

    @FindBy(xpath = "//li[@data-select2-id='33']")
    public WebElement sellByProxySuppler;







    public WebElement getProductName() {
        return productName;
    }

    public WebElement getProductManagerMainMenu() {
        return productManagerMainMenu;
    }

    public WebElement getProductManagerSubMenu() {
        return productManagerSubMenu;
    }

    public WebElement getProductCategory() {
        return productCategory;
    }
    public WebElement getCreateProprietaryProduct() {
        return createProprietaryProduct;
    }


}
