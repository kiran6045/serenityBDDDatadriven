package starter.stepdefinitions;

import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import starter.pages.DPages;
import starter.pages.Results;

public class EndUsersSteps {

    static final Logger log = Logger.getLogger(EndUsersSteps.class);
    DPages dPages;
    Results results;

    @Step
    public  void search_Keyword(String value)
    {
        DPages.enterDataInSearchBox(value);
        log.info("user called to enter the value in textbox");
    }
    @Step
    public  void click_Enter()
    {
        DPages.clickOnEnterbutton();
        log.info("user called to click after entering");
    }
    @Step
    public  void clicksonLinks()
    {
        results.clickOnLinksResultsPages();
        log.info("user called to click on all the links available in Page after entering");
    }

}
