package sharedData;

import loggerUtility.LoggerUtility;
import lombok.Getter;
import objectData.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

import java.time.Duration;

@Getter
public class SharedData {

    private WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment(){

        boolean ci_cd = Boolean.parseBoolean(System.getProperty("CI_CD"));
        if (ci_cd) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options);
        }else{
            driver = new ChromeDriver();
        }

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser is opened with success");

    }



    @AfterMethod
    public void clearEnvironment(ITestResult result){
        if (!result.isSuccess()) {
            LoggerUtility.error(result.getThrowable().getMessage());
        }
        driver.quit();
        LoggerUtility.info("The browser is closed with success");

    }

}
