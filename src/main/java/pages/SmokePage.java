package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmokePage extends BasePage {
    @FindBy(xpath = "//div[@class='devsite-top-logo-row-wrapper-wrapper']")
    WebElement header;

    @FindBy(xpath="//iframe[contains(@name,'goog_')]")
    WebElement newFirstFrame;

   @FindBy(xpath="//div[@class='md-toolbar-tools flex-gt-sm-50']//h2[text()='Google Cloud Pricing Calculator']")
    WebElement elem;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']//h2[@class='md-title']")
    WebElement Instance;



    public SmokePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void testGooglePageAvailability() {

        driver.getTitle().contains("Google Cloud");
        System.out.println(driver.getTitle().contains("Google"));
    }
    public boolean PageTitleVisibility()
    {
        System.out.println(header);
        WebElement head = header;

        System.out.println(head.isDisplayed());
        return head.isDisplayed();

    }

public boolean CalculatorPageTitle() throws InterruptedException
{
    driver.get("https://cloud.google.com/products/calculator");
    newFirstFrame.click();
    driver.switchTo().frame(newFirstFrame);
    driver.switchTo().frame("myFrame");
    Thread.sleep(5000);

       System.out.println(elem.getText());
    System.out.println(elem.isDisplayed());
    //Assert.assertEquals(elem.getText(),"Google Cloud Pricing Calculator");

    return elem.isDisplayed();
}
    public boolean InstanceTitle() throws InterruptedException
    {
        driver.get("https://cloud.google.com/products/calculator");
        newFirstFrame.click();
        driver.switchTo().frame(newFirstFrame);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);
        System.out.println(Instance.getText());
        System.out.println(Instance.isDisplayed());
              return Instance.isDisplayed();
    }
}
