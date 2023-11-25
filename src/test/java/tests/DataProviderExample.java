package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import data.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ProductsPage;
import pages.SignInPage;

public class DataProviderExample extends TestBase{
    SignInPage sign;
    ProductsPage product;
    @DataProvider(name = "credentials")
    public Object[][]data() throws IOException {
        ExcelReader er = new ExcelReader();
        return er.getExcelData();
    }
    @Test(dataProvider = "credentials")
    public void trySignIn(String name,String pass){
        sign = new SignInPage(driver);
        product = new ProductsPage(driver);
        sign.signIn(name, pass);
        Assert.assertTrue(product.signInSuccessful());
    }


}
