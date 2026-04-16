package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // ✅ Constructor (THIS FIXES YOUR ERROR)
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By loginLink = By.linkText("Log in");
    By email = By.id("Email");
    By password = By.id("Password");
    By loginBtn = By.xpath("//input[@value='Log in']");

    // Actions
    public void login(String user, String pass) {
        driver.findElement(loginLink).click();
        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}