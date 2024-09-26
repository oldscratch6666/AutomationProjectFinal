package tests;

import objectData.LoginObject;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import sharedData.SharedData;

import static java.sql.DriverManager.getDriver;

public class AddProductAndRemoveFromCartTest extends SharedData {

    @Test
    public void testMethod(){

        LoginObject testData = new LoginObject("src/test/resources/testData/LoginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginUserStandard(testData);

        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.addToCartSLB();
        productsPage.shoppingCartStatus();



    }

}
