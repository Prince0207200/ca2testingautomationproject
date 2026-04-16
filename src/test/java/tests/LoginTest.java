package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void testLogin() {

        // Setup Chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demowebshop.tricentis.com/");

        // Create object of LoginPage
        LoginPage lp = new LoginPage(driver);

        // Perform login
        lp.login("test@test.com", "123456");

        // Wait 3 sec (just to see result)
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        // Close browser
        driver.quit();
    }
}