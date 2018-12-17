package Data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DataSource {
    public static final String userName = "niuyue";
    public static final String passWord = "@sxh12345";
    public static final String url = "https://sxhadmin.shixiangyiwei.com/adminuser/login.html";
    public static final String checkCode = "aa040128$";


    public static void selectMethod(WebElement element, int index){
        Select productCategorySelect = new Select(element);
        productCategorySelect.selectByIndex(index);
    }
}
