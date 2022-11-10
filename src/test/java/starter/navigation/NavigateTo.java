package starter.navigation;

import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class NavigateTo {

    static final Logger log = Logger.getLogger(NavigateTo.class);
    GoogleHomePage googleHomePage;

    @Step("Open the google home page")
    public void theGoogleHomePage() {
        PropertyConfigurator.configure("log4j.properties");
        googleHomePage.open();
        log.info("google browser Opened successfully");
       WebDriver driver=googleHomePage.getdriver();
    }
}
