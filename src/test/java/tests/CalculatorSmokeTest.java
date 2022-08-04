package tests;

import org.testng.annotations.Test;

public class CalculatorSmokeTest extends BaseTest {
    @Test
    public void isPageVisible() {
        SmokeTestPage.testGooglePageAvailability();

    }

    @Test
    public void isPageTitleVisible() {

        SmokeTestPage.PageTitleVisibility();
        System.out.println(true);
    }

    @Test
    public void calculatorPageHeaderTest() throws InterruptedException
    {
        SmokeTestPage.CalculatorPageTitle();
        System.out.println(true);

    }
    @Test
    public void InstanceTitle() throws InterruptedException
    {
        SmokeTestPage.InstanceTitle();
        System.out.println(true);

    }
}
