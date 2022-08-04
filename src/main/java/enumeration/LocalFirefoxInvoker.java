package enumeration;

import implenentation.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LocalFirefoxInvoker implements WebDriverInvoker
{
        @Override
        public WebDriver invokeWebDriver() {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions()
                    .addPreference("browser.startup.page", 1);
            options.setCapability("marionette",true);

            return new FirefoxDriver(options);
        }
}

