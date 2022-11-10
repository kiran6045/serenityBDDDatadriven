package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import starter.navigation.NavigateTo;

public class DPages extends PageObject {

    static final Logger log = Logger.getLogger(DPages.class);
    @FindBy(xpath = "//input[@name='q']")
    private static WebElementFacade searchbox;


    public static void enterDataInSearchBox(String value) {
        try {
            searchbox.sendKeys(value);
            log.info("entered value in the textbox");
        }
        catch (Exception e)
        {
            System.out.print(e);
        }

    }

    public static void clickOnEnterbutton() {
        try {
            log.info("Clicked on enter button");
            searchbox.sendKeys(Keys.ENTER);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }

    }


}
