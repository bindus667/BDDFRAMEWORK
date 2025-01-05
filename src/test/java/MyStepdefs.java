import Commonfunctions.Driverhelp;
import Pages.Signinpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MyStepdefs {
    @Given("I open the browser and eter url")
    public void iOpenTheBrowserAndEterUrl() throws IOException, InterruptedException {
        Driverhelp.launchBrowser();
        Driverhelp.getURL();
    }

    @When("I enter username and password")
    public void iEnterUsernameAndPassword() {


    }

    @And("I click o the sigin")
    public void iClickOTheSigin() {

    }

    @Then("I should be able to see homepage")
    public void iShouldBeAbleToSeeHomepage() {

    }
}
