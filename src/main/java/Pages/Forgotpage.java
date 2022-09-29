package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpage {

    @FindBy(xpath = "//input[@id='name']")
    WebElement Name;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement Submit;

    @FindBy(xpath = "//a[text()='Dashboard']")
    WebElement Dashboard;


   public Forgotpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void setForgotpassword(String name)
    {
        Name.sendKeys("name");
        Submit.click();
    }

    public void setDashboard()
    {
        Dashboard.click();
    }
}
