package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.crypto.spec.PBEKeySpec;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement pageTitle;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public boolean signInSuccessful(){
        return (pageTitle.isDisplayed());
    }
}
