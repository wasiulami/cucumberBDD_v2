package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profilePage extends setup {


    public profilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement welcomeText;

    public void verifyWelcomeTextInProfilePage(){
        String act = welcomeText.getText();
        String exp = "Welcome to TalentTek";
        Assert.assertEquals(act, exp);
    }


}