package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.loginPage;
import pageObject.profilePage;

public class loginStep extends setup {

    loginPage lp = new loginPage(driver);
    profilePage pp = new profilePage(driver);

    @Given("I am at TalentTEK homepage")
    public void iAmAtTalentTEKHomepage() {
        lp.verifyHomepageTitle();
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        lp.enterEmailAddress(Hook.existingStudentEmail);
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        lp.enterEmailPassword(Hook.existingStudentPass);
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        lp.clickLoginButton();
    }

    @And("I logged into my student account")
    public void iLoggedInIntoTalentTEKAccount() {
        lp.enterEmailAddress(Hook.existingStudentEmail);
        lp.enterEmailPassword(Hook.existingStudentPass);
        lp.clickLoginButton();
        pp.verifyWelcomeTextInProfilePage();
    }

    @And("I enter valid {string} address")
    public void enterDifferentSetsOfEmailAddress(String email) {
        lp.enterDifferentSetsOfEmail(email);
    }

    @And("I enter valid {string}")
    public void iEnterDifferentSetsOfValidPassword(String password) {
        lp.enterDifferentSetsOfPassword(password);
    }

    @And("I enter student valid {string} address")
    public void iEnterStudentValidEmailAddress(String email) {
        lp.emailLocator.sendKeys(email);
    }

    @And("I enter student valid {string}")
    public void iEnterStudentValidPassword(String pass) {
        lp.passwordLocator.sendKeys(pass);
    }
}