package Factory;

import Holder.PropertyHolder;
import converters.SupportedBrowserConverter;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public static WebDriver driver;
    public static WebDriver getWebDriver() {

                driver = SupportedBrowserConverter.valueOfWebBrowser(
                        new PropertyHolder().readProperty("browser"))
                .getWebDriver();
                return driver;

    }
}