package pages;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    @FindBy(id="user-name")
    private WebElement userNameTxtBox;
    @FindBy(id="password")
    private WebElement passTxtBox;
    @FindBy(name = "login-button")
    private WebElement loginBtn;
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public void signIn(String userName,String pass){
        userNameTxtBox.sendKeys(userName);
        passTxtBox.sendKeys(pass);
        loginBtn.click();
    }
}
