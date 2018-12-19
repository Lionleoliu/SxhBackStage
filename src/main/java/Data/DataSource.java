package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TemplatePage;

import java.io.IOException;

public class DataSource {
    public static final String userName = "383383";
    public static final String passWord = "383a@383";
    public static final String url = " https://testsxhadmin.shixiangyiwei.com/adminuser/login.html";
    public static final String checkCode = "aa040128$";
    public static final String groupMoney = "0.01";
    public static final String ciku = "测试环境接口自动化测试商品勿动人参果";
    public static final String longon = "测试环境接口自动化测试商品勿动龙眼";
    public static final String motherPrice = "0.01";
    public static final String retailPrice = "0.02";
    public static final String marketingPrice = "888";
    public static final String purchasePrice = "0.01";
    public static final String expectArriveTime = Setup.refFormatNowDate();


    public static void selectMethod(WebElement element, int index){
        Select productCategorySelect = new Select(element);
        productCategorySelect.selectByIndex(index);
    }

    public static void selectMethodByValue(WebElement element, String value){
        Select productCategorySelect = new Select(element);
        productCategorySelect.selectByValue(value);
    }

    public static void selectMethodByVisibleText(WebElement element, String value){
        Select productCategorySelect = new Select(element);
        productCategorySelect.selectByVisibleText(value);
    }

    public static void uploadPic() throws InterruptedException {
        Thread.sleep(3000);
        // 设置等待3秒
        Runtime exe = Runtime.getRuntime();
        // Java 的Runtime 模块的getruntime.exec()方法可以调用exe 程序并执行。
        try {
            String str = "E:\\autoitScript//UploadPic.exe";
            exe.exec(str);
            // 运行指定位置的.exe文件
        } catch (IOException e) {
            System.out.println("Error to run the exe");
            e.printStackTrace();
        }
    }

    public static void addProduct(WebDriver driver, String productName) {
        TemplatePage templatePage = new TemplatePage(driver);
        templatePage.getAddProduct().click();
        driver.switchTo().frame("layui-layer-iframe1");
        templatePage.getInsertProductName().sendKeys(productName);
        templatePage.getSearch().click();
        templatePage.getClick().click();
        templatePage.getAddProductSubmit().click();
    }

    public static void waitDriver(WebDriver driver, By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by)).click();
    }
}
