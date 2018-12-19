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

    @FindBy(xpath = "//aside[@id = 'nav']//a[@class='auto menu-li']//span[text()='自营产品管理']")
    public WebElement productManagerSubMenu;

    @FindBy(linkText = "新增")
    public WebElement createProprietaryProduct;


    @FindBy(name = "prod_name")//商品名称
    public WebElement productName;

    @FindBy(id="catId")//产品类目
    private WebElement productCategory;

    @FindBy(id="tagator_inputTagator")//产品标签
    private WebElement productTag;

    @FindBy(xpath = "//div[@id = 'tagator_inputTagator']//li[text()='热卖']")//产品标签选择
    private WebElement productTagInfo;

    @FindBy(id="unit")//售卖模式
    private WebElement sellingModel;

    @FindBy(id="salesModelValue1")//按份数卖
    private WebElement quota;

    @FindBy(id="supplyType")//产品类型
    private WebElement supplyType;

    @FindBy(id="select2-supplyId-container")//供应商选框
    private WebElement sellByProxy;

    @FindBy(xpath = "//ul[@id='select2-supplyId-results']//li[text()='仟吉']")//供应商选择仟吉
    public WebElement sellByProxyChoose;

    @FindBy(id="select2-productPlaceId-container")//产品产地选框
    private WebElement productArea;

    @FindBy(xpath="//ul[@id='select2-productPlaceId-results']//li[text()='武汉黑山']")//产品产地选择武汉黑山
    private WebElement productAreaChoose;

    @FindBy(id="select2-categoryId-container")//产品品类选框
    private WebElement productType;

    @FindBy(xpath="//ul[@id='select2-categoryId-results']//li[text()='桑葚/桑葚/水果类']")//产品品类选择
    private WebElement productTypeChoose;

    @FindBy(id="select2-brandId-container")//产品品牌选框
    private WebElement productBrand;

    @FindBy(xpath = "//ul[@id='select2-brandId-results']//li[text()='红富士']")//产品品牌选择红富士
    private WebElement productBrandApple;

    @FindBy(id ="select2-specId1-container")//产品规格1
    private WebElement productSprcification1;

    @FindBy(xpath="//ul[@id='select2-specId1-results']//li[text()='长度（mm）']")//产品规格1的值长度
    private WebElement productSprcificationValue1;


    @FindBy(xpath="//div[@class='col-sm-3']//li[@class='select2-search select2-search--inline']")//产品规格值1
    private WebElement productvalue1;

    @FindBy(xpath="//ul[@id='select2-specValueId1-results']//li[text()='2']")//产品规格1的值数字2
    private WebElement productvalue1Choose;

    @FindBy(id="select2-specId2-container")//产品规格2
    private WebElement productSprcification2;

    @FindBy(xpath="//ul[@id='select2-specId2-results']//li[text()='大小型号']")//产品规格2的值大小型号
    private WebElement productSprcificationValue2;

    @FindBy(xpath="//div[@class='col-sm-3']//span[@class='select2-selection select2-selection--multiple']//input[@placeholder='请选择']")//产品规格值2
    private WebElement productvalue2;

    @FindBy(xpath="//ul[@id='select2-specValueId2-results']//li[text()='XL']")//产品规格2的值XL
    private WebElement productvalue2Choose;

    @FindBy(id="select2-specId3-container")//产品规格3
    private WebElement productSprcification3;

    @FindBy(xpath="//ul[@id='select2-specId3-results']//li[text()='颜色']")//产品规格3的值颜色
    private WebElement productSprcificationValue3;

    @FindBy(id="specValueId3")//产品规格值3
    private WebElement productvalue3;

    @FindBy(xpath="//ul[@id='select2-specValueId3-results']//li[text()='浅咖色']")//产品规格3的值浅咖色
    private WebElement productvalue3Choose;


    public WebElement getProductvalue2() {
        return productvalue2;
    }

    public WebElement getProductvalue2Choose() {
        return productvalue2Choose;
    }

    public WebElement getProductSprcification3() {
        return productSprcification3;
    }

    public WebElement getProductSprcificationValue3() {
        return productSprcificationValue3;
    }

    public WebElement getProductvalue3() {
        return productvalue3;
    }

    public WebElement getProductvalue3Choose() {
        return productvalue3Choose;
    }

    public WebElement getProductvalue1Choose() {
        return productvalue1Choose;
    }

    public WebElement getProductSprcification2() {
        return productSprcification2;
    }

    public WebElement getProductSprcificationValue2() {
        return productSprcificationValue2;
    }

    public WebElement getProductvalue1() {
        return productvalue1;
    }

    public WebElement getProductTag() {
        return productTag;
    }

    public WebElement getSellByProxyChoose() {
        return sellByProxyChoose;
    }

    public WebElement getProductTagInfo() {
        return productTagInfo;
    }

    public WebElement getSellingModel() {
        return sellingModel;
    }

    public WebElement getQuota() {
        return quota;
    }

    public WebElement getSupplyType() {
        return supplyType;
    }

    public WebElement getSellByProxy() {
        return sellByProxy;
    }

    public WebElement getProductArea() {
        return productArea;
    }

    public WebElement getProductAreaChoose() {
        return productAreaChoose;
    }

    public WebElement getProductType() {
        return productType;
    }

    public WebElement getProductTypeChoose() {
        return productTypeChoose;
    }

    public WebElement getProductBrand() {
        return productBrand;
    }

    public WebElement getProductBrandApple() {
        return productBrandApple;
    }

    public WebElement getProductSprcification1() {
        return productSprcification1;
    }

    public WebElement getProductSprcificationValue1() {
        return productSprcificationValue1;
    }

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
