package steps;

import io.cucumber.java8.En;
import pages.Page;
import utils.Driver;

import java.time.Duration;

public class StepDefs extends Page implements En {


    public StepDefs() {


        Given("^user is on the the url \"([^\"]*)\"$", (final String url) -> getUrl(url));

        When("^user click on loginIn$", () ->clickSignInLink());

        And("^user enters email \"([^\"]*)\"$", (String email) ->enterEmail(email));

        And("^user enters password \"([^\"]*)\"$", (String password) ->enterPassword(password));

        And("^user clicks on SignIn button$", () -> clickSubmitButton());

        //Then("^home page should be displayed$", () ->
        Given("^user navigates to weather$", () -> clickWeatherLink());

        When("^user searches \"([^\"]*)\"$", (String location) -> enterSearchLocation(location));

        And("^user click on search$", () -> clickSearchButton());

        //Then("^location should be displayed$", () ->
        Given("^user is logged in$", () ->{});
        When("^user have navigated to weather$", () -> clickWeatherLink());

        And("^user have searched for weather \"([^\"]*)\"$", (String location) -> enterSearchLocation(location));

        And("^user clicked on search$", () ->clickSearchButton());

        And("^user selects preferred location$", () -> clickPreferredLoc());
        And("^user can adds weather to locations$", () -> clickAddLocation());



        //Then("^location should be added$", () -> {
        //});



    }
}
