package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import starter.utility.Elementutil;


import java.util.List;
import java.util.stream.Collectors;

public class Results  extends PageObject {

    static final Logger log = Logger.getLogger(Results.class);
    By links = By.partialLinkText("https://www.");

    @Step
    public void  clickOnLinksResultsPages() {
        List<WebElementFacade> allLinks = null;
        try {

            allLinks=$$(links);
            log.info("Collected Available links");
            for(WebElementFacade link:allLinks)
            {
                link.click();
                getDriver().navigate().back();
            }
            log.info("Clicked on All the links");

            System.out.println(allLinks);

        } catch (Exception e) {
            //print error message if web Element is not found
            System.out.println("Web Element is not found in Page");
            System.out.println(e);

        }
    }
}
