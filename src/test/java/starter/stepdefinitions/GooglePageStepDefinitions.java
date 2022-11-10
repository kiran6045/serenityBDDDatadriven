package starter.stepdefinitions;

import io.cucumber.java.af.En;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import starter.navigation.NavigateTo;
import starter.utility.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class GooglePageStepDefinitions {

    static final Logger log = Logger.getLogger(GooglePageStepDefinitions.class);
    @Steps
    NavigateTo navigateTo;

    @Steps
    EndUsersSteps endUsersSteps;

    @Given("Browser is launched and google search page is displayed")
    public void browser_is_launched_and_google_search_page_is_displayed() {

        navigateTo.theGoogleHomePage();
        log.info(" opened google browser successfully");

    }

    @When("Enter the data and {string} for {int}")
    public void enter_the_data_and_for(String Sheetname, int rownumber) throws IOException, InvalidFormatException {
        ExcelReader excelReader = new ExcelReader();
        List<Map<String , String>> testdata=excelReader.getData("src/test/resources/Testdata/Data.xlsx", Sheetname);
        log.info("data is read from excel");
        String keywordmatch = testdata.get(rownumber).get("Keyword");
        System.out.println("keywordmatch  "+keywordmatch);
        if(keywordmatch.equalsIgnoreCase("search"))
        {

            String searchdata=testdata.get(rownumber).get("Test_data");
            System.out.println("searchdata   "+searchdata);
            endUsersSteps.search_Keyword(searchdata);
            endUsersSteps.click_Enter();
            log.info("Entered required data and clicked enter successfully");
        }



    }
    @Then("Click on the links available on the screen")
    public void click_on_the_links_available_on_the_screen() {
     endUsersSteps.clicksonLinks();
        log.info("Executed succesfully after clicking on all the links");
    }

}
