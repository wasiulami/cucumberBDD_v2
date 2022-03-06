package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class signUpPage extends setup{
    public signUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }
    @FindBy(how= How.XPATH, using = "//input[@name='firstName']")
    public WebElement firstNameTabLocator;
    @FindBy(how= How.XPATH, using = "//input[@name='lastName']")
    public WebElement lastNameTabLocator;
    @FindBy(how= How.XPATH, using = "//input[@name='email']")
    public WebElement emailTabLocator;
    @FindBy(how= How.XPATH, using = "//input[@name='password']")
    public WebElement passwordTabLocator;
    @FindBy(how= How.XPATH, using = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordTabLocator;
    @FindBy(how= How.XPATH, using = "//select[@name='month']")
    public WebElement monthTabLocator;
    @FindBy(how= How.XPATH, using = "//select[@name='day']")
    public WebElement dayTabLocator;
    @FindBy(how= How.XPATH, using = "//select[@name='year']")
    public WebElement yearTabLocator;
    @FindBy(how= How.XPATH, using = "//input[@id='male']")
    public WebElement maleRadioLocator;
    @FindBy(how= How.XPATH, using = "//input[@id='female']")
    public WebElement femaleRadioLocator;
    @FindBy(how= How.XPATH, using = "//input[@id='defaultCheck1']")
    public WebElement agreeCheckmarkboxLocator;
    @FindBy(how= How.XPATH, using = "//button[@type='submit']")
    public WebElement createAccountButtonSignupLocator;
    @FindBy(how= How.XPATH, using = "//a[@href='http://qa.taltektc.com']")
    public WebElement loginLinkLocator;
    public void fillFirstName(String firstName){
        firstNameTabLocator.sendKeys(firstName);
    }
    public void fillLastname(String lastName){
        lastNameTabLocator.sendKeys(lastName);
    }
    public void fillemail(String email){
        emailTabLocator.sendKeys(email);
    }
    public void fillpassword(String password){
        passwordTabLocator.sendKeys(password);
    }
    public void fillConfirmPassword(String confirmPassword){
        confirmPasswordTabLocator.sendKeys(confirmPassword);
    }
    public void selectMonth(String month){
        Select sel= new Select(monthTabLocator);
        sel.selectByVisibleText(month);
    }
    public void selectDay(String day){
        int intDay = Integer.parseInt(day);
        Select sel = new Select(dayTabLocator);
        sel.selectByIndex(intDay-1);
    }
    public void selectYear(String year){
        Select sel = new Select(yearTabLocator);
        sel.selectByValue(year);
    }
    public void selectGender(String gender){
        if(gender.equalsIgnoreCase("male")){
            maleRadioLocator.click();
        }
        if(gender.equalsIgnoreCase("female")){
            femaleRadioLocator.click();
        }
    }
    public void clickingagreeCheckbox(){
        agreeCheckmarkboxLocator.click();
    }
    public void clickingCreateAccountSignUpbutton(){
        createAccountButtonSignupLocator.click();
    }
    public void clickingLoginLink(){
        loginLinkLocator.click();
    }



}
