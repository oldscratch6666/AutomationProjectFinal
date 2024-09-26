package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "react-burger-menu-btn")
    public WebElement hamburgerMenuElement;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutElement;

    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCartElement;

    @FindBy(xpath = "//span[@class = 'shopping_cart_badge']")
    public WebElement shoppingCartBadgeElement;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartSLBElement;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeFromCartSLBElement;


    public void hamburgerMenu(){
        elementsMethod.clickElement(hamburgerMenuElement);
        LoggerUtility.info("The user clicks on the Hamburger menu");
    }

    public void logout(){
        elementsMethod.clickElement(logoutElement);
        LoggerUtility.info("The user clicks on the logout button");
    }

    public void navigateToShoppingCart(){
        elementsMethod.clickElement(shoppingCartElement);
        LoggerUtility.info("The user clicks on the shopping cart button");

    }

    public void addToCartSLB(){
        elementsMethod.clickElement(addToCartSLBElement);
        LoggerUtility.info("The user adds to cart the Sauce Labs Backpack");
        Assert.assertEquals(removeFromCartSLBElement.getText(), "Remove");
        LoggerUtility.info("The Add to cart button turns into Remove button");
        Assert.assertEquals(shoppingCartBadgeElement.getText(), "1");
        LoggerUtility.info("The cart has 1 item displayed");
    }

    public void shoppingCartStatus() {
        Boolean isAbsent = true;
        List <WebElement> elements = shoppingCartElement.findElements(By.xpath("//span[@class = 'shopping_cart_badge']"));
        if (elements.isEmpty()) {
            isAbsent = false;
            LoggerUtility.info("The shopping cart is empty " + isAbsent);
        }
        else {
            LoggerUtility.info("The shopping cart has items " + isAbsent);
        }
    }
}
