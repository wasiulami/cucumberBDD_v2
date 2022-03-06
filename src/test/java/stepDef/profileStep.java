package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;
import pageObject.profilePage;

public class profileStep extends setup {

    profilePage pp = new profilePage(driver);

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
        pp.verifyWelcomeTextInProfilePage();
    }


}