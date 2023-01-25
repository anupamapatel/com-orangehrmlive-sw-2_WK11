package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){ openBrowser(baseurl); }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //Click on Login page
        WebElement Forgotlink =driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        Forgotlink.click();

        WebElement resetlink =driver.findElement(By.xpath("//button[@type='submit']"));
        String actualText=resetlink.getText();
        String expectedText="Reset Password";
        Assert.assertEquals(expectedText,actualText);
    }
    @After
    public void Close(){
        driver.close();
    }

}
