package tests;

import Data.DataSource;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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


public class LoginTest extends Setup {

    private static final Logger logger = Logger.getLogger(LoginTest.class.getName());
    public WebDriver driver;

    @Test()
    public void openBrowser() throws IOException {
        driver = InitializeDriver();
        driver.get(DataSource.url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        // Assert.assertEquals(loginPage.getSubmit().getText(),"登录 ");
        logger.info("start login");
        loginPage.getUsername().sendKeys(DataSource.userName);
        loginPage.getPassword().sendKeys(DataSource.passWord);
        loginPage.getVerifiedCode().sendKeys(DataSource.checkCode);
        loginPage.getSubmit().click();
        Assert.assertEquals("首页",driver.getTitle());
        logger.info("login success");
    }

    @Test
    public void createProduct(){
        ProductPage productPage = new ProductPage(driver);
        productPage.getProductManagerMainMenu().click();//点击主产品管理
        productPage.getProductManagerSubMenu().click();//点击次产品管理
        productPage.getCreateProprietaryProduct().click();//点击新增按钮
        productPage.getProductName().sendKeys(Setup.refFormatNowDate());//在产品名称上输入当前时间
        DataSource.selectMethod(productPage.getProductCategory(),1);//选择产品类目


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
