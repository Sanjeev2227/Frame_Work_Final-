package tests;

import Service.CalculatorService;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class CalculatorPageTests extends BaseTest {
    @Test
    public void checkInformationInVmClassString() throws InterruptedException, IOException {
        calculatorPage.openCloudPage();
        calculatorPage.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        calculatorPage
                .sendKeyInToNumberOfInstancesField(new CalculatorService().getCalculatorData().getInstancesField())
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectGpuType()
                .selectNumberOfGpus()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate();

    }

    @Test(dependsOnMethods = "checkInformationInVmClassString")
    public void checkInformationInVmClassStrings()
    {

        SoftAssert softAssert=new SoftAssert();
        boolean x = calculatorPage.checkInformationInVmClassIsRegular();
        boolean y = calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
        boolean z = calculatorPage.checkRegionIsFrankfurt();
        boolean a =calculatorPage.checkLocalSsdSpace2x375Gib();
        boolean b = calculatorPage.checkCommitmentTermOneYear();

        softAssert.assertEquals(x,true);
        softAssert.assertEquals(y,true);
        softAssert.assertEquals(z,true);
        softAssert.assertEquals(a,true);
        softAssert.assertEquals(b,true);

//        System.out.println(calculatorPage.hashCode());
        //calculatorPage.checkInformationInVmClassIsRegular();

    }
   @Test(dependsOnMethods = "checkInformationInVmClassString")
   public void checkInformationInInstanceTypeIncludeN1Standard8()
   {
     calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
   }
  @Test(dependsOnMethods = "checkInformationInVmClassString")
    public void checkRegionIsFrankfurt()
    {
      calculatorPage.checkRegionIsFrankfurt();
   }
   @Test(dependsOnMethods = "checkInformationInVmClassString")
   public void checkLocalSsdSpace2x375Gib()
  {
      calculatorPage.checkLocalSsdSpace2x375Gib();
  }
  @Test(dependsOnMethods = "checkInformationInVmClassString")
   public void checkCommitmentTermOneYear()
  {
       calculatorPage.checkCommitmentTermOneYear();
  }
}
