package helperMethods;

import loggerUtility.LoggerUtility;
import lombok.AllArgsConstructor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@AllArgsConstructor
public class PageMethods {
    public WebDriver driver;


    public void scrollPage(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")", "");
    }


}
