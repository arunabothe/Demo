package Regression;

import Pages.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
     public void login()
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://stock.scriptinglogic.net/");
            // created object of class and pass parameter as constructor passed
            Login login= new Login(driver);

            login.setUsername("admin");
            login.setPassword("admin");
             login.setLogin();
        }
}
