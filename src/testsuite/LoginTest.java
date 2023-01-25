package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {
        //enter email id and password field
        WebElement UsernameField = driver.findElement(By.xpath("//input[@name='username']"));
        UsernameField.sendKeys("Admin");
        WebElement PasswordField = driver.findElement(By.xpath("//input[@type='password']"));
        PasswordField.sendKeys("admin123");
        WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        Loginbutton.click();
        WebElement Logoutlink =driver.findElement(By.xpath("//a[text()='Logout']"));
        String actualText= Logoutlink.getText();
        String expectedText="Logout";
        Assert.assertEquals(expectedText,actualText);
    }

    }
