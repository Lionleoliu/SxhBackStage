package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "admin_user_name")
    public WebElement username;

    @FindBy(id = "admin_user_password")
    public WebElement password;

    @FindBy(id = "checkcode")
    public WebElement verifiedCode;

    @FindBy(id = "validate-submit")
    public WebElement submit;


    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getVerifiedCode() {
        return verifiedCode;
    }
}
