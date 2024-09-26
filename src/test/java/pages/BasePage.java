package pages;

import helperMethods.ElementsMethod;
import helperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected ElementsMethod elementsMethod;
    protected WindowMethods windowMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(driver);
        windowMethods = new WindowMethods(driver);
        PageFactory.initElements(driver, this);
    }
}
