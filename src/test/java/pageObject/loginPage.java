package pageObject;

import base.setup;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepDef.Hook;

public class loginPage extends setup {
    // anything from login page
    // UI web elements

    public loginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "//input[@name='email']")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;
    @FindBy(how= How.XPATH, using = "//input[@value='Log In']")
    public WebElement loginButtonLoc;
    @FindBy(how= How.PARTIAL_LINK_TEXT, using = "Create")
    public WebElement createAccButtonLocator;

    public void verifyHomepageTitle(){
        String act = driver.getTitle(); // comes development
        String exp = "Sign In"; // comes from BA
        Assert.assertEquals(exp, act);
    }

    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }

    public void enterDifferentSetsOfEmail (String email){
        if(StringUtils.containsIgnoreCase(email,"fakeEmail1")) {
            emailLocator.sendKeys(Hook.existingStudentEmail);
        } if(StringUtils.containsIgnoreCase(email,"fakeEmail2")) {
            emailLocator.sendKeys(Hook.existingStudentEmail2);
        }
    }

    public void enterEmailPassword(String password){
        passwordLocator.sendKeys(password);
    }

    public void enterDifferentSetsOfPassword (String email){
        if(StringUtils.containsIgnoreCase(email,"pass1")) {
            passwordLocator.sendKeys(Hook.existingStudentPass);
        } if(StringUtils.containsIgnoreCase(email,"pass2")) {
            passwordLocator.sendKeys(Hook.existingStudentPass);
        }
    }

    public void clickLoginButton(){
        loginButtonLoc.click();
    }
    public void clickCreateButton(){
        createAccButtonLocator.click();
    }



}