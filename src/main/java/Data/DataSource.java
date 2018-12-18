package Data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DataSource {
    public static final String userName = "383383";
    public static final String passWord = "383a@383";
    public static final String url = " https://testsxhadmin.shixiangyiwei.com/adminuser/login.html";
    public static final String checkCode = "aa040128$";


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
}
