package Regression;

import Pages.Forgotpage;
import Pages.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgotTest {

        @Test(priority = 0)
        public void forgotTest() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://stock.scriptinglogic.net/");

            // need to click on forgot password so object of login
            Login login = new Login(driver);
            login.setForgotPassword();
            Thread.sleep(3000);

            Forgotpage forgot = new Forgotpage(driver);
            forgot.setDashboard();



        }


}
