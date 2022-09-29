package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(xpath = "//input[@id='login-username']")
    WebElement Username;

    @FindBy(xpath = "//input[@id='login-password']")
    WebElement Password;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement Login;

    @FindBy(xpath = "//a[@class='button ']")
    WebElement ForgotPassword;

    // involvement of driver is done by constructor
       public Login(WebDriver driver)
        {
            PageFactory.initElements(driver,this);
        }

        public void setUsername(String username)
        {
        Username.sendKeys(username);
        }
        public void setPassword(String password)
        {
        Password.sendKeys(password);
        }
        public void setLogin()
        {
            Login.click();
        }
        public void setForgotPassword()
        {
            ForgotPassword.click();
        }
}
