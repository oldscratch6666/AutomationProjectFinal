package pages;

import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import objectData.URLObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement login;

    public void loginUserStandard(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernameStandard());
        LoggerUtility.info("The user fills the standard username value: " + testData.getUsernameStandard());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

}
