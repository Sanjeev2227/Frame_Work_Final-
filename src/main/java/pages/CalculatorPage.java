package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(className="devsite-search-form")
    private WebElement devSiteSearch;
    //private By devSiteSearch = By.className("devsite-search-form");
    @FindBy(xpath="//input[@class='devsite-search-field devsite-search-query']")
    private WebElement textForGoogleSearch;
                //private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");
    @FindBy(xpath="//div[@class='gs-title']//b[contains(text(),'Google Cloud Pricing Calculator')]")
    private WebElement switchToCalculator;

    //private By switchToCalculator = By.xpath("//div[@class='gs-title']//b[contains(text(),'Google Cloud Pricing Calculator')]");
    @FindBy(xpath="//iframe[contains(@name,'goog_')]")
      WebElement newFirstFrame;

    //private By newFirstFrame = By.xpath("//iframe[contains(@name,'goog_')]");
    @FindBy(xpath="//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']")
    private WebElement instancesField;

    // private By instancesField = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");
   @FindBy(xpath="//md-select[@name='series']/parent::md-input-container")
   private WebElement seriesOfMachine;
    // private By seriesOfMachine = By.xpath("//md-select[@name='series']/parent::md-input-container");
@FindBy(xpath="//md-option[@value='n1']")
    private WebElement seriesOfMachineModel;

    // private By seriesOfMachineModel = By.xpath("//md-option[@value='n1']");
    @FindBy(xpath="//label[text()='Machine type']/parent::md-input-container")
    private WebElement machineType;
    //private By machineType = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    @FindBy(xpath="//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")
    private WebElement computeEngine;
    //private By computeEngine = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
@FindBy(xpath="//md-checkbox[@aria-label='Add GPUs']")
    private WebElement gpusCheckBox;
    //private By gpusCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
@FindBy(xpath="//md-select[@placeholder='GPU type']")
    private WebElement gpuType;
    // private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
@FindBy(xpath="//md-option[@value='NVIDIA_TESLA_V100']")
    private WebElement gpuTypeModel;
    //private By gpuTypeModel =By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
@FindBy(xpath="//md-select[@placeholder='Number of GPUs']")
    private WebElement numberOfGpus;
    //private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
@FindBy(css="md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]")
    private WebElement numberOfGpusModel;
    //private By numberOfGpusModel = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
  @FindBy(xpath="//md-select[@placeholder='Local SSD']")
  private WebElement localSsd;
   // private By localSsd = By.xpath("//md-select[@placeholder='Local SSD']");
@FindBy(xpath="//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']")
    private WebElement localSsdModel;
    //private By localSsdModel = By.xpath("//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']");
   @FindBy(xpath="//md-select[@placeholder='Datacenter location']")
   private WebElement dataCenterLocation;
    //private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");
  @FindBy(css="md-select-menu[class='md-overflow']" + " md-option[value='europe-west3'][ng-repeat*='fullRegionList']")
  private WebElement dataCenterLocationInFrankfurt;
   // private By dataCenterLocationInFrankfurt = By.cssSelector("md-select-menu[class='md-overflow']" + " md-option[value='europe-west3'][ng-repeat*='fullRegionList']");

    @FindBy(xpath="//md-select[@placeholder='Committed usage']")
    private WebElement committedUsage;

    // private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");

@FindBy(css = "div[class='md-select-menu-container md-active md-clickable']" + " md-option[value='1'][class='md-ink-ripple']")
    private WebElement oneYearUsage;
    //private By oneYearUsage = By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" + " md-option[value='1'][class='md-ink-ripple']");
   @FindBy(xpath="//button[@aria-label='Add to Estimate']")
   private WebElement addToEstimateButton;
    // private By addToEstimateButton = By.xpath("//button[@aria-label='Add to Estimate']");
    private By informationInVmClassIsRegular = By.xpath("//div[contains (text(),'Provisioning model: Regular')]");
    private By InformationInInstanceTypeIncludeN1Standard8 =
            By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");

    private By localSsdSpace2x375Gib = By.xpath("//div[contains (text(),'Local SSD: 2x375 GiB')]");

    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");


    public void openCloudPage() {
        driver.get("https://cloud.google.com");
    }

    public void goToGoogleCloudPlatformPricingCalculatorPage(String keyForCalculatorPageOpening) throws InterruptedException {
        devSiteSearch.click();
     //   WebElement textForGoogleSearch = driver.findElement(googleSearch);
        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keyForCalculatorPageOpening);
        textForGoogleSearch.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        switchToCalculator.click();
    }

    public CalculatorPage sendKeyInToNumberOfInstancesField(String keyForNumberOfInstances) throws InterruptedException {
        newFirstFrame.click();
        driver.switchTo().frame(newFirstFrame);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);
      //  WebElement numberOfInstancesField = driver.findElement(instancesField);
        instancesField.sendKeys(keyForNumberOfInstances);
        //Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectSeriesOfMachine() throws InterruptedException {

        seriesOfMachine.click();
        Thread.sleep(3000);
        seriesOfMachineModel.click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectMachineType() throws InterruptedException {
        machineType.click();
        Thread.sleep(5000);
        computeEngine.click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage clickAddGpusCheckBox() throws InterruptedException {
        gpusCheckBox.click();
        Thread.sleep(5000);
        return this;
    }



    public CalculatorPage selectGpuType() throws InterruptedException {
        gpuType.click();
        Thread.sleep(5000);
        gpuTypeModel.click();
        Thread.sleep(2000);
        return this;
    }
    public CalculatorPage selectNumberOfGpus() throws InterruptedException {
        numberOfGpus.click();
        Thread.sleep(5000);
        numberOfGpusModel.click();
        Thread.sleep(5000);
        return this;
    }
    public CalculatorPage selectLocalSsd() throws InterruptedException {
        localSsd.click();
        Thread.sleep(5000);
        localSsdModel.click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectDataCenterLocation() throws InterruptedException {
        dataCenterLocation.click();
        Thread.sleep(5000);
        dataCenterLocationInFrankfurt.click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectCommittedUsage() throws InterruptedException {
        committedUsage.click();
        Thread.sleep(5000);
        oneYearUsage.click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage pushAddToEstimate() throws InterruptedException {
        addToEstimateButton.click();
        Thread.sleep(5000);
        return this;
    }

   public boolean checkInformationInVmClassIsRegular() {

       WebElement E = driver.findElement(informationInVmClassIsRegular);
       return E.isDisplayed();
    }
   public boolean checkInformationInInstanceTypeIncludeN1Standard8()
   {
        WebElement E = driver.findElement(InformationInInstanceTypeIncludeN1Standard8);
       return E.isDisplayed();
   }

    public boolean checkRegionIsFrankfurt() {

        WebElement E = driver.findElement(regionIsFrankfurt);
        return E.isDisplayed();
   }

   public boolean checkLocalSsdSpace2x375Gib() {

        WebElement E = driver.findElement(localSsdSpace2x375Gib);
       return E.isDisplayed();
   }

    public boolean checkCommitmentTermOneYear() {

        WebElement E = driver.findElement(commitmentTermOneYear);
        return E.isDisplayed();

    }
}
