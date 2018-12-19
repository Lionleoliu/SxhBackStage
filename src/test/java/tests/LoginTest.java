package tests;

import Data.DataSource;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import Data.Setup;
import pages.ProductPage;
import pages.TemplatePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class LoginTest extends Setup {

    private static final Logger logger = Logger.getLogger(LoginTest.class.getName());
    public WebDriver driver;

    @Test()
    public void openBrowser() throws IOException, InterruptedException {
        driver = InitializeDriver();
        driver.get(DataSource.url);
        LoginPage loginPage = new LoginPage(driver);
        // Assert.assertEquals(loginPage.getSubmit().getText(),"登录 ");
        logger.info("start login");
        loginPage.getUsername().sendKeys(DataSource.userName);
        loginPage.getPassword().sendKeys(DataSource.passWord);
        loginPage.getVerifiedCode().sendKeys(DataSource.checkCode);
        loginPage.getSubmit().click();
        Thread.sleep(1500);
        Assert.assertEquals(driver.getTitle(), "首页", "登录成功");
        logger.info("login success");
    }

    @Test
    public void createProduct() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        productPage.getProductManagerMainMenu().click();//点击主产品管理
        productPage.getProductManagerSubMenu().click();//点击自营产品管理
        productPage.getCreateProprietaryProduct().click();//点击新增按钮
        productPage.getProductName().sendKeys(Setup.refFormatNowDate());//在产品名称上输入当前时间
        DataSource.selectMethod(productPage.getProductCategory(), 1);//选择产品类目
        productPage.getProductTag().click();//选择产品标签
        Thread.sleep(1500);
        productPage.getProductTagInfo().click();//选择热卖标签
        DataSource.selectMethod(productPage.getSellingModel(), 1);//下拉框选择代销销售模式
        productPage.getQuota().sendKeys("3");//输入按份数卖
        DataSource.selectMethodByValue(productPage.getSupplyType(), "2");//在份数输入2
        productPage.getSellByProxy().click();//选择供应商
        productPage.getSellByProxyChoose().click();//供应商选择仟吉
        productPage.getProductArea().click();//点击产品产地
        productPage.getProductAreaChoose().click();//选择武汉黑山
        productPage.getProductType().click();//选择产品品类
        productPage.getProductTypeChoose().click();//选择桑葚
        productPage.getProductBrand().click();//选择商品品牌
        productPage.getProductBrandApple().click();//选择红富士
        productPage.getProductSprcification1().click();//选择产品规格1弹框
        productPage.getProductSprcificationValue1().click();//选择产品规格1值长度
        productPage.getProductvalue1().click();//选择产品规格值1的选择框
        productPage.getProductvalue1Choose().click();//选择产品规格值1的数字2
        productPage.getProductSprcification2().click();//选择产品规格2的弹框
        productPage.getProductSprcificationValue2().click();//选择产品规格2的值大小型号
        productPage.getProductvalue2().click();
        productPage.getProductvalue2Choose().click();
    }


    @Test
    public void createTemplate() throws InterruptedException {
        TemplatePage templatePage = new TemplatePage(driver);
        logger.info("准备点击模板管理按钮");
        templatePage.getTemplateManagerMainMenu().click();
        logger.info("模板管理按钮选择成功");
        logger.info("准备点击模板查询按钮");
        templatePage.getTemplateSearch().click();
        logger.info("模板查询按钮点击成功");
        logger.info("准备选择新增模板按钮");
        templatePage.getCreateTemplate().click();
        logger.info("新增模板按钮点击成功");
        templatePage.getCommunityAbholung().click();
        templatePage.getShareTitle().sendKeys(Setup.refFormatNowDate());
        templatePage.getChoosePicture1().click();
        DataSource.uploadPic();
        Thread.sleep(4000);
        templatePage.getUpLoadButton1().click();
        templatePage.getChoosePicture2().click();
        DataSource.uploadPic();
        Thread.sleep(4000);
        templatePage.getUpLoadButton2().click();
        templatePage.getChoosePicture3().click();
        DataSource.uploadPic();
        Thread.sleep(4000);
        templatePage.getUpLoadButton3().click();
        templatePage.getBeginTime().click();
        driver.switchTo().frame(0);
        templatePage.getTimeSureButton().click();
        driver.switchTo().defaultContent();
        templatePage.getEndTime().click();
        driver.switchTo().frame(0);
        DataSource.waitDriver(driver,By.xpath("//div[@id='dpTitle']//div[@class='navImg NavImgrr']//a"),10);
        //templatePage.getNextYear().click();
        templatePage.getTimeSureButton().click();
        driver.switchTo().defaultContent();
        DataSource.selectMethodByVisibleText(templatePage.getTemplateType(), "默认模板");
        templatePage.getGroupMonery().sendKeys(DataSource.groupMoney);
        DataSource.selectMethodByVisibleText(templatePage.getPageTheme(), "默认主题");
        DataSource.selectMethodByVisibleText(templatePage.getShowInventory(), "显示");
        DataSource.selectMethodByVisibleText(templatePage.getOpenPush(), "开启");
        DataSource.selectMethodByVisibleText(templatePage.getAccumulateSales(), "开启");
        DataSource.selectMethodByVisibleText(templatePage.getAlreadySaleSwitch(), "开启");
        templatePage.getNextStep().click();
        DataSource.addProduct(driver,DataSource.ciku);
        DataSource.addProduct(driver,DataSource.longon);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        templatePage.getMotherPrice().sendKeys(DataSource.motherPrice);
        templatePage.getRetailPrice().sendKeys(DataSource.retailPrice);
        templatePage.getMarketingPrice().sendKeys(DataSource.marketingPrice);
        templatePage.getPurchasePrice().sendKeys(DataSource.purchasePrice);
        templatePage.getExpectArriveTime().sendKeys(DataSource.expectArriveTime);
        Thread.sleep(3000);
        driver.get(driver.getCurrentUrl());
        templatePage.getMotherPrice2().sendKeys(DataSource.motherPrice);
        templatePage.getRetailPrice2().sendKeys(DataSource.retailPrice);
        templatePage.getMarketingPrice2().sendKeys(DataSource.marketingPrice);
        templatePage.getPurchasePrice2().sendKeys(DataSource.purchasePrice);
        templatePage.getExpectArriveTime2().sendKeys(DataSource.expectArriveTime);
        driver.get(driver.getCurrentUrl());
        Thread.sleep(2000);
        templatePage.getManualOpen().click();
        Thread.sleep(1000);
        templatePage.getOpenModuleSureButton().click();
        Thread.sleep(3000);
        //DataSource.waitDriver(driver,By.id("doopen"),10);
        templatePage.getSubmitForOpenModule().click();
        templatePage.getOpenModuleSureButton().click();
        templatePage.getLeoliu().click();
        templatePage.getOpenFinalSubmit().click();
        templatePage.getOpenModuleSureButton().click();
        templatePage.getTemplateSearch().click();
    }


//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnupload"))).click();


//    @DataProvider(name="user")
//    public Object[][] Users(){
//        return new Object[][]{
//                {"root","passowrd"},
//                {"cnblogs.com", "tankxiao"},
//                {"tank","xiao"}
//        };
//    }

//    @AfterMethod
//    public void tearDown(){
//        Setup.driver.close();
//        Setup.driver = null;
//    }
}
