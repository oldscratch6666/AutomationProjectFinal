package tests;

import helperMethods.WindowMethods;
import objectData.LoginObject;
import objectData.URLObject;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import sharedData.SharedData;

import static java.sql.DriverManager.getDriver;

public class LoginTest extends SharedData {

    @Test
    public void testMethod(){

        LoginObject testData = new LoginObject("src/test/resources/testData/LoginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginUserStandard(testData);

        URLObject testData1 = new URLObject("src/test/resources/testData/URLData.json");
        WindowMethods windowMethods = new WindowMethods(getDriver());
        windowMethods.checkURLProducts(testData1);

        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.hamburgerMenu();
        productsPage.logout();


    }

}

