package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemplatePage {

    WebDriver driver;

    public TemplatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//aside[@id = 'nav']//span[text()='模板管理']")
    public WebElement TemplateManagerMainMenu;

    @FindBy(xpath = "//aside[@id = 'nav']//span[text()='模板查询']")
    public WebElement TemplateSearch;

    @FindBy(linkText = "新增")
    public WebElement createTemplate;

    @FindBy(xpath = "//section[@id='content']//h2[text()='社区自提']")
    public WebElement communityAbholung;

    @FindBy(id="share_title")//分享名称
    private WebElement shareTitle;

    @FindBy(id="adv")//第一个选择文件
    private WebElement choosePicture1;

    @FindBy(id = "btnupload")//上传按钮
    public WebElement upLoadButton1;

    @FindBy(id="adv2")//第一个选择文件
    private WebElement choosePicture2;

    @FindBy(id = "btnupload2")//上传按钮
    public WebElement upLoadButton2;

    @FindBy(id="adv3")//第一个选择文件
    private WebElement choosePicture3;

    @FindBy(id = "btnupload3")//上传按钮
    public WebElement upLoadButton3;

    @FindBy(id = "beg_at")//上传按钮
    public WebElement beginTime;

    @FindBy(xpath = "//div[@id='dpTitle']//div[@class='navImg NavImgrr']//a")//下一年
    public WebElement nextYear;

    @FindBy(id = "dpOkInput")//确定按钮
    public WebElement timeSureButton;

    @FindBy(id = "end_at")//截止时间
    public WebElement endTime;

    @FindBy(id = "bl_type")//模板类型
    public WebElement templateType;

    @FindBy(id = "group_money")//成团金额
    public WebElement groupMonery;

    @FindBy(id = "page_theme")//页面主题
    public WebElement pageTheme;

    @FindBy(name = "is_show_inventory")//是否显示库存
    public WebElement showInventory;

    @FindBy(name = "is_ktts")//开启推送
    public WebElement openPush;

    @FindBy(name = "is_show_amount")//累计销量
    public WebElement accumulateSales;

    @FindBy(name = "is_sell_num")//已抢开关
    public WebElement alreadySaleSwitch;

    @FindBy(xpath = " //section[@id='content']//button[text()='下一步']")//下一步
    public WebElement nextStep;

    @FindBy(id = "addblprod")//添加产品
    public WebElement addProduct;

    @FindBy(name = "prod_name")//输入商品名称
    public WebElement insertProductName;

    @FindBy(id = "btnsubmit")//提交
    public WebElement addProductSubmit;

    public WebElement getAddProductSubmit() {
        return addProductSubmit;
    }

    public WebElement getInsertProductName() {
        return insertProductName;
    }

    public WebElement getAddProduct() {
        return addProduct;
    }

    public WebElement getNextStep() {
        return nextStep;
    }

    public WebElement getAlreadySaleSwitch() {
        return alreadySaleSwitch;
    }

    public WebElement getAccumulateSales() {
        return accumulateSales;
    }

    public WebElement getOpenPush() {
        return openPush;
    }

    public WebElement getGroupMonery() {
        return groupMonery;
    }

    public WebElement getPageTheme() {
        return pageTheme;
    }

    public WebElement getShowInventory() {
        return showInventory;
    }

    public WebElement getTemplateType() {
        return templateType;
    }

    public WebElement getEndTime() {
        return endTime;
    }

    public WebElement getBeginTime() {
        return beginTime;
    }

    public WebElement getNextYear() {
        return nextYear;
    }

    public WebElement getTimeSureButton() {
        return timeSureButton;
    }

    public WebElement getChoosePicture2() {
        return choosePicture2;
    }

    public WebElement getUpLoadButton2() {
        return upLoadButton2;
    }

    public WebElement getChoosePicture3() {
        return choosePicture3;
    }

    public WebElement getUpLoadButton3() {
        return upLoadButton3;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getTemplateManagerMainMenu() {
        return TemplateManagerMainMenu;
    }

    public WebElement getTemplateSearch() {
        return TemplateSearch;
    }

    public WebElement getCreateTemplate() {
        return createTemplate;
    }

    public WebElement getCommunityAbholung() {
        return communityAbholung;
    }

    public WebElement getShareTitle() {
        return shareTitle;
    }

    public WebElement getChoosePicture1() {
        return choosePicture1;
    }

    public WebElement getUpLoadButton1() {
        return upLoadButton1;
    }
}
