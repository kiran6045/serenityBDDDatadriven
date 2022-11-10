package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.google.com/")
public  class GoogleHomePage extends PageObject {

    public WebDriver getdriver() {

        WebDriver driver = getDriver();
        return driver;
    }
}
