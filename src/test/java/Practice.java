import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Practice {
    //Open the site "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp&quot;
    // then click 'Help', 'Privacy' and 'Terms'
    //switch to each window & print the  title
    @Test
    public void question1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp&quot");
        driver.findElement(By.linkText("Terms")).click();
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();

        Set<String> windows= driver.getWindowHandles(); //[parent1, privacy, help, terms]
        Iterator<String> it = windows.iterator();
        //windows open
        String parentId = it.next();
        String privacyWindowsID = it.next();
        String helpWindowsID = it.next();
        String termsWindowsID = it.next();

        driver.switchTo().window(termsWindowsID);
        System.out.println("Page title of term windows: ");
        System.out.println(driver.getTitle());

        driver.switchTo().window(helpWindowsID);
        System.out.println("Page title of help windows: ");
        System.out.println(driver.getTitle());

        driver.switchTo().window(privacyWindowsID);
        System.out.println("Page title of privacy windows: ");
        System.out.println(driver.getTitle());


    }
}
