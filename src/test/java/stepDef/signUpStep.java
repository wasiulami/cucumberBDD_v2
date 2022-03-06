package stepDef;

import base.setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObject.loginPage;
import pageObject.signUpPage;

public class signUpStep extends setup {
    loginPage lp = new loginPage(driver);
    signUpPage sp = new signUpPage(driver);


    @And("I create a brand new student account")
    public void iCreateABrandNewStudentAccount(DataTable table) {
        lp.clickCreateButton();
        sp.fillFirstName(table.cell(1,0));
        sp.fillLastname(table.cell(1,1));
        sp.fillemail(table.cell(1,2));
        sp.fillpassword(table.cell(1,3));
        sp.fillConfirmPassword(table.cell(1,3));
        sp.selectMonth(table.cell(1,4));
        sp.selectDay(table.cell(1,5));
        sp.selectYear(table.cell(1,6));
        sp.selectGender(table.cell(1,7));
        sp.clickingagreeCheckbox();
        sp.clickingCreateAccountSignUpbutton();

    }

    @And("I click on Login link")
    public void iClickOnLoginLink() {
        sp.clickingLoginLink();
    }

    @When("I login with brand new student credentials")
    public void iLoginWithBrandNewStudentCredentials(DataTable table) {
        lp.enterEmailAddress(table.cell(1,2));
        lp.enterEmailPassword(table.cell(1,3));
        lp.clickLoginButton();
    }
}
