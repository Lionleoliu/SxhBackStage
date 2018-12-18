package tests;

import Data.DataSource;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import Data.Setup;
import pages.ProductPage;

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






    }


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
