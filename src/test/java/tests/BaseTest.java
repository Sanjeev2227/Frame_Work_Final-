package tests;

import Factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import pages.CalculatorPage;
import pages.SmokePage;
import tests.util.TestListener;

import java.time.Duration;

import static org.testng.ITestResult.FAILURE;


public class BaseTest {
    private WebDriver driver;
    protected CalculatorPage calculatorPage;

    protected SmokePage SmokeTestPage;

    @BeforeTest
    public void setDriver(){
       driver= new WebDriverFactory().getWebDriver();

       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
        /*calculatorPage.openCloudPage();*/
        SmokeTestPage = new SmokePage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(ITestResult iTestResult)
    {

        if (FAILURE== iTestResult.getStatus()) {
            new TestListener().saveScreenshots(driver);
        }
       // driver.close();

    }
}
